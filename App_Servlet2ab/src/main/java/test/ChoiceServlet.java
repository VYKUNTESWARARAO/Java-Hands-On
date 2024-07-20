package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/Choice")


public class ChoiceServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		String s1=req.getParameter("s1");
		if (s1 != null && s1.equals("add"))
		{
			 RequestDispatcher rd=req.getRequestDispatcher("ad");
		 	 rd.forward(req, res);
		} 
		else if(s1 != null && s1.equals("sub")) 
		{
			 RequestDispatcher rd=req.getRequestDispatcher("sb");
		 	 rd.forward(req, res);
		} 
		else if(s1 != null && s1.equals("mul")) 
		{
			 RequestDispatcher rd=req.getRequestDispatcher("ml");
		 	 rd.forward(req, res);
		}
		else if(s1 != null && s1.equals("div")) 
		{
			 RequestDispatcher rd=req.getRequestDispatcher("dv");
		 	 rd.forward(req, res);
		}
		else if(s1 != null && s1.equals("gtr")) 
		{
			 RequestDispatcher rd=req.getRequestDispatcher("gt");
		 	 rd.forward(req, res);
		}
		else if(s1 != null && s1.equals("sml"))
		{
			 RequestDispatcher rd=req.getRequestDispatcher("sl");
		 	 rd.forward(req, res);
		} 
		
	}
}
