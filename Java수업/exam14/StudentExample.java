package exam14;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Scanner s = new Scanner(System.in);
		String menu;
		Student t = new Student();
		while(true) {
			System.out.print("����(0:��ȸ, 1:�Է�, �׿�:����) : ");
			menu = s.next();
			if (menu.equals("0")) {
				t.disp1();
				for (int i = 0; i < arrayList.size(); i = i +1) {
					arrayList.get(i).disp2();
				}
				t.disp3();
			} else if(menu.equals("0")) {
				
			} else {
				break;
			}
		}

	}

}
