package com.starkindustries;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class MainOneServlet extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			
			ServletContext context= request.getServletContext();
			String name_parameter = context.getInitParameter("name");
			String phone_no=context.getInitParameter("phone_no");
			PrintWriter writer = response.getWriter();
			writer.println("My name is:"+name_parameter);
			writer.println("My Phone no is:"+phone_no);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
