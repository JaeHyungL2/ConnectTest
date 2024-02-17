package org.zerock.w1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="jh", urlPatterns = "/hi")
public class Aservletjh extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest a1 ,HttpServletResponse a2) throws ServletException, IOException{
        a2.setContentType("text/html"); //이런건뭐지?
        // a2= response a1=request  흠.. 먼저
        PrintWriter out1 = a2.getWriter(); //클래스 임포트한거였군..ㅋ override로 받아와서..가능 언어식으로 잘 매칭해놧네
        out1.println("<에티엠엘><바디>");
        out1.println("<h3>한국어모르네   </h3>");
    }
}

//실행은!  url로 표시로 hi줫으니 ㅋ