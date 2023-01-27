package com.xworkz.rambo.thing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/location")
public class Location extends HttpServlet {

	public Location() {
		System.out.println("running " + getClass().getSimpleName());

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Creating Do get Method");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String source = req.getParameter("source");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(email);
		System.out.println(source);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<h1> location is running </h1>");
		if (name.length() > 3 && name.length() <= 200) {
			printWriter.print("<span style='color:green;'/>");
			printWriter.print("Location name  is sucessufully; is :" + name + "<br>");
		} else {
			printWriter.print("<span style='color:red;'/>");
			printWriter.print("Location name  is invalid : is :" + name + "<br>");
		}

		if (email.length() >= 3 && email.length() <= 56) {
			printWriter.print("<span style='color:yellow;'/>");
			printWriter.print("Location email  is sucessufully; is :" + email + "<br>");
		} else {
			printWriter.print("<span style='color:red;'/>");
			printWriter.print("Location email  is invalid  is :" + email + "<br>");
		}

		if (source.length() >= 2 && source.length() <= 30) {
			printWriter.print("<span style='color:blue;'/>");
			printWriter.print("Location source  is sucessufully; is :" + source + "<br>");
		} else {
			printWriter.print("<span style='color:red;'/>");
			printWriter.print("Location source  invalid; is :" + source + "<br>");
		}
		if (destination.length() >= 3 && destination.length() < 60) {
			printWriter.print("<span style='color:brown;'/>");
			printWriter.print("Location destination  is sucessufully; is :" + destination + "<br>");
		} else {
			printWriter.print("<span style='color:red;'/>");
			printWriter.print("Location destination  invalid; is :" + destination + "<br>");
		}
		if (gender.length() > 3 && gender.length() <= 6) {
			printWriter.print("<span style='color:gold;'/>");
			printWriter.print("Location gender  is sucessufully; is :" + gender + "<br>");
		} else {
			printWriter.print("<span style='color:red;'/>");
			printWriter.print("Location gender  invalid; is :" + gender + "<br>");
		}
		printWriter.print("<span style='color:blue;'/>");
		printWriter.print("<a href='index.html'>Home Page</a><br>");
		printWriter.print("<span style='color:green;'/><br>");
		printWriter.print("<a href='location.html'>Back Page</a>");

		printWriter.print("</body>");
		printWriter.print("</html>");
		resp.setContentType("text/html");

	}

}
