package team;

import java.util.Scanner;

public class TeamProject  {
	public static void main(String[] args) {
		Member m;
		Scanner scan = new Scanner(System.in);
		int num, cho1, cho2 ;
		while (true) {
			System.out.println("1. 회원관리 2. 이벤트 관리 3. 게시판관리");
			num = scan.nextInt();
			switch (num) {
			case 1:
				System.out.println("회원관리 시스템 입니다.");
				System.out.println("1. 관리자 2. 일반 회원");
				cho1 = scan.nextInt();
				if(cho1==1) {
					m = new Manager();
				}else if(cho1==2) {
					m = new General();
				}else {
					m = new General();
					System.out.println("잘못입력 일반회원으로 ");
				}
				System.out.println("1. 회원목록보기 2. 회원등록");
				cho2 = scan.nextInt();
				if(cho2==1) {
					m.MemberList();
				}else {
					m.MemberAdd();
				}
				break;
			case 2:
				break;
			case 3:
				break;

			default:
				break;
			}
		}

	}
}
