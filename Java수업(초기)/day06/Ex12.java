package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String print = "\n";
		int total = 0;
		String name = "";
		String price = "";
		int p = 0;
		while (true) {
		System.out.print("��ǰ�� : ");
		name = in.readLine();
			if (name.toLowerCase().equals("q")) {
				print = print + "===================\n";
				print = print + "�հ� ......" + total + "��\n"; 
				print = print + "��ǰ�Է��� ����Ǿ����ϴ�.";
				break;
			} else {
				print = print + name + "......";
				System.out.print("���� : ");
				price = in.readLine();
				p = Integer.parseInt(price);
				total = total + p;
				print = print + p + "\n";
			}
		}
		System.out.println(print);
	}
}
