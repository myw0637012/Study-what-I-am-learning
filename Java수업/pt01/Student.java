package pt01;

import java.util.Scanner;

public class Student {
	//Member Field(�������)
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;

	Scanner scan = new Scanner(System.in);
	//Constructor(������ - ����ʵ忡 ���� �ʱ�ȭ)
	public Student() {

	}
	
	//�޼ҵ�
	public void input() {
		System.out.print("�̸� : ");
		name = scan.next();
		System.out.print("���� : ");
		kor = scan.nextInt();
		System.out.print("���� : ");
		eng = scan.nextInt();
		System.out.print("���� : ");
		mat = scan.nextInt();

		sum(kor, eng, mat);
		aver(kor, eng, mat);
	}
	
	public void sum(int kor, int eng, int mat) {
		tot = kor + eng + mat;
	}
	public void aver(int kor, int eng, int mat) {
		avg = (double)(kor + eng + mat) / 3;
	}
	public void disp() {
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(tot + "\t");
		System.out.println(avg);
	}
	
}
