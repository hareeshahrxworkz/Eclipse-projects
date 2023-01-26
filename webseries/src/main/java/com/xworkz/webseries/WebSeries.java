package com.xworkz.webseries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/series")
public class WebSeries extends HttpServlet {

	public WebSeries() {
		System.out.println("running  : " + getClass().getSimpleName());

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("webseiesname");
		String langauge = req.getParameter("webseieslangauge");
		String epsode = req.getParameter("webseiesepsode");
		String ott = req.getParameter("webseiesOtt");
		String budject = req.getParameter("webseiesbudject");

		System.out.println("Webseries name is : " + name);
		System.out.println("web series langauge" + langauge);
		System.out.println("web series ott : " + ott);
		System.out.println("webseries budject    : " + budject);
		System.out.println("webseries epsode is  : " + epsode);

		PrintWriter writer = resp.getWriter();

		writer.print("<html>");
		writer.print("<body>");
		writer.print("<span style='color:red';/> ");
		writer.print("web series name is : " + name);
		writer.print("<br>");
		writer.print("<span style='color:green';/> ");
		writer.print("web series langaugeis : " + langauge);
		writer.print("<br>");
		writer.print("<span style='color:blue';/> ");
		writer.print("web epsode is : " + epsode);
		writer.print("<br>");
		writer.print("<span style='color:orange';/> ");
		writer.print("web series OTT  is : " + ott);
		writer.print("<br>");
		writer.print("<span style='color:yellow';/> ");
		writer.print("web series budject is : " + budject);
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}

}
