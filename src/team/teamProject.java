package team;

import java.util.Scanner;

import event.*;

public class teamProject {
public static void main(String[] args) {
	
	int num=0;
	while(true) {
		System.out.println("1. 회원관리 2. 이벤트 관리 3. 게시판관리");
		switch (num) {
		case 1:break;
		case 2: 
			boolean flag = true;
			while(flag) {
				System.out.println("1. 이벤트 추가");
				System.out.println("2. 이벤트 삭제");
				System.out.println("3. 이벤트 목록보기");
				System.out.println("4. 나가기");
				System.out.println(" >>> : ");
				
				Scanner scan = new Scanner(System.in);
				// 스캐너 넣어주세요
				int choice = scan.nextInt();
				met event = new Eve();
				
				switch (choice) {
				
					case 1 :
						event.addEvent();
						break;
						
					case 2 :
						event.deleteEvent();
						break;
						
					case 3 :
						event.viewAll();
						break;
						
					case 4 :
						flag = false;
						break;
					
						default : System.out.println("잘못입력");
				}
				
				
			}
			
		case 3:break;

		default:
			break;
		}
	}
	
}
}
