package org.zerock.w1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/haha")
public class HelloServlet extends HttpServlet {
    private String message; //요깃네..

    public void init() {
        message = "good";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        //out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        //out.println("</body></html>");
    }

    public void destroy() {
    }
}