package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ڸ� �Է��ϼ��� : ");
		String x = in.readLine();
		int num = Integer.parseInt(x);
		int hol = 0;
		int jak = 0;
		for (int i = 1 ; i <= num ; i = i + 1 ) {
			if (i % 2 == 1) {
				hol = hol + i;
			} else {
				jak = jak + i;
			}
		}

		String p = "";
		p = p + "�Է��� ���� : " + num + "\n";
		p = p + "Ȧ���� �� : " + hol + "\n";
		p = p + "¦���� �� : " + jak + "\n";
		p = p + "���հ� : " + (hol + jak);
		
		System.out.println(p);
	}

}
