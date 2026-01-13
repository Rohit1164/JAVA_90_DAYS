package com.servelts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Loggedin")
public class Loggedin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Loggedin() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if ("admin".equals(username) && "123".equals(password)) {

            HttpSession session = request.getSession(true);
            session.setAttribute("user", username);
            session.setMaxInactiveInterval(300); // 5 min

            response.sendRedirect(request.getContextPath() + "/Dashboard");
        } else {
            response.sendRedirect(request.getContextPath() + "/login.jsp?error=1");
        }
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.sendRedirect("login.jsp");
	}


}
