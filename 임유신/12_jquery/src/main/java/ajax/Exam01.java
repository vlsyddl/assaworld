package ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/exam01")
public class Exam01 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//<h1> 사용자가 보낸 메세지</h1>
		
		response.setContentType("text/html; charset=utf-8");
		
		String msg = request.getParameter("msg");
		try {
			
		Thread.sleep(2000);
		}catch(Exception e) {}
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1>" + request.getMethod() + ": " + msg + "</h1>");
		out.close();
		
		
	}
	
}







