package day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {

//�����ϼ���(0 : ��ȸ, 1 : �Է�, , 2 : ����)
//0 �Է½� "��ȸ�������Դϴ�"
//�����ϼ���(0 : ��ȸ, 1 : �Է�, , 2 : ����)
//1 �Է½� "�Է��������Դϴ�"
//2 �Է½� "���α׷��� ����Ǿ����ϴ�."		
		
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		
		int num = 0;
		String n = "";
		while (true) {
			System.out.print("�����ϼ��� (0:��ȸ, 1:�Է�,  2:����) : ");
			n = in.readLine();
			num = Integer.parseInt(n);
			if (num == 0) {
				System.out.println("��ȸ�������Դϴ�.");
			} else if (num == 1) {
				System.out.println("�Է��������Դϴ�.");
			} else if (num == 2) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			} else {
				System.out.print("�Է��� �߸��ϼ̽��ϴ�. �ٽ� �Է��ϼ���. ");
			}

		}
	}

}
