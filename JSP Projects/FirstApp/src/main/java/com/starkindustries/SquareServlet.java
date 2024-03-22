package com.starkindustries;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends jakarta.servlet.http.HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
		PrintWriter writter = response.getWriter();
//		int k = (int) request.getAttribute("k");
		HttpSession session = request.getSession();
		int k=(int)session.getAttribute("k");
		session.removeAttribute("k");
		writter.println("The Square is: "+Math.pow(k, 2));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
