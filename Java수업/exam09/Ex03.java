package exam09;

class Test3 {
//	private int a = 7;
	public int a = 7;
//	private void disp() {
//		System.out.println("���� ������?");
//	}
	public void disp() {
		System.out.println("���� ������?");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Test3 t = new Test3();
		System.out.println(t.a);
		t.disp();
	}
}
