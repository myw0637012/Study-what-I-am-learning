package day05;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//�Է�===================================
		System.out.print("�̸� : ");
		String name = scanner.next();
		System.out.print("���� : ");
		int kor = scanner.nextInt();
		System.out.print("���� : ");
		int eng = scanner.nextInt();
		System.out.print("���� : ");
		int math = scanner.nextInt();
		//========================================
		
		//ó��===================================
		int total = kor + eng + math;
		double avg = total / 3.0;
		String avg1 = "";
		if (avg >= 90) {
			avg1 = "A";
		} else if (avg < 90 && avg >= 80) {
			avg1 = "B";
		} else if (avg < 80 && avg >= 70) {
			avg1 = "C";
		} else if (avg < 70 && avg >= 60) {
			avg1 = "D";
		} else {
			avg1 = "F";
		}
		//========================================

		//���===================================
		String printValue = "";
		printValue = printValue + "===================================================\n";
		printValue = printValue + "�̸�\t����\t����\t����\t����\t���\t���\n";
		printValue = printValue + "===================================================\n";
		printValue = printValue + name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+avg1+"\n";
		printValue = printValue + "===================================================";
		
		System.out.println(printValue);
		//========================================

	}

}
