package org.zerock.w1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="myServlet",urlPatterns = "/my")
//name은 Servlet의 이름을 직접 지정하는 부분임 !
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {
        response.setContentType("text/html");//
        //응답의 ContentType을 text/html로 두는거임

        PrintWriter out=response.getWriter();
        out.println("<html><body>");
        out.println("<h1>MyServlethello</h1>");
        out.println("</body></html>");

    }
}
