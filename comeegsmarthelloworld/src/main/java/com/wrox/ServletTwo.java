package com.wrox;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jiangqin on 17/4/5.
 */
@WebServlet(name = "servletTwo", urlPatterns = "/servletTwo")
public class ServletTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entering ServletTwo.doGet()");
        resp.getWriter().write("Servlet Two");
        System.out.println("Leaving ServletTwo.doGet()");
    }
}
