package exam2802;

import java.util.Scanner;

public class Sangpum {
	//member field
	String sName;
	String sPrice;
	String sTotal;
	//constructor
	Scanner scanner = new Scanner(System.in);
	public Sangpum() {
		System.out.print("��ǰ�� : ");
		sName = scanner.next();
		System.out.print("���� : ");
		sPrice = scanner.next();
	}
	//method
	public void disp() {
		System.out.print("��ǰ�� : " + sName + "\t");
		System.out.println("���� : " + sPrice);
	}
}
