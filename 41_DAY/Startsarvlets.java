 package com.example;

import java.io.IOException;
 import java.io.PrintWriter;

 import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 @WebServlet("/hello") // ✅ Task 2: Servlet Mapping
 public class HelloServlet extends HttpServlet {

//  ✅ Task 3: Lifecycle - init()
 @Override
 public void init() throws ServletException {
 System.out.println("HelloServlet initialized (init called)");
 }

 // ✅ Task 1 + Task 4 + Task 5
 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse
 response)
 throws ServletException, IOException {

 response.setContentType("text/html");
 PrintWriter out = response.getWriter();

 // ✅ Task 1: Print message
 out.println("<h2>Hello from Servlet</h2>");

 // ✅ Task 5: Request Parameter
 String name = request.getParameter("name");
 if (name != null) {
 out.println("<p><b>Name (GET):</b> " + name + "</p>");
 }

// // ✅ Task 4: HTML Form (GET & POST)
 out.println("<hr>");
 out.println("<h3>GET Method Form</h3>");
 out.println("<form method='get' action='hello'>");
 out.println("Name: <input type='text' name='name'>");
 out.println("<input type='submit' value='Submit GET'>");
 out.println("</form>");

 out.println("<hr>");
 out.println("<h3>POST Method Form</h3>");
 out.println("<form method='post' action='hello'>");
 out.println("Name: <input type='text' name='name'>");
 out.println("<input type='submit' value='Submit POST'>");
 out.println("</form>");
 }

 // ✅ Task 4: Handle POST
 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse
 response)
 throws ServletException, IOException {

 response.setContentType("text/html");
 PrintWriter out = response.getWriter();

 out.println("<h2>Hello from Servlet (POST)</h2>");

 // ✅ Task 5: Request Parameter
 String name = request.getParameter("name");
 out.println("<p><b>Name (POST):</b> " + name + "</p>");

 out.println("<a href='hello'>Go Back</a>");
 }

 // ✅ Task 3: Lifecycle - destroy()
 @Override
 public void destroy() {
 System.out.println("HelloServlet destroyed (destroy called)");
 }
 }
