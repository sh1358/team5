package team;

import java.util.Scanner;

public class TeamProject  {
	public static void main(String[] args) {
		Member m;
		Scanner scan = new Scanner(System.in);
		int num, cho1, cho2 ;
		while (true) {
			System.out.println("1. ȸ������ 2. �̺�Ʈ ���� 3. �Խ��ǰ���");
			num = scan.nextInt();
			switch (num) {
			case 1:
				System.out.println("ȸ������ �ý��� �Դϴ�.");
				System.out.println("1. ������ 2. �Ϲ� ȸ��");
				cho1 = scan.nextInt();
				if(cho1==1) {
					m = new Manager();
				}else if(cho1==2) {
					m = new General();
				}else {
					m = new General();
					System.out.println("�߸��Է� �Ϲ�ȸ������ ");
				}
				System.out.println("1. ȸ����Ϻ��� 2. ȸ�����");
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
