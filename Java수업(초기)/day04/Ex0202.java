package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0202 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = in.readLine();
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(���ڸ�) : ");
		String ju = in.readLine();
		String ju1 = ju.substring(0,6);
		String ju2 = ju.substring(6,13);
		
		String a = ju2.substring(0,1);
		int sung = Integer.parseInt(a);
		
		String gender = (sung == 1 || sung == 3) ? "����" : "����";
		
		//String gender = (sung.equals("1")) ? "����" : "����";  ���ڿ��� ���
		
		
		String b = ju.substring(0,2);
		int c = Integer.parseInt(b);
			c = c + 1900;
		int	age = (sung == 1 || sung == 2) ? 2020 - c : c - 1884;
					
		String print = "����� �̸��� " + name + "�Դϴ�. \n" +
                		"����� ������ " + gender + "�Դϴ�. \n" + 
                		"����� ���̴� " + age + "���Դϴ�. \n" + 
                		"����� �ֹι�ȣ�� " + ju1 + "-" + ju2 + "�Դϴ�.";
		
		System.out.println(print);
		
	}

}
