package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex09 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�⵵�� �Է��ϼ��� : ");
		String y = in.readLine();
		int year = Integer.parseInt(y);
		String yun = "";
		
//		if ((year%4 == 0 && year%400 == 0) || (year%4 == 0 && year%100 != 0)) {
//			yun = "����";
//		} else {
//			yun = "���";
//		}

		if (year%4 == 0) {
			if (year%400 == 0 || year%100 != 0) {
				yun = "����";
			} else {
				yun = "���";
			}
		} else {
			yun = "���";
		}
		String printValue = y + "���� " + yun + "�Դϴ�.";
		System.out.println(printValue);
		
		//���� : 4�⸶�� ���ƿ�����, 100���� ���������� �������� ����̴�. �� 400���� �������� �������� �����̴�.
		
	}

}


