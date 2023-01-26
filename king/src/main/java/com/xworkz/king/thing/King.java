package com.xworkz.king.thing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/king")
public class King extends HttpServlet {

	public King() {
		System.out.println("constructor running : " + getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creating do get method in king ");

		String name = req.getParameter("kingname");
		String region = req.getParameter("kingReginName");
		String nofqueen = req.getParameter("kingnoofquween");
		String dob = req.getParameter("kingDob");
		String dod = req.getParameter("kingdod");

		System.out.println("king name is  : " + name);
		System.out.println("king kingReginName is  : " + region);
		System.out.println("king kingnoofquween is  : " + nofqueen);
		System.out.println("king kingDob is  : " + dob);
		System.out.println("king kingDod is  : " + dod);

		PrintWriter printWriter = resp.getWriter();

		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<span style='color:green;'/>");
		printWriter.print("King name is  : " + name);
		printWriter.print("<br>");
		printWriter.print("<span style='color:blue;'/>");
		printWriter.print("king kingReginName is  : " + region);
		printWriter.print("<br>");
		printWriter.print("<span style='color:yellow;'/>");
		printWriter.print("king kingnoofquween is  : " + nofqueen);
		printWriter.print("<br>");
		printWriter.print("<span style='color:red;'/>");
		printWriter.print("king kingDob is  : " + dob);
		printWriter.print("<br>");
		printWriter.print("<span style='color:brown;'/>");
		printWriter.print("king kingDod is  : " + dod);
		printWriter.print("</body>");
		printWriter.print("</html>");

	}

}
