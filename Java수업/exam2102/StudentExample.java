package exam2102;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentExample {

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		ArrayList<HashMap> arrayList = new ArrayList<HashMap>();
//		Student s = new Student();
//		while (true) {
//			System.out.print("����(1:��ȸ, 2:�Է�, �׿�:����) : ");
//			String menu = scanner.next();
//			if (menu.contentEquals("1")) {
//					System.out.println(s.map.keySet());
//				for (int i = 0; i < arrayList.size(); i++) {
//					System.out.println(arrayList.get(i).values());
//				}
//			} else if (menu.contentEquals("2")) {
//				s.input();
//				arrayList.add(s.map);
//			} else {
//				break;
//			}
//		}
//		System.out.println("����");
//	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student s = new Student();
		while (true) {
			System.out.print("����(1:��ȸ, 2:�Է�, �׿�:����) : ");
			String menu = scanner.next();
			if (menu.contentEquals("1")) {
				s.disp();
			} else if (menu.contentEquals("2")) {
				s.input();
			} else {
				break;
			}
		}
		System.out.println("����");
	}
}
