package exam08;

public class Ex08 {
//	static int method1(int x, int y) {
//		return x + y;
//	}
//	static double method2(double x, double y) {
//		return x + y;
//	}
//	public static void main(String[] args) {
//		int result1 = method1(3,5);
//		double result2 = method2(3.0, 5.0);
//		System.out.println(result1);
//		System.out.println(result2);
//	}
	static int method(int x, int y) {
		return x + y;
	}
	static int method(int x, int y, int z) {
		return x + y;
	}
	static double method(double x, double y) {
		return x + y;
	}
	static double method(int x, double y) {
		return x + y;
	}
	static double method(double y, int x) {
		return x + y;
	}
	//��ȣ���� �Ű����� Ÿ���� �ߺ� �ȵǸ� ������ ���� �󸶵��� ��밡��(�����ε�)
	
	public static void main(String[] args) {
		int result1 = method(3,5);
		double result2 = method(3.0, 5.0);
		System.out.println(result1);
		System.out.println(result2);
	}
}
//�����ε�(Overloading) : �޼ҵ� �̸��� ���Ƶ�, �Ű�����(�ڿ� ��ȣ��)Ÿ���� �������� ã�Ƽ� �ڵ����� ����Ѵ�. �Ű����� Ÿ���� ������ �޶�� �Ѵ�.
//					   	�Ű�����, ������, �޼ҵ�
//�������̵�(Overriding)