package com.xworkz.message.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Message
 */
@WebServlet(loadOnStartup = 1, name = "sms", urlPatterns = { "/sms" })
public class Message extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Message() {
		super();
		System.out.println("running : " + getClass().getSimpleName());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Creating Message do post method");

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String reson = request.getParameter("reason");
		String address = request.getParameter("address");

		RequestDispatcher dispatcher = request.getRequestDispatcher("Display.jsp");
		request.setAttribute("lname", lname);
		request.setAttribute("fname", fname);
		request.setAttribute("gender", gender);
		request.setAttribute("reason", reson);
		request.setAttribute("address", address);
		dispatcher.forward(request, response);

	}

}
