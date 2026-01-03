// package com.sarvate;

// import java.io.IOException;
// import java.io.PrintWriter;

// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// @WebServlet("/hello")   // Servlet Mapping
// public class Sarvlat extends HttpServlet {

//     // ✅ Lifecycle - init()
//     @Override
//     public void init() throws ServletException {
//         System.out.println("HelloServlet initialized (init called)");
//     }

//     // ✅ Handle GET
//     @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response)
//             throws ServletException, IOException {

//         response.setContentType("text/html");
//         PrintWriter out = response.getWriter();

//         out.println("<h2>Hello from Servlet</h2>");

//         // Request Parameter (GET)
//         String name = request.getParameter("name");
//         if (name != null) {
//             out.println("<p><b>Name (GET):</b> " + name + "</p>");
//         }

//         // GET Form
//         out.println("<hr>");
//         out.println("<h3>GET Method Form</h3>");
//         out.println("<form method='get' action='hello'>");
//         out.println("Name: <input type='text' name='name'>");
//         out.println("<input type='submit' value='Submit GET'>");
//         out.println("</form>");

//         // POST Form
//         out.println("<hr>");
//         out.println("<h3>POST Method Form</h3>");
//         out.println("<form method='post' action='hello'>");
//         out.println("Name: <input type='text' name='name'>");
//         out.println("<input type='submit' value='Submit POST'>");
//         out.println("</form>");
//     }

//     // ✅ Handle POST
//     @Override
//     protected void doPost(HttpServletRequest request, HttpServletResponse response)
//             throws ServletException, IOException {

//         response.setContentType("text/html");
//         PrintWriter out = response.getWriter();

//         out.println("<h2>Hello from Servlet (POST)</h2>");

//         String name = request.getParameter("name");
//         out.println("<p><b>Name (POST):</b> " + name + "</p>");

//         out.println("<a href='hello'>Go Back</a>");
//     }

//     // ✅ Lifecycle - destroy()
//     @Override
//     public void destroy() {
//         System.out.println("HelloServlet destroyed (destroy called)");
//     }
// }
