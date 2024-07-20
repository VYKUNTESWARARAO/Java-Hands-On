package test;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")

public class DisplayServlet extends GenericServlet
{
	@Override
	public void init() throws ServletException
	{
		
	}
	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		
		String Id = req.getParameter("userid");
		String Name = req.getParameter("name");
		String City = req.getParameter("city");
		String Mid = req.getParameter("mid");
		String Phno = req.getParameter("phno");
		
		res.setContentType("text/html");
		
		pw.println("********Employee Details********");
		pw.println("<br><br>EmpID   : "+ Id);
		pw.println("<br><br>EmpName : "+ Name);
		pw.println("<br><br>EmpCity : "+ City);
		pw.println("<br><br>EmpMid  : "+ Mid);
		pw.println("<br><br>EmpPhNO : "+ Phno);
	}
	@Override
	public void destroy() 
	{
		
	}
}
