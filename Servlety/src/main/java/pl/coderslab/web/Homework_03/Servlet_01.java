package pl.coderslab.web.Homework_03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet_01")
public class Servlet_01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String choice = request.getParameter("choice");
        double amount = Double.parseDouble(request.getParameter("amount"));
        double course = 0;
        //approach one: good old switch
//        switch (choice){
//            case "EUR_USD" : course = 1.2343;
//                            break;
//            case "USD_EUR" : course = 0.8101;
//                            break;
//            case "EUR_PLN" : course = 4.1689;
//                            break;
//            case "PLN_EUR" : course = 0.2403;
//                            break;
//            case "USD_PLN" : course = 3.3744;
//                            break;
//            case "PLN_USD" : course = 0.2963;
//                            break;
//        }
        //approach two: map
        Map<String, Double> bankMap = new HashMap<>();
        bankMap.put("EUR_USD" , 1.2343);
        bankMap.put("USD_EUR" , 0.8101);
        bankMap.put("EUR_PLN" , 4.1689);
        bankMap.put("PLN_EUR" , 0.2403);
        bankMap.put("USD_PLN" , 3.3744);
        bankMap.put("PLN_USD" , 0.2963);

        course=bankMap.get(choice);

        response.setContentType("text/html");
        response.getWriter().append("Result: " + amount*course);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
