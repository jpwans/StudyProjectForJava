package com.wrox;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jiangqin on 17/3/10.
 */

@WebServlet(
        name = "multiValueParameterServlet",
        urlPatterns = {"/checkboxes"}
)
public class MultiVlaueParameterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.append("<!DOCTYPE html>\r\n")
                .append("<html>\r\n")
                .append("   <head>\r\n")
                .append("       <title>Hello User Application</title>\r\n")
                .append("   </head>\r\n")
                .append("   <body>\r\n")
                .append("       <form action=\"checkboxes\" method=\"POST\">\r\n")
                .append("Select the fruits you like to eat:<br/>\r\n")
                .append("<input type=\"checkbox\" name=\"fruit\" value = \"Banana\"/>")
                .append(" Banana<br/>\r\n")
                .append("<input type=\"checkbox\" name=\"fruit\" value = \"Apple\"/>")
                .append(" Apple<br/>\r\n")
                .append("<input type=\"checkbox\" name=\"fruit\" value = \"Orange\"/>")
                .append(" Orange<br/>\r\n")
                .append("<input type=\"checkbox\" name=\"fruit\" value = \"Guava\"/>")
                .append(" Guava<br/>\n")
                .append("<input type=\"checkbox\" name=\"fruit\" value = \"Kiwi\"/>")
                .append(" Kiwi<br/>\n")
                .append("<input type=\"submit\" value=\"Submit\"/>\r\n")
                .append("       </form>")
                .append("   </body>\r\n")
                .append("<html>\r\n");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] fruits = req.getParameterValues("fruit");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.append("<!DOCTYPE html>\r\n")
                .append("<html>\r\n")
                .append("   <head>\r\n")
                .append("       <title>Hello User Application</title>\r\n")
                .append("   </head>\r\n")
                .append("   <body>\r\n")
                .append("      <h2>Your Selections</h2>");

        if (fruits == null)
            writer.append("     You did not select any fruits.\r\n");
        else
        {
            writer.append("     <ul>\r\n");
            for (String fruit : fruits)
            {
                writer.append("<li>").append(fruit).append("</li>\r\n");
            }
            writer.append("</ul>\r\n");
        }

        writer.append("</body>\r\n")
                .append("</html>\r\n");

    }
}
