package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/sb")

public class SubServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		int v1=Integer.parseInt(req.getParameter("v1"));
		int v2=Integer.parseInt(req.getParameter("v2"));
		int v3=v1-v2;
		PrintWriter pw=res.getWriter();
		res.setContentType("html/text");
		pw.println("sub ="+v3+"<br><br>");
		RequestDispatcher rd=req.getRequestDispatcher("Choice.html");
		rd.include(req,res);
	} 
}
