package com.xworkz.rambo.thing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/content")
public class Content extends HttpServlet {
	public Content() {
		System.out.println("Running : " + getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creating do get method");
		String name = req.getParameter("name");
		String eamil = req.getParameter("eamil");
		String mobile = req.getParameter("mobile");
		String comment = req.getParameter("comment");

		System.out.println(name);
		System.out.println(eamil);
		System.out.println(mobile);
		System.out.println(comment);

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<h1> Running contact </h1>");
		if (name.length() > 3 && name.length() <= 20) {
			printWriter.print("<span style='color:green;'/>");
			printWriter.print("contact name is  " + name + " <br>");
		} else {
			printWriter.print("<span style='color:red;'/>");
			printWriter.print("name is invalid  :" + name + "<br>");
		}
		if (eamil.length() > 3 && eamil.length() <= 50) {
			printWriter.print("<span style='color:yellow;'/>");
			printWriter.print("contact eamil is  " + eamil + " <br>");
		} else {
			printWriter.print("<span style='color:red;'/>");
			printWriter.print("eamil is invalid  :" + eamil + "<br>");
		}

		Long conversion = Long.parseLong(mobile);

		if (conversion > 8 && conversion <= 10) {
			printWriter.print("<span style='color:yellow;'/>");
			printWriter.print("contact mobile is  " + conversion + " <br>");
		} else {
			printWriter.print("<span style='color:red;'/>");
			printWriter.print("mobile is invalid  :" + conversion + "<br>");
		}

		if (comment.length() > 3 && comment.length() <= 50) {
			printWriter.print("<span style='color:brown;'/>");
			printWriter.print("contact comment is  " + comment + " <br>");
		} else {
			printWriter.print("<span style='color:red;'/>");
			printWriter.print("comment is invalid  :" + comment + "<br>");
		}

		printWriter.print("</body>");
		printWriter.print("</html>");
		printWriter.print("<a href='index.html'>Home Page </a> <br>");
		printWriter.print("<a href='content.html'>Back Page </a> <br>");

		resp.setContentType("text/html");
	}

}
