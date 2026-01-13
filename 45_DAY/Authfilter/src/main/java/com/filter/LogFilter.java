package com.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class LogFilter extends HttpFilter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;

		long start = System.currentTimeMillis();
		System.out.println("Requested URL: " + req.getRequestURI());

		chain.doFilter(request, response);

		long end = System.currentTimeMillis();
		System.out.println("Time Taken: " + (end - start) + " ms");
	}
}
