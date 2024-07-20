package test;
import java.io.*;


import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class DisplayServlet extends  GenericServlet
{
	public void init() throws ServletException
	{
		
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		String uName=req.getParameter("uname");
		String mId=req.getParameter("mid");
		res.setContentType("text/html");
		pw.println("****User Deatails****");
		
		pw.println("<br>UserName :"+uName);
		pw.println("<br>MailId :"+mId);
	}
	@Override
	public void destroy()
	{
		
	}
}
