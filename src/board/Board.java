package board;

import board.BoardAll;

interface BoardAll{
	public void list();
	public void write();
	public void board();
}

public class Board implements BoardAll{
	public void showList() {
		System.out.println("네 ~ 보여드렸습니다~");
	}
	public void showBoard() {
		System.out.println("짜잔~ 게시판 입니다~");
	}
	public void writeBoard() {
		System.out.println("게시글 작성완료~");
	}
	
	@Override
	public void list() {
		showList();
		
	}
	@Override
	public void write() {
		writeBoard();
		
	}
	@Override
	public void board() {
		showBoard();
		
	}
}

//class NotLogBoard extends LogBoard implements BoardAll{
//	@Override
//	public void list() {
//		System.out.println("네~ 안보여드렸습니다~");	
//	}
//
//	@Override
//	public void write() {
//		System.out.println("작성 못하시지 말입니다");
//	}
//
//	@Override
//	public void board() {
//		System.out.println("게시판 접근이 어렵지 말입니다");
//	}
//	
//}