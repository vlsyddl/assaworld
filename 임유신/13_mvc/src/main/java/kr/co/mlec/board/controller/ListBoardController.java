package kr.co.mlec.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.domain.Board;
import kr.co.mlec.repository.mapper.BoardMapper;

@WebServlet("/board/list.do")
public class ListBoardController extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// list.jsp(게시물 목록) 페이지에서 사용할 데이터를 준비하고
		// BoardMapper 인터페이스에 있는 selectBoard 메서드를 호출..
		BoardMapper mapper = 
			MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardMapper.class);
		// 데이터베이스 게시물 목록 가져오기~
		List<Board> list = mapper.selectBoard();
		
		// 준비된 데이터를 공유
		request.setAttribute("list", list);
		
		// 공유가 되었다면 페이지를 이동
		RequestDispatcher rd = request.getRequestDispatcher(
				"/jsp/board/list.jsp"
		);
		rd.forward(request, response);
	}
}










