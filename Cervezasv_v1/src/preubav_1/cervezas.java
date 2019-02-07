package preubav_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/beerselector.do")
public class cervezas extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public cervezas() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Selectore de cervezas v1 </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Selectore de cervezas v1</h1>");
		out.println("<p>Consejas para selecionar una cerveza</p>");
		String c = request.getParameter("color"); 
		out.println("<p>OK. Te gusta la cerveca de color " + c +"</p>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
