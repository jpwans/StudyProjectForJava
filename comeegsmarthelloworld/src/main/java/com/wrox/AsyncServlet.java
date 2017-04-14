package com.wrox;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jiangqin on 17/4/5.
 */
@WebServlet(name = "asyncServlet", urlPatterns = "/async",asyncSupported = true)
public class AsyncServlet extends HttpServlet {
    private static volatile int ID = 1;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final int id;
        synchronized (AsyncServlet.class)
        {
            id = ID++;
        }
        long timeout = req.getParameter("timeout") == null?10_000L : Long.parseLong(req.getParameter("timeout"));

        System.out.println("Entering AsyncServlet.doGet().Request ID = " + id + ", isAsyncStarted = " + req.isAsyncStarted());

        final AsyncContext context = req.getParameter("unwrap") != null ? req.startAsync() : req.startAsync(req,resp);
        context.setTimeout(timeout);

        System.out.println("Starting asynchronous thread. Request ID = " + id + ".");

        AsyncThread thread = new AsyncThread(id,context);
        context.start(thread::doWork);
        System.out.println("Leaving AsyncServlet.doGet().Request ID = " + id + ", isAsyncStarted = " + req.isAsyncStarted());
    }

    private static class AsyncThread
    {
        private final int id;
        private final AsyncContext context;

        public AsyncThread(int id , AsyncContext context)
        {
            this.id = id;
            this.context = context;
        }

        public void doWork(){
            System.out.println("Asynchronous thread started. Request ID = " + this.id + ".");
            try {
                Thread.sleep(5_000L);
            }catch (Exception e){
                e.printStackTrace();
            }

            HttpServletRequest request = (HttpServletRequest)this.context.getRequest();
            System.out.println("Done sleeping. Request ID = " + this.id + ", URL = " + request.getRequestURL() + ".");

            this.context.dispatch("/WEB-INF/jsp/view/async.jsp");
            System.out.println("Asynchronous thread completed. Request ID = " + this.id + ".");
        }
    }
}
