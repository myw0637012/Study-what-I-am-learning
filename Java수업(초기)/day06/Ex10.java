package day06;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = s.nextInt();
		int sum = 0;
		int i = 0;
		
		while (i <= num) {
			sum = sum + i;
			System.out.println(i + ", �հ� : " + sum);
			i = i + 1;
		}

	}

}
