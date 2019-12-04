package scr.model;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class BeerSelect extends HttpServlet {
    private String message;

    public void init() throws ServletException {
        // Do required initialization
        message = "Hello World via Servlet";
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Beer Selection Advise<br>");
        String c = request.getParameter("color");
        BeerExport be = new BeerExport();
        List<String> result = be.getBrands(c);
        out.println("<br> Got beer color: " + c);
        Iterator<String> it = result.iterator();
        while (it.hasNext())
        {
            String str = it.next();
            out.print("<br> try: " + str);
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
