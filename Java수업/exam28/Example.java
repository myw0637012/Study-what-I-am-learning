package exam28;

import java.util.ArrayList;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		ArrayList<Sangpum> arrayList = new ArrayList<Sangpum>();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("(��ȸ:1, �Է�:2, �׿�:����) : ");
			String menu = scan.next();
			if (menu.contentEquals("1")) {
				for (int i = 0; i < arrayList.size(); i = i + 1) {
					arrayList.get(i).disp();
				}
			} else if(menu.contentEquals("2")) {
				Sangpum imsi = new Sangpum();
				imsi.input();
				arrayList.add(imsi);
			} else {
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
