package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
		
		
		
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		
		
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        //getting value from the query string  
        String p=(request.getParameter("pincode"));  
        out.print("PinCode is :"+p+"</br>");
        Map map=new HashMap();  
        boolean isFound1=false;
        //Adding elements to map  
        map.put("100","Pune");  
        map.put("200","Chennai");  
        map.put("300","Mumbai");  
        map.put("400","Noida");
        String city = "";
        if(map.containsKey(p)) {
        	 city= (String)map.get(p);
        	isFound1=true;
        }
        String t=(String)request.getParameter("technology");
        List<String> jobList = new ArrayList<String>();
        if(t.equalsIgnoreCase("java") ) // DB
		{
			if(city.equalsIgnoreCase("Pune")) {
				jobList.add("Project- 1");
				jobList.add("Project- 2");
			}
			if(city.equalsIgnoreCase("Chennai")) {
				jobList.add("Project- 3");
				jobList.add("Project- 4");
			}
			if(city.equalsIgnoreCase("Mumbai")) {
				jobList.add("Project- 5");
				jobList.add("Project- 6");
			}
			
		}
		if(t.equalsIgnoreCase("node.js")) //DB
		{
			jobList.add("Project- 7");
			jobList.add("Project- 8");
			
		}
        
        if(isFound1==true) {
        	out.println("City is-->> "+city+"</br>");
        	out.println("Jobs available are-->> "+jobList);
        }
        else {
        	out.print("Wrong Input");
        }
	        
		}

			
			
		
		
	}

	
	

