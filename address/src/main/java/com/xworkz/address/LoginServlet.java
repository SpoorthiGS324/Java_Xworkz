package com.xworkz.address;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        
       

        if (userId.equals("admin")&&password.equals("secret")) {

        	request.setAttribute("userId", userId);
            request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
        } else {
             
        	String errorMsg = "Credential Not Matching";
            request.setAttribute("errorMsg", errorMsg);
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
        

        String no = request.getParameter("no");
        String state = request.getParameter("state");
        String street = request.getParameter("street");
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        request.setAttribute("no", no);
        request.setAttribute("state", state);
        request.setAttribute("street", street);
        request.setAttribute("country", country);
        request.setAttribute("city", city);
    }


    private boolean authenticate(String userId, String password) {
        return "admin".equals(userId) && "Secret".equals(password);
    } {

	
	
    }
}
