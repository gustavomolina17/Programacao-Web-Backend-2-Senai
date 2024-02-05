import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.Random;

@WebServlet("/DadoServlet")
public class DadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int NUM_SIDES = 6;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int d1 = rollDice();
		int d2 = rollDice();

		response.setContentType("text/html");

		try (PrintWriter out = response.getWriter()) {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Lançamento de Dados</title>");
			out.println("<style>");
			out.println("body {");
			out.println("    font-family: Arial, sans-serif;");
			out.println("    padding: 20px;");
			out.println("    text-align: center;");
			out.println("    background-image: url('images/dado.jpg');");
			out.println("    background-size: cover;");
			out.println("    background-position: center;");
			out.println("    background-repeat: no-repeat;");
			out.println("}");
			out.println("h1 {");
			out.println("    color: #333;");
			out.println("}");
			out.println(".dice-number {");
			out.println("    font-size: 40px;");
			out.println("    margin-top: 10px;");
			out.println("    color: red;");
			out.println("    text-align: left;");
			out.println("}");
			out.println(".dice-label {");
			out.println("    color: blue;");
			out.println("}");
			out.println("</style>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Lançamento de Dados</h1>");
			out.println("<div class=\"dice-number\"><span class=\"dice-label\">Dado 1:</span> " + d1 + "</div>");
			out.println("<div class=\"dice-number\"><span class=\"dice-label\">Dado 2:</span> " + d2 + "</div>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	private int rollDice() {
		Random random = new Random();
		return random.nextInt(NUM_SIDES) + 1;
	}
}