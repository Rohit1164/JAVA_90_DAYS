package com.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		String user = req.getParameter("username");
		String pswd = req.getParameter("password");

		if ("admin".equals(user) && "1234".equals(pswd)) {

			HttpSession session = req.getSession(true); // FIX
			session.setAttribute("user", user);
			session.setMaxInactiveInterval(300);

			res.getWriter().print("You are logged in");
		} else {
			res.getWriter().print("Invalid username or password");
		}
	}
}
