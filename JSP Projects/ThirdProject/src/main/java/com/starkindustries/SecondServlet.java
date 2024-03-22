package com.starkindustries;

import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			int i=(int) request.getAttribute("i");
			int j=(int) request.getAttribute("j");
			PrintWriter writer = response.getWriter();
			writer.println("The value of i+j is:"+(i+j));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
