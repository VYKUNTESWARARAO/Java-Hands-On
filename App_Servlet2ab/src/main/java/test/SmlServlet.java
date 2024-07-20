package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/sl")

public class SmlServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		int v1=Integer.parseInt(req.getParameter("v1"));
		int v2=Integer.parseInt(req.getParameter("v2"));
		PrintWriter pw=res.getWriter();
		res.setContentType("html/text");
		if(v1<v2) 
		{
			pw.println("sml ="+v1+"<br><br>");
		}
		else 
		{
			pw.println("sml ="+v2+"<br><br>");
		}
		RequestDispatcher rd=req.getRequestDispatcher("Choice.html");
		rd.include(req,res);
	}

}
