package event;

import java.util.ArrayList;
import java.util.Scanner;

public class Eve implements met {
	
	ArrayList<String> list = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void viewAll() {
		System.out.println(list.toString());
		
	}

	@Override
	public void addEvent() {
		System.out.println("추가할 이벤트 이름 입력 : ");
		list.add(scan.next());
		
	}

	@Override
	public void deleteEvent() {
		System.out.println("삭제할 이벤트 이름 입력 : ");
		String n = scan.next();
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).equals(n)) {
				list.remove(i);
			}
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		

	}

}
