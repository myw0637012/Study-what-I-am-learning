package exam14;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ��� : ");
		String word = s.next();
		int a = word.length();
		for (int i=0;i<a;i=i+1) {
			System.out.println(word.substring(i,i+1));
		}
	}
}
