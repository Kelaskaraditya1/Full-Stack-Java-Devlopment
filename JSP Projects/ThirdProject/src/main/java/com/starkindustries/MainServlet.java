package com.starkindustries;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		request.setAttribute("i",i);
		request.setAttribute("j", j);
		RequestDispatcher dispatcher = request.getRequestDispatcher("SecondServlet");
		dispatcher.forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
