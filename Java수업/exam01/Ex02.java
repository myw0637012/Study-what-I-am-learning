package exam01;

class MyClass {

	//Member Field : ��� ����
	int x = 100;
	int y = 200;
	
	//Constructor : ������
	public MyClass() {
		
	}

	//Method : ��� �޼ҵ�(public�� �������� �ְ� �Ⱥ������� �ִ�
	public void aaa() {
		
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		MyClass m1 = new MyClass(); //��ü����
		System.out.println(m1.x);
		System.out.println(m1.y);

		MyClass m2 = new MyClass(); //��ü����
		System.out.println(m2.x);
		System.out.println(m2.y);


	
	}

}
