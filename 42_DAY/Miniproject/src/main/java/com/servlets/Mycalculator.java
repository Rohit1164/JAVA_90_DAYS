package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mycalculator
 */
@WebServlet("/Mycalculator")
public class Mycalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mycalculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String v1 = request.getParameter("value1");
		String v2 = request.getParameter("value2");
		String button = request.getParameter("button");

		int a = Integer.parseInt(v1);
		int b = Integer.parseInt(v2);
		
		int ans = 0;
		
		switch (button) { 
		case "plus":
			ans = a + b ;
			break;
		case "min":
			ans = a - b ;
			break;
		case "multi":
			ans = a * b ;
			break;
		case "div":
			ans = a / b ;
			break;
		}
		request.setAttribute("result", ans);

		RequestDispatcher rd = request.getRequestDispatcher("/Showresult.jsp");
		rd.forward(request, response);
//		response.sendRedirect("Showresult.jsp?ans="+ans);
//		response.getWriter().append("Total : " + ans);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Post");
//		doGet(request, response);
	}

}
