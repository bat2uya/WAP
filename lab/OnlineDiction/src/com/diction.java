package com;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class diction
 */
@WebServlet("/diction")
public class diction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public diction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    String word = null;
	        word = request.getParameter("txtValue");
	        ArrayList<Word> definition = new ArrayList<Word>();
	        definition = DbConnection.getDefinition(word);
	        Gson gson = new Gson();
	        JsonElement element = gson.toJsonTree(definition, new TypeToken<List<Word>>() {}.getType());
	        JsonArray jsonArray = element.getAsJsonArray();
	        response.setContentType("application/json");
	        response.getWriter().print(jsonArray);
	}

  
}
