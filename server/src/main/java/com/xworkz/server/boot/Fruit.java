package com.xworkz.server.boot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/fruit")
public class Fruit extends HttpServlet {

	public Fruit() {
		System.out.println("running" + getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creating do get method");
		String name = "Hareesha";
		resp.getWriter().print(name);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creating do get do Head");
		String name = "manohar";
		resp.getWriter().print(name);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creating do get do post");

		String name = "vinoda";
		resp.getWriter().print(name);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creating do get do options");

		String name = "Banglore";
		resp.getWriter().print(name);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creating do get do put");

		String name = "Chanai";
		resp.getWriter().print(name);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creating do get do delete");

		String name = "Kerala";
		resp.getWriter().print(name);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creating do get do trace");

		String name = "Mysore";
		resp.getWriter().print(name);
		resp.setContentType("text/plain");
	}

}
