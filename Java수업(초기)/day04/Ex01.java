package day04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		String a = scanner.next();
//		System.out.println(a);

//		int b = scanner.nextInt();
//		System.out.println(b);
		
//		String c = scanner.nextLine();
//		System.out.println(c);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scanner.next();

		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scanner.nextInt();
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.\n" +
							name + "���� ���̴� " + age + "���Դϴ�.");
	}

}
