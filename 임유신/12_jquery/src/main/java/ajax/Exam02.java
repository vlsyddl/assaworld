package ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/exam02")
public class Exam02 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/json; charset=utf-8");
		
		String msg = request.getParameter("msg");
		
		PrintWriter out = response.getWriter();
		
		
		out.println("{\"msg\": \"" + msg + "\"}");
		out.close();
		
		
	}
	
}







