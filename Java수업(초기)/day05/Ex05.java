package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException {

		//��Ʈ ������
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//�Է�======================================================================
		System.out.print("��ǰ�� : ");
		String name1 = in.readLine();
		System.out.print("���� : ");
		String a = in.readLine();
		int value1 = Integer.parseInt(a);
		System.out.print("��ǰ�� : ");
		String name2 = in.readLine();
		System.out.print("���� : ");
		a = in.readLine();
		int value2 = Integer.parseInt(a);
		System.out.print("��ǰ�� : ");
		String name3 = in.readLine();
		System.out.print("���� : ");
		a = in.readLine();
		int value3 = Integer.parseInt(a);
		System.out.print("��ǰ�� : ");
		String name4 = in.readLine();
		System.out.print("���� : ");
		a = in.readLine();
		int value4 = Integer.parseInt(a);
		System.out.print("��ǰ�� : ");
		String name5 = in.readLine();
		System.out.print("���� : ");
		a = in.readLine();
		int value5 = Integer.parseInt(a);

		//ó��======================================================================
		int total = value1 + value2 + value3 + value4 + value5;
		int point = 0;

		if (total >= 50000) {
			point = 10000; 
		} else if (total >=30000) {
			point = 3000;
		} else if (total >=20000) {
			point = 2000;
		} else if (total >=10000) {
			point = 1000;
		} else {
			
		}
		
		//���======================================================================
		String printValue = "";
		printValue = printValue + "=======================\n";
		printValue = printValue + name1 + "..............." + value1 + "��\n";
		printValue = printValue + name2 + "..............." + value2 + "��\n";
		printValue = printValue + name3 + "..............." + value3 + "��\n";
		printValue = printValue + name4 + "..............." + value4 + "��\n";
		printValue = printValue + name5 + "..............." + value5 + "��\n";
		printValue = printValue + "=======================\n";
		printValue = printValue + "�հ�..............." + total + "��(����Ʈ : " + point + "��)";
		
		System.out.println(printValue);

	}

}
