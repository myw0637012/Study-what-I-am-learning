package exam14;
//�����Է��ϴ� arrayList���_����class
import java.util.ArrayList;
import java.util.Scanner;

public class Test03Example {
	public static void main(String[] args) {
		ArrayList<Test03> arrayList = new ArrayList<Test03>();
		Scanner s = new Scanner(System.in);
		Test03 t = new Test03();
		while(true) {
			System.out.print("�޴�����(0:��ȸ, 1:�Է�, �׿�:����) : ");
			String menu = s.next();
			if (menu.equals("0")) {
				t.disp1();
				for (int i = 0; i < arrayList.size(); i = i +1) {
					arrayList.get(i).disp2();
				}
				t.disp3();
			} else if(menu.equals("1")) {
				Test03 t2 = new Test03();
				t2.input();
				arrayList.add(t2);
			} else {
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
