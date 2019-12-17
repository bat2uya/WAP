package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculator2
 */
@WebServlet("/calculator2")
public class calculator2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculator2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		
		   String firstNumberSum = request.getParameter("firstNumberSum1");
	        String secondNumberSum = request.getParameter("secondNumberSum1");
	        String firstNumberMultiplication = request.getParameter("firstNumberMultiplication1");
	        String secondNumberMultiplication = request.getParameter("secondNumberMultiplication1");
	        int val1 = 0;
	        int val2 = 0;
	        
	  
		
		out.print("<!DOCTYPE html>\r\n" + 
				"		<html>\r\n" + 
				"		<head>\r\n" + 
				"		<meta charset=\"ISO-8859-1\">\r\n" + 
				"		<title>Calculator</title>\r\n" + 
				"		</head>\r\n" + 
				"		<body>");
	
		out.print("<form action=\"calculate\" method=\"post\">\r\n" + 
				"    <div >\r\n" + 
				"        <input type=\"text\" name=\"firstNumberSum\" size=\"1\" pattern=\"[0-9]\" id=\"firstNumberSum\">&nbsp;+&nbsp;\r\n" + 
				"        <input\r\n" + 
				"            type=\"text\" pattern=\"[0-9]\" size=\"1\" name=\"secondNumberSum\" id=\"secondNumberSum\"> \r\n" + 
				"    </div>\r\n" + 
				"    <br>\r\n" + 
				"    <div class=\"calculate-block\">\r\n" + 
				"        <input type=\"text\" name=\"firstNumberMultiplication\" size=\"1\" pattern=\"[0-9]\" id=\"firstNumberMultiplication\">&nbsp;*&nbsp;<input\r\n" + 
				"            type=\"text\" size=\"1\" pattern=\"[0-9]\" name=\"secondNumberMultiplication\" id=\"secondNumberMultiplication\"> \r\n" + 
				"     \r\n" + 
				"    </div>\r\n" + 
		 
				"    <div >\r\n" + 
				"        <input type=\"submit\" value=\"Submit\">\r\n" + 
				"    </div>\r\n");
		
	      if ((firstNumberSum != null && !firstNumberSum.trim().isEmpty()) && (secondNumberSum != null && !secondNumberSum.trim().isEmpty()))
	        {
	        	val1 =Integer.parseInt( firstNumberSum) + Integer.parseInt(secondNumberSum);
	        	
	        }
	      
	      if ((firstNumberMultiplication != null && !firstNumberMultiplication.trim().isEmpty()) && (secondNumberMultiplication != null && !secondNumberMultiplication.trim().isEmpty())) 
	      {
	    	  val2 =Integer.parseInt( firstNumberMultiplication) * Integer.parseInt(secondNumberMultiplication);
	      }
	      
	       if(val1 > 0 && val2 == 0)
	      {
	    	  out.print(	"</form>\r\n" + 
						"\r\n" + 
						"<form action=\"calculate1\" method=\"post\">\r\n" + 
						"    <div >\r\n" + 
						"        <input type=\"text\" value = \""+ firstNumberSum +"\" name=\"firstNumberSum1\" size=\"1\" pattern=\"[0-9]\" id=\"firstNumberSum1\">&nbsp;+&nbsp;<input\r\n" + 
						"           value =\""+secondNumberSum+"\"  type=\"text\" pattern=\"[0-9]\" size=\"1\" name=\"secondNumberSum1\" id=\"secondNumberSum1\">&nbsp;=&nbsp;<input\r\n" + 
						"            value = \""+ val1 +"\" type=\"text\" name=\"resultSum1\" id=\"resultSum1\" size=\"2\" readonly>\r\n" + 
						"    </div>\r\n" + 
						"    <br>\r\n" + 
						"    <div >\r\n" + 
						"        <input type=\"text\" name=\"firstNumberMultiplication1\" size=\"1\" pattern=\"[0-9]\" id=\"firstNumberMultiplication1\">&nbsp;*&nbsp;<input\r\n" + 
						"            type=\"text\" size=\"1\" pattern=\"[0-9]\" name=\"secondNumberMultiplication1\" id=\"secondNumberMultiplication1\">&nbsp;=&nbsp;<input\r\n" + 
						"            type=\"text\" name=\"resultMultiplication1\" size=\"1\" id=\"resultMultiplication1\" readonly>\r\n" + 
						"    </div>\r\n" + 
		 
						"    <div >\r\n" + 
						"        <input type=\"submit\" value=\"Submit\">\r\n" + 
						"    </div>\r\n" + 
						"</form>\r\n" + 
						"");
	      }
	      else
	    	  if(val1 == 0 && val2 == 0)
	    	  {
	    		  out.print(	"</form>\r\n" + 
							"\r\n" + 
							"<form action=\"calculate1\" method=\"post\">\r\n" + 
							"    <div >\r\n" + 
							"        <input type=\"text\" name=\"firstNumberSum1\" size=\"1\" pattern=\"[0-9]\" id=\"firstNumberSum1\">&nbsp;+&nbsp;<input\r\n" + 
							"            type=\"text\" pattern=\"[0-9]\" size=\"1\" name=\"secondNumberSum1\" id=\"secondNumberSum1\">&nbsp;=&nbsp;<input\r\n" + 
							"            type=\"text\" name=\"resultSum1\" id=\"resultSum1\" size=\"1\" readonly>\r\n" + 
							"    </div>\r\n" + 
							"    <br>\r\n" + 
							"    <div >\r\n" + 
							"        <input type=\"text\" name=\"firstNumberMultiplication1\" size=\"1\" pattern=\"[0-9]\" id=\"firstNumberMultiplication1\">&nbsp;*&nbsp;<input\r\n" + 
							"            type=\"text\" size=\"1\" pattern=\"[0-9]\" name=\"secondNumberMultiplication1\" id=\"secondNumberMultiplication1\">&nbsp;=&nbsp;<input\r\n" + 
							"            type=\"text\" name=\"resultMultiplication1\" size=\"1\" id=\"resultMultiplication1\" readonly>\r\n" + 
							"    </div>\r\n" + 
			 
							"    <div >\r\n" + 
							"        <input type=\"submit\" value=\"Submit\">\r\n" + 
							"    </div>\r\n" + 
							"</form>\r\n" + 
							"");
	    	  }
	    	  else
	    		  if(val1 == 0 && val2 > 0)
	    		  {
	    			 	out.print(	"</form>\r\n" + 
	    	    				"\r\n" + 
	    	    				"<form action=\"calculate1\" method=\"post\">\r\n" + 
	    	    				"    <div >\r\n" + 
	    	    				"        <input type=\"text\" name=\"firstNumberSum1\" size=\"1\" pattern=\"[0-9]\" id=\"firstNumberSum1\">&nbsp;+&nbsp;<input\r\n" + 
	    	    				"            type=\"text\" pattern=\"[0-9]\" size=\"1\" name=\"secondNumberSum1\" id=\"secondNumberSum1\">&nbsp;=&nbsp;<input\r\n" + 
	    	    				"            type=\"text\" name=\"resultSum1\" id=\"resultSum1\" size=\"2\" readonly>\r\n" + 
	    	    				"    </div>\r\n" + 
	    	    				"    <br>\r\n" + 
	    	    				"    <div >\r\n" + 
	    	    				"        <input type=\"text\" value = \""  + firstNumberMultiplication +"\" name=\"firstNumberMultiplication1\" size=\"1\" pattern=\"[0-9]\" id=\"firstNumberMultiplication1\">&nbsp;*&nbsp;<input\r\n" + 
	    	    				"            type=\"text\" size=\"1\" pattern=\"[0-9]\" value = \"" + secondNumberMultiplication + "\" name=\"secondNumberMultiplication1\" id=\"secondNumberMultiplication1\">&nbsp;=&nbsp;<input\r\n" + 
	    	    				"            type=\"text\" name=\"resultMultiplication1\" size=\"2\" id=\"resultMultiplication1\" readonly  value=\" "+ val2 +" \">\r\n" + 
	    	    				"    </div>\r\n" + 

	    	    				"    <div >\r\n" + 
	    	    				"        <input type=\"submit\" value=\"Submit\">\r\n" + 
	    	    				"    </div>\r\n" + 
	    	    				"</form>\r\n" + 
	    	    				"");
	    		  }
	    		  else
	    			  if(val1 > 0 && val2 > 0)
	    			  {
	    				 	out.print(	"</form>\r\n" + 
	    		    				"\r\n" + 
	    		    				"<form action=\"calculate1\" method=\"post\">\r\n" + 
	    							"    <div >\r\n" + 
	    							"        <input type=\"text\" value = \""+ firstNumberSum +"\" name=\"firstNumberSum1\" size=\"1\" pattern=\"[0-9]\" id=\"firstNumberSum1\">&nbsp;+&nbsp;<input\r\n" + 
	    							"           value =\""+secondNumberSum+"\"  type=\"text\" pattern=\"[0-9]\" size=\"1\" name=\"secondNumberSum1\" id=\"secondNumberSum1\">&nbsp;=&nbsp;<input\r\n" + 
	    							"            value = \""+ val1 +"\" type=\"text\" name=\"resultSum1\" id=\"resultSum1\" size=\"2\" readonly>\r\n" + 
	    							"    </div>\r\n" + 
	    							"    <br>\r\n" + 
	    							"    <div >\r\n" + 
	    		    				"        <input type=\"text\" value = \""  + firstNumberMultiplication +"\" name=\"firstNumberMultiplication1\" size=\"1\" pattern=\"[0-9]\" id=\"firstNumberMultiplication1\">&nbsp;*&nbsp;<input\r\n" + 
	    		    				"            type=\"text\" size=\"1\" pattern=\"[0-9]\" value = \"" + secondNumberMultiplication + "\" name=\"secondNumberMultiplication1\" id=\"secondNumberMultiplication1\">&nbsp;=&nbsp;<input\r\n" + 
	    		    				"            type=\"text\" name=\"resultMultiplication1\" size=\"2\" id=\"resultMultiplication1\" readonly  value=\" "+ val2 +" \">\r\n" + 
	    		    				"    </div>\r\n" + 

	    		    				"    <div >\r\n" + 
	    		    				"        <input type=\"submit\" value=\"Submit\">\r\n" + 
	    		    				"    </div>\r\n" + 
	    		    				"</form>\r\n" + 
	    		    				"");
	    			  }
	
	      if ((firstNumberMultiplication != null && !firstNumberMultiplication.trim().isEmpty()) && (secondNumberMultiplication != null && !secondNumberMultiplication.trim().isEmpty())) 
	      {
	    	 	val2 =Integer.parseInt( firstNumberMultiplication) * Integer.parseInt(secondNumberMultiplication);
	         
	        	
	       
	        	
	      }
	      else
	      {
	  		
	      }
				
	
		
		out.print("</body></html>");
 
	}

}
