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
		System.out.println("1. 회원관리 2. 이벤트 관리 3. 게시판관리");
		num=scan.nextInt();
		switch (num) {
		case 1:break;
		case 2:break;
		case 3:
			System.out.println("1. 로그인하고 게시판 보기 2. 종료");
			System.out.println("입력 >>>");boardUser=scan.nextInt();
			if(boardUser==1) {
				board=new Board();
			}else {
				break;
			}
			System.out.println("1.리스트 보기 2.게시판 보기 3.게시글 작성");
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
