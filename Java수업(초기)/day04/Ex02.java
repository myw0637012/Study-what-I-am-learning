package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = in.readLine(); //����ó�� ������ �� ��
		
		System.out.print("���̸� �Է��ϼ��� : ");
		String age = in.readLine();

		System.out.println("����� �̸��� " + name + "�Դϴ�. \n" + 
							name + "�� ���̴� " + age + "���Դϴ�.");

		
		
	}

}
