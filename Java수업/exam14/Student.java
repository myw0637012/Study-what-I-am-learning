package exam14;

import java.util.Scanner;
public class Student {
	//member field
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	//constructor
	//method
	Scanner scan = new Scanner(System.in);
	public void input() {
		System.out.print("�̸� : ");
		name = scan.next();
		System.out.print("�������� : ");
		kor = scan.nextInt();
		System.out.print("�������� : ");
		eng = scan.nextInt();
		System.out.print("�������� : ");
		mat = scan.nextInt();
		
		sum(kor, eng, mat);
		aver(kor, eng, mat);
	}
	public void sum(int kor, int eng, int mat) {
		tot = kor + eng + mat;
	}
	public void aver(int kor, int eng, int mat) {
		avg = (double)(kor + eng + mat)/3; 
	}
	public void disp1() {
		System.out.println("====================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println("====================================");
	}
	public void disp2() {
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(tot + "\t");
		System.out.println(avg);
	}
	public void disp3() {
		System.out.println("====================================");
	}
}
