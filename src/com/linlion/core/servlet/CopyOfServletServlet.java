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

public class CopyOfServletServlet extends HttpServlet {
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
// !@#$%1572033530
