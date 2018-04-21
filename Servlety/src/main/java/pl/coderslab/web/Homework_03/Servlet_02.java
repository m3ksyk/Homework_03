package pl.coderslab.web.Homework_03;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//works with binary.html
@WebServlet("/servlet_02")
public class Servlet_02 extends HttpServlet {
    static boolean isValidBinary(final int input) {
        final String binary = String.valueOf(input);
        return binary.replaceAll("[01]", "").isEmpty() && !binary.startsWith("0");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numStr= request.getParameter("num");
        int num = Integer.parseInt(request.getParameter("num"));

        if(isValidBinary(num)){
            //here using a quicker, easier method
            int result = Integer.parseInt(numStr,2);
            response.getWriter().append(num + " is number " + result);

            //here using the suggested method
            int sum = 0;
            String[] numSplit = numStr.split("");
            for(int i = 0; i < numSplit.length; i++) {
                sum += (Integer.parseInt(numSplit[numSplit.length-i]))*(Math.pow(2,i));
            }
            response.getWriter().append(num + " is number " + sum);


        } else {
            response.getWriter().append("Not binary!");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
