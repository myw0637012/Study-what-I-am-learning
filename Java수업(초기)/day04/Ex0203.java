package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0203 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�̸��� �Է��ϼ��� : ");  
		String name = in.readLine();
		
		System.out.print("������ �Է��ϼ��� : ");  
		String a = in.readLine();
		
		//���ʽ� : ������ 600%
		//���� : 12����ġ ���� + ���ʽ�

		int pay = Integer.parseInt(a);
		int bonus = pay * 6;
		int total = (pay * 12) + bonus;
		
		String printValue = "";
		
		printValue = printValue + "�̸� : " + name + "\t";
		printValue = printValue + "���� : " + pay + "����\t";
    	printValue = printValue + "���ʽ� : " + bonus + "����\t";
    	printValue = printValue + "�Ѿ� : " + total + "����";
		
		System.out.println(printValue);
		
	}

}
