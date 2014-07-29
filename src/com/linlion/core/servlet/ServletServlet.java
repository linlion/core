package com.linlion.core.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2002
 * </p>
 * <p>
 * Company: BSteel Online Co., Ltd.
 * </p>
 * 
 * @author Li Ji
 * @version 1.0
 */

public class ServletServlet extends HttpServlet {
	// Initialize global variables
	public void init() throws ServletException {
	}

	// Process the HTTP Get request
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String s = request.getRequestURI();
		if (s == null)
			return;
		System.out.println("[LOG]servlet load:" + s + "!");
		if (s.indexOf("com.") >= 0) {
			s = s.substring(s.indexOf("com."));
			String s1 = s.replace('/', '.');
			Class ld = null;
			try {
				ld = this.getClass().getClassLoader().loadClass(s1);
				Servlet obj = (Servlet) ld.newInstance();
				obj.init(this.getServletConfig());
				obj.service(request, response);
			} catch (ClassNotFoundException e) {

			} catch (java.lang.IllegalAccessException e) {

			} catch (java.lang.InstantiationException e) {

			}
		} else {
			try {
				s = s.substring(s.indexOf("servlet") + 8);
//				response.sendRedirect("/fesc/jsp/" + s);
			} catch (Exception e) {
				System.err.println("servlet load error:" + e.toString() + "!");
			}
		}
	}

	// Process the HTTP Post request
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	// Clean up resources
	public void destroy() {
	}
}
