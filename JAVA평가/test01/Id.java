package test01;

import java.util.Scanner;
public class Id {
	public static void main(String[] args) {
		String id1 = "hong";
		String pass1 = "h1234";
		String id2 = "";
		String pass2 = "";
		Scanner scanner = new Scanner(System.in);

		System.out.print("ID�� �Է��ϼ��� : ");
		id2 = scanner.next();
		System.out.print("Password�� �Է��ϼ��� : ");
		pass2 = scanner.next();

		if ((id1.equals(id2))&&(pass1.equals(pass2))) {
			System.out.println("��ġ");
		} else {
			System.out.println("����ġ");
		}
	}
}
