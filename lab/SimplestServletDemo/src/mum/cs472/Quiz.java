package mum.cs472;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Quiz
 */
@WebServlet("/Quiz")
public class Quiz extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Quiz() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		 PrintWriter out = response.getWriter();
		 out.print("1. What is the difference between a web server and a web container?\r\n"); 
		 out.print("");
		 
		 out.print("2. What is a servlet?\r\n" ); 
		 out.print("");
		 
		 out.print("3. How do web servers and web containers interact with servlets?\r\n" );  
		 out.print("");
		 
		 out.print("4. Who creates request objects?\r\n" ); 
		 out.print("");
		 
		 out.print("5. What are the states in the servlet lifecycle?\r\n" ); 
		 out.print("");
		 
		 out.print("6. Who calls init and when?\r\n" ); 
		 out.print("");
		 
		 out.print("7. Which of init, service, and doGet should you override?\r\n" );  
		 out.print("");
		 
		 out.print("8. In what sense are servlets multi-threaded?\r\n" ); 
		 out.print("");
		 
		 out.print("9. What are the implications of this for servlet instance variables? ");
		 out.print("");
		 
 
		 
		 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
