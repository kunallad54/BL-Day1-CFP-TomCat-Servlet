/***************************************************************
 * 
 * Purpose : Creating a Servlet
 * 
 * @author Krunal Lad
 * @since 05-08-2021
 * 
 **************************************************************/
package com.brigelabz.krunal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet{

	/**
	 * Purpose : used toGet method to allow servlet to handle the request
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out  = resp.getWriter();
		out.println("<h3> Hello Krunal !!! This is my First Servlet .</h3>");
		out.close();
	}
		
}
