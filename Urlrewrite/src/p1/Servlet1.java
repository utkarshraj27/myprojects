package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	 
		
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
			
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String pincode=request.getParameter("pinCode");
		out.print("Pincode is:"+pincode+"</br>");

		
		String technology= (String)request.getParameter("technology");
        out.println("Technology is: "+technology+"</br>");
        out.println("<a href='Servlet2?pin="+pincode+"&&tech="+technology+"'>Get Job</a>");  
				
		out.close();
			  
    }  
			 		
			
		}
		
	
	
	

	
	


