package day07;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name;
		String[] array = new String[3];
		int kor;
		int eng;
		int math;
		int[] tot = new int[3];
		int total = 0;
		for (int i = 0 ; i <= 2 ; i = i + 1) {
			System.out.print("�̸� : ");
			name = scan.next();
			System.out.print("�������� : ");
			kor = scan.nextInt();
			System.out.print("�������� : ");
			eng = scan.nextInt();
			System.out.print("�������� : ");
			math = scan.nextInt();
			array[i] = name + "," + kor + "," + eng + "," + math;
		}

		for (int i = 0 ; i <= 2 ; i = i + 1) {
			String[] imsi = array[i].split(",");
			for (int j = 1 ; j <=3 ; j = j + 1) {
					total = total + Integer.parseInt(imsi[j]);
			}
			tot[i] = total;
		}		
		System.out.println("===========================================");
		System.out.println("�̸� \t ���� \t ���� \t ���� \t ����");
		System.out.println("===========================================");
			
		for (int i = 0 ; i <= 2 ; i = i + 1) {
			String[] imsi = array[i].split(",");
			System.out.println(imsi[0] + "\t" + imsi[1]+ "\t" + imsi[2]+ "\t" + imsi[3] +  "\t" + tot[i]);
		}
		System.out.println("===========================================");

	
	}

}
