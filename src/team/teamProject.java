package team;
import java.util.Scanner;

import board.Board;




public class teamProject {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=0;
	int boardUser,boardChoice;
	

	Board board;
	
	while(true) {
		System.out.println("1. ȸ������ 2. �̺�Ʈ ���� 3. �Խ��ǰ���");
		num=scan.nextInt();
		switch (num) {
		case 1:break;
		case 2:break;
		case 3:
			System.out.println("1. �α����ϰ� �Խ��� ���� 2. ����");
			System.out.println("�Է� >>>");boardUser=scan.nextInt();
			if(boardUser==1) {
				board=new Board();
			}else {
				break;
			}
			System.out.println("1.����Ʈ ���� 2.�Խ��� ���� 3.�Խñ� �ۼ�");
			boardChoice=scan.nextInt();
			if(boardChoice==1) {
				board.list();
			}else if(boardChoice==2) {
				board.board();
			}else if(boardChoice==3) {
				board.write();
			}
			break;

		default:
			break;
		}
	}
	
}
}
