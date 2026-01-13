package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("user", "Rohit");
		request.setAttribute("msg", "hello dosto! , Kya hal hai .");

		RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
		rd.forward(request, response);
	}
}
