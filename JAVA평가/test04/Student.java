package test04;
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
	
	Scanner scan = new Scanner(System.in);
	//method

	public void input() {//�Է�
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
	public void sum(int kor, int eng, int mat) {//�������
		tot = kor + eng + mat;
	}
	public void aver(int kor, int eng, int mat) {//��հ��
		avg = (double)(tot)/3;
	}
	public void disp1() {//Ÿ��Ʋ�����
		System.out.println("==============================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println("==============================================");
	}
	public void disp2() {//����Ʈ���
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(tot + "\t");
		System.out.println(avg);
	}
	public void disp3() {//��������
		System.out.println("==============================================");
	}
}