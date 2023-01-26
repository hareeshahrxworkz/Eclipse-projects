package com.xworkz.metro.thing;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/metro")
public class Metro extends HttpServlet {

	public Metro() {
		System.out.println("running constructor : " + getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("creating do get method in metro");

		String name = req.getParameter("metroName");
		String DirectorName = req.getParameter("DirectorName");
		String location = req.getParameter("location");
		String metroTiming = req.getParameter("metroTiming");
		String noOfStations = req.getParameter("noOfStations");
		String Souce = req.getParameter("Souce");
		String destination = req.getParameter("destination");
		String price = req.getParameter("price");
		String available = req.getParameter("available");
		String noOfVisitors = req.getParameter("noOfVisitors");
		String managername = req.getParameter("managername");
		String pincode = req.getParameter("pincode");
		String email = req.getParameter("email");
		String wattsappno = req.getParameter("wattsappno");
		String stationno = req.getParameter("stationno");
		String noofcities = req.getParameter("noofcities");
		String state = req.getParameter("state");
		String timings = req.getParameter("timings");
		String country = req.getParameter("country");
		String continent = req.getParameter("continent");

		System.out.println("Metro name is : " + name);
		System.out.println("Metro DirectorName is : " + DirectorName);
		System.out.println("Metro location is : " + location);
		System.out.println("Metro metroTiming is : " + metroTiming);
		System.out.println("Metro noOfStations is : " + noOfStations);
		System.out.println("Metro Souce is : " + Souce);
		System.out.println("Metro destination is : " + destination);
		System.out.println("Metro price is : " + price);
		System.out.println("Metro available is : " + available);
		System.out.println("Metro noOfVisitors is : " + noOfVisitors);
		System.out.println("Metro managername is : " + managername);
		System.out.println("Metro pincode is : " + pincode);
		System.out.println("Metro email is : " + email);
		System.out.println("Metro wattsappno is : " + wattsappno);
		System.out.println("Metro stationno is : " + stationno);
		System.out.println("Metro timings is : " + timings);
		System.out.println("Metro noofcities is : " + noofcities);
		System.out.println("Metro state is : " + state);
		System.out.println("Metro country is : " + country);
		System.out.println("Metro continent is : " + continent);
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<span style ='color:red;' />");
		writer.print("Metro name is : " + name);
		writer.print("<br>");
		writer.print("<span style ='color:green;' />");
		writer.print("Metro DirectorName is : " + DirectorName);
		writer.print("<br>");
		writer.print("<span style ='color:yellow;' />");
		writer.print("Metro location is : " + location);
		writer.print("<br>");
		writer.print("<span style ='color:brown;' />");
		writer.print("Metro metroTiming is : " + metroTiming);
		writer.print("<br>");
		writer.print("<span style ='color:gold;' />");
		writer.print("Metro name is : " + noOfStations);
		writer.print("<br>");
		writer.print("<span style ='color:pink;' />");
		writer.print("Metro Souce is : " + Souce);
		writer.print("<br>");
		writer.print("<span style ='color:meron;' />");
		writer.print("Metro destination is : " + destination);
		writer.print("<br>");
		writer.print("<span style ='color:blue;' />");
		writer.print("Metro price is : " + price);
		writer.print("<br>");
		writer.print("<span style ='color:green;' />");
		writer.print("Metro available is : " + available);
		writer.print("<br>");
		writer.print("<span style ='color:black;' />");
		writer.print("Metro noOfVisitors is : " + noOfVisitors);
		writer.print("<br>");
		writer.print("<span style ='color:purple;' />");
		writer.print("Metro managername is : " + managername);
		writer.print("<br>");
		writer.print("<span style ='color:dark;' />");
		writer.print("Metro pincode is : " + pincode);
		writer.print("<br>");
		writer.print("<span style ='color:yellow;' />");
		writer.print("Metro email is : " + email);
		writer.print("<br>");
		writer.print("<span style ='color:red;' />");
		writer.print("Metro wattsappno is : " + wattsappno);
		writer.print("<br>");
		writer.print("<span style ='color:brown;' />");
		writer.print("Metro stationno is : " + stationno);
		writer.print("<br>");
		writer.print("<span style ='color:blue;' />");
		writer.print("Metro timings is : " + timings);
		writer.print("<br>");
		writer.print("<span style ='color:green;' />");
		writer.print("Metro name is : " + name);
		writer.print("<br>");
		writer.print("<span style ='color:red;' />");
		writer.print("Metro noofcities is : " + noofcities);
		writer.print("<br>");
		writer.print("<span style ='color:brown;' />");
		writer.print("Metro state is : " + state);
		writer.print("<br>");
		writer.print("<span style ='color:yellow;' />");
		writer.print("Metro country is : " + country);
		writer.print("<br>");
		writer.print("<span style ='color:blue;' />");
		writer.print("Metro continent is : " + continent);

		writer.print("</body>");
		writer.print("</html>");

	}

}
