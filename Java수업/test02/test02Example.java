package test02;

import java.util.ArrayList;
import java.util.Scanner;

public class test02Example {

	public static void main(String[] args) {
		ArrayList<Test> arrayList = new ArrayList<Test>();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("����(0 : ��ȸ,  1 : �Է�,  �׿� : ����) : ");
			String menu = scan.next();
			
			if (menu.contentEquals("0")) {
				for (int i = 0; i < arrayList.size(); i = i +1) {
					arrayList.get(i).disp();
				}
			} else if (menu.contentEquals("1")) {
				Test t = new Test();
				t.input();
				arrayList.add(t);
			} else {
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

}
