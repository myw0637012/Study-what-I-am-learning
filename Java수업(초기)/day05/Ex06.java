package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		//�Է�======================================================================
		System.out.print("��ǰ�� : ");
		String name1 = in.readLine();
		System.out.print("���� : ");
		String a = in.readLine();
		int value1 = Integer.parseInt(a);
		//ó��======================================================================
		int p = 0;
			if (Integer.parseInt(a) >= 50000) {
				p = 10000;
			} else if (Integer.parseInt(a) > 30000) {
				p = 3000;
			} else if (Integer.parseInt(a) > 20000) {
				p = 2000;
			} else if (Integer.parseInt(a) > 10000) {
				p = 1000;
			} else  {
			}
		int point1 = p;

		//�Է�======================================================================
		System.out.print("��ǰ�� : ");
		String name2 = in.readLine();
		System.out.print("���� : ");
		a = in.readLine();
		int value2 = Integer.parseInt(a);
		//ó��======================================================================
		p = 0;
			if (Integer.parseInt(a) >= 50000) {
			p = 10000;
			} else if (Integer.parseInt(a) > 30000) {
				p = 3000;
			} else if (Integer.parseInt(a) > 20000) {
				p = 2000;
			} else if (Integer.parseInt(a) > 10000) {
				p = 1000;
			} else  {
			}
		int point2 = p;

		//�Է�======================================================================
		System.out.print("��ǰ�� : ");
		String name3 = in.readLine();
		System.out.print("���� : ");
		a = in.readLine();
		int value3 = Integer.parseInt(a);
		//ó��======================================================================
		p = 0;
			if (Integer.parseInt(a) >= 50000) {
				p = 10000;
			} else if (Integer.parseInt(a) > 30000) {
				p = 3000;
			} else if (Integer.parseInt(a) > 20000) {
				p = 2000;
			} else if (Integer.parseInt(a) > 10000) {
				p = 1000;
			} else  {
			}
		int point3 = p;

		//�Է�======================================================================
		System.out.print("��ǰ�� : ");
		String name4 = in.readLine();
		System.out.print("���� : ");
		a = in.readLine();
		int value4 = Integer.parseInt(a);
		//ó��======================================================================
		p = 0;
			if (Integer.parseInt(a) >= 50000) {
				p = 10000;
			} else if (Integer.parseInt(a) > 30000) {
				p = 3000;
			} else if (Integer.parseInt(a) > 20000) {
				p = 2000;
			} else if (Integer.parseInt(a) > 10000) {
				p = 1000;
			} else  {
			}
		int point4 = p;

		//�Է�======================================================================
		System.out.print("��ǰ�� : ");
		String name5 = in.readLine();
		System.out.print("���� : ");
		a = in.readLine();
		int value5 = Integer.parseInt(a);
		//ó��======================================================================
		p = 0;
			if (Integer.parseInt(a) >= 50000) {
				p = 10000;
			} else if (Integer.parseInt(a) >= 30000) {
				p = 3000;
			} else if (Integer.parseInt(a) >= 20000) {
				p = 2000;
			} else if (Integer.parseInt(a) >= 10000) {
				p = 1000;
			} else  {
			}
		int point5 = p;


		//ó��======================================================================
		int total = value1 + value2 + value3 + value4 + value5;
		int pointTotal = point1 + point2 + point3 + point4 + point5;
		
		//���======================================================================
		String printValue = "";
		printValue = printValue + "=============================\n";
		printValue = printValue + name1 + "..............." + value1 + "��(" + point1 + ")\n";
		printValue = printValue + name2 + "..............." + value2 + "��(" + point2 + ")\n";
		printValue = printValue + name3 + "..............." + value3 + "��(" + point3 + ")\n";
		printValue = printValue + name4 + "..............." + value4 + "��(" + point4 + ")\n";
		printValue = printValue + name5 + "..............." + value5 + "��(" + point5 + ")\n";
		printValue = printValue + "=============================\n";
		printValue = printValue + "�հ�..............." + total + "��(�� ����Ʈ : " + pointTotal + "��)";
		
		System.out.println(printValue);		
		

	}

}
