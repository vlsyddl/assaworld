package ajaxfile;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/ajaxfile/exam01")
public class Exam01 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MultipartRequest mRequest = new MultipartRequest(
				request, 
				"D:/app/upload",
				1024 * 1024 * 100,
				"utf-8",
				new DefaultFileRenamePolicy()
			);
		
		System.out.println("ori :" + mRequest.getOriginalFileName("attachFile"));
		System.out.println("sys :" + mRequest.getFilesystemName("attachFile"));
		
		response.setContentType("text/html; charset=utf-8");
		

		PrintWriter out = response.getWriter();
		out.println("파일 업로드 성공");
		out.close();
		
		
		
		
	}
}






