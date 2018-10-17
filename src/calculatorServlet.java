

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class calculatorServlet
 */
@WebServlet("/calculatorServlet")
public class calculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public calculatorServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		Get the first number
		String num1 = request.getParameter("num1");
		int result1 = Integer.parseInt(num1);
		
//		Get the second number
		String num2 = request.getParameter("num2");
		int result2 = Integer.parseInt(num2);
		
//		Add the numbers together
		int result = result1+result2;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("<h3>The sum of the digits is: "+ result +" </h3>");
		out.print("</body></html>");
	} 

}
