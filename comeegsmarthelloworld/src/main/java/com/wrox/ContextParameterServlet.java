package com.wrox;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jiangqin on 17/3/13.
 */

@WebServlet(
        name = "contextPatameterServlet",
        urlPatterns = {"/contextParameters"}
)
public class ContextParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext c = this.getServletContext();
        PrintWriter writer = resp.getWriter();
        writer.append("settingOne:").append(c.getInitParameter("settingOne"))
                .append(", settingTwo:").append(c.getInitParameter("settingTwo"));
    }
}

