package pl.coderslab.web.Homework_03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/servlet_03")
public class Servlet_03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session =request.getSession();
        session.setAttribute("input1", request.getParameter("input1"));
        session.setAttribute("input2", request.getParameter("input2"));
        session.setAttribute("input3", request.getParameter("input3"));
        session.setAttribute("input4", request.getParameter("input4"));
        session.setAttribute("input5", request.getParameter("input5"));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session =request.getSession();
        response.setContentType("text/html");
        if(session.getAttributeNames() == null && session.getAttribute("input1").equals(null)){
            response.getWriter().append("<form action='/servlet_03' method='POST'><br>" +
                    "<input type='text' name='input1'><br>"+
                    "<input type='text' name='input2'><br>"+
                    "<input type='text' name='input3'><br>"+
                    "<input type='text' name='input4'><br>"+
                    "<input type='text' name='input5'><br>"+
                    "<input type='submit'> </form> <br>");
        }else{
            response.getWriter().append("<form action='/servlet_03' method='POST'><br>" +
                    "<input type='text' name='input1' value='" + session.getAttribute("input1")+"'><br>"+
                    "<input type='text' name='input2' value='" + session.getAttribute("input2")+"'><br>"+
                    "<input type='text' name='input3' value='" + session.getAttribute("input3")+"'><br>"+
                    "<input type='text' name='input4' value='" + session.getAttribute("input4")+"'><br>"+
                    "<input type='text' name='input5' value='" + session.getAttribute("input5")+"'><br>"+
                    "<input type='submit'> </form> <br>");
        }
   }
}
