package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		String a = in.readLine();
		int num = Integer.parseInt(a);
		String su = "";
		
		if (num%2 == 1) {
			su = "Ȧ��";
		} else {
			su = "¦��";
		}
		
		String printValue = "�Է��Ͻ� �� " + num + "��(��) " + su + "�Դϴ�.\n";
		printValue = printValue + "���α׷��� �����մϴ�.";
		
		System.out.println(printValue);

	}

}
