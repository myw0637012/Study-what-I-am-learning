package pt01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("����(1 : ��ȸ,  2 : ���,  �׿� : ����) : ");
			String menu = scanner.next();
			if (menu.equals("1")) {
				for (int i=0; i <arrayList.size(); i = i + 1) {
					arrayList.get(i).disp();
				}
			} else if (menu.equals("2")) {
				Student s = new Student();//s��ü����
				s.input();//�Է�
				arrayList.add(s);//�߰���
			} else {
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
	}

}
