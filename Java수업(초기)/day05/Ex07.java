package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("1~7���� ������ �ϳ��� �Է��ϼ��� : ");
		String a = in.readLine();
		int day = Integer.parseInt(a);
		
		switch (day) {
		case 1 :
			System.out.println("��");
			break;
		case 2 :
			System.out.println("ȭ");
			break;
		case 3 :
			System.out.println("��");
			break;
		case 4 :
			System.out.println("��");
			break;
		case 5 :
			System.out.println("��");
			break;
		case 6 :
			System.out.println("��");
			break;
		case 7 :
			System.out.println("��");
			break;
		default :
			System.out.println("���� : 1~7���� ������ �ϳ��� �Է��ϼ���!!");
			break;
		}
	}

}
