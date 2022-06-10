package board;

import board.BoardAll;

interface BoardAll{
	public void list();
	public void write();
	public void board();
}

public class Board implements BoardAll{
	public void showList() {
		System.out.println("�� ~ ������Ƚ��ϴ�~");
	}
	public void showBoard() {
		System.out.println("¥��~ �Խ��� �Դϴ�~");
	}
	public void writeBoard() {
		System.out.println("�Խñ� �ۼ��Ϸ�~");
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
//		System.out.println("��~ �Ⱥ�����Ƚ��ϴ�~");	
//	}
//
//	@Override
//	public void write() {
//		System.out.println("�ۼ� ���Ͻ��� ���Դϴ�");
//	}
//
//	@Override
//	public void board() {
//		System.out.println("�Խ��� ������ ����� ���Դϴ�");
//	}
//	
//}