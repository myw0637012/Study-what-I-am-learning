package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�ܼ��� �Է��ϼ��� : ");
		String dan = in.readLine();
		int x = Integer.parseInt(dan);
		
//		for (int i = 1 ; i <= 9 ; i = i + 1) {
//			System.out.println(x + " * " + i + " = " + (x * i));
//		}

//		for (int i = 1 ; i <= 9 ; i = i + 1) {
//			if (i%2 == 1) {//Ȧ����
//				System.out.println(x + " * " + i + " = " + (x * i));
//			}
//		}
	
		for (int i = 1 ; i <= 9 ; i = i + 1) {
			if (i%3 == 0) {//3�� �����
				System.out.println(x + " * " + i + " = " + (x * i));
			}
		}

		
	}

}
