package test02;
//��ȭ��ȣ�� - �̸�, ��ȭ��ȣ, �ּ���
import java.util.Scanner;

public class Test {
	//�������
	String name;
	String fnum;
	String lnum;
	String mnum;
	String num;
	String junbun;
	String juso;
	
	Scanner scan = new Scanner(System.in);
	
	//������
	
	//�޼ҵ�
	public void input() {
		System.out.print("�̸� : ");
		name = scan.next();
		System.out.print("��ȭ��ȣ(���ڸ�) : ");
		num = scan.next();
		System.out.print("�ּ� : ");
		juso = scan.next();

		jun(fnum, mnum, lnum);
	}

	public void jun(String flum, String mnum, String lnum) {
		
		if (num.length() == 10) {
			fnum = num.substring(0,3);
			mnum = num.substring(3,6);
			lnum = num.substring(6,10);
		} else {
			fnum = num.substring(0,3);
			mnum = num.substring(3,7);
			lnum = num.substring(7,11);
		}
		junbun = fnum + "-" + mnum + "-" + lnum;
	}

	public void disp() {
		System.out.print(name + "\t");
		System.out.print(junbun + "\t");
		System.out.println(juso);
		
	}
	
	
	
	
}
