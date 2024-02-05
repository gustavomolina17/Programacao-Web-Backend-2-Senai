import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/PrimeiroServlet")

public class PrimeiroServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		java.util.Date today = new java.util.Date();
		out.println("<html> " + "<body>" + "<h1 align=center>Primeiro Exemplo de Servlet</h1>" + "<br>" + today + "</body>" + "</html>");
	}
}