package day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
//		int i = 20;
//		do {
//			System.out.println(i);
//			i = i + 1;
//		} while (i <= 10);
//		System.out.println("���α׷� ����");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String dan = "";
		String con = "";
		int d = 0;
		int i = 0;
		do {
			System.out.print("���� �Է��ϼ��� : ");
			dan = in.readLine();
			d = Integer.parseInt(dan);
			for (i = 1; i < 10; i = i + 1) {
				System.out.println(d + " * " + i + " = " + (d * i));
				System.out.print("����Ϸ��� \"y\"��, �����Ͻ÷��� �ٸ� Ű�� �Է��ϼ���. : ");
				con = in.readLine();
			}
		}	while (con.toLowerCase().equals("y"));
				System.out.println("���α׷��� �����մϴ�.");
	}
}
//  do {
//    ���๮;
//  } while (�����ϰ��� �ϴ� ����);
//	  	���Ǹ����� ������๮;
//      ���� �������� ������, do�� �ٽ� ���ư�.