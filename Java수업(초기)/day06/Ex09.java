package day06;

public class Ex09 {

	public static void main(String[] args) {

//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i);
//			i = i + 1;//���������� �ִ� ������ �ݵ�� ���
//		}

		int i = 1;
		int total = 0;
		String p = "";
		while (i <= 10) {
			total = total + i;
			p = p + i + ", �հ� : " + total + "\n";
			i = i + 1;
		}
		System.out.println(p);
	}

}
