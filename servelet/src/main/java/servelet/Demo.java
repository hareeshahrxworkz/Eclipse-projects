package servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/mywish")
public class Demo extends HttpServlet {

	public Demo() {
		System.out.println("running demo constructor HAREESHA");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Demo creating");

		String name = "Hareesha";
		PrintWriter Writer = resp.getWriter();
		Writer.print(name);
		resp.setContentType("text/plain");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = "akshara";
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(name);
		resp.setContentType("text/plain");

	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = "govinda";
		resp.getWriter().print("text/plain");
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = "manu";
		PrintWriter printWriter = resp.getWriter();

		printWriter.print(name);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = "kiran";
		PrintWriter printWriter= resp.getWriter();
		printWriter.print(name);
		resp.setContentType("text/plain");	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = "gopala";
		PrintWriter printWriter= resp.getWriter();
		printWriter.print(name);
		resp.setContentType("text/plain");	}

}
