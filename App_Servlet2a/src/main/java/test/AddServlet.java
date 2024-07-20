package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/ad")


public class AddServlet extends GenericServlet
{	
	@Override
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		int v1=Integer.parseInt(req.getParameter("v1"));
		int v2=Integer.parseInt(req.getParameter("v2"));
		int v3=v1+v2;
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("sum = "+v3+"<br><br>");
		RequestDispatcher rd=req.getRequestDispatcher("choice.html");
		rd.include(req, res);
	}

}
