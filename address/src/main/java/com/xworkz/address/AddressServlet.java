package com.xworkz.address;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/AttachAddress", loadOnStartup = 1)
public class AddressServlet extends HttpServlet {
	public AddressServlet() {
		System.out.println("Address Object is Created");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String no = req.getParameter("no");
		String state = req.getParameter("state");
		String street = req.getParameter("street");
		String city = req.getParameter("city");
		String country= req.getParameter("country");
		req.setAttribute("no", no);
		req.setAttribute("state", state);
		req.setAttribute("street", street);
		req.setAttribute("city", city);
		req.setAttribute("country", country);
		RequestDispatcher dispatcher1 = req.getRequestDispatcher("LastPage.jsp");
		dispatcher1.forward(req, resp);
	}
}
