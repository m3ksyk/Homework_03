package pl.coderslab.web.Homework_03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet_06")
//works with numindex.html
public class Servlet_06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        double num3 = Double.parseDouble(request.getParameter("num3"));
        double num4 = Double.parseDouble(request.getParameter("num4"));
        double sum = num1 + num2 + num3 + num4;
        double avg = sum/4;
        double prod = num1 * num2 * num3 * num4;

        response.setContentType("text/html");
        response.getWriter().append("Numbers: <br> - " + num1 + "<br> - " + num2 + "<br> - " + num3 + "<br> - " + num4 +
                "<br>  Average: <br> - " + avg + "<br> Sum: <br> - " + sum + "<br> Product: <br> - " + prod);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
