package com.starkindustries;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServelet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		int k =Integer.parseInt(request.getParameter("num3"));
		request.setAttribute("k", k);
//		PrintWriter writter = response.getWriter();
//		writter.println(i+j);
		RequestDispatcher dispatch = request.getRequestDispatcher("square");
		dispatch.forward(request, response);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
