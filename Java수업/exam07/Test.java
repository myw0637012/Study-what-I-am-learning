package exam07;

//class Test {
//	static void method1() { //static�� ���̸� ���������̹Ƿ� �ؿ��� �״�� ��� �����ϴ�(��ü ���� X)
//		String kind = "bird";
//	}
//	public static void main(String[] args) {
//���� static�� ������		
//		Test test = new Test(); //Ŭ���� �ȿ� �ִ��� main �޼ҵ� �ٱ��� ������ ��ü�� �����ؾ� �ҷ��ü� ����
//		test.method1();

////���� static�� ������			
//		Test t = new Test();//��ü�� �����ص� �ǰ� ���ص� �ȴ�
//		method1();//��ü ������ ���������� �տ� ��ü �Ⱥٿ��� ��
	
//		Test t = new Test();
//		System.out.println(t.kind);
//	}
//}
//���������� : public, (default), protected, private
//static : ��ü�������� ��밡��, ���� �����Ҷ�

class Test {
	static String kind = "bird";
	int tot = 0;
	
	int sum(int i, int j) {//return���� �������� void, �������� return�� ���
		return i + j;
//		return a, b, c;//return�� �ϳ��� ���� ������ �ִ�. ���Ұ�

//	String sum2(int i, int j) {
//		int a = i + j;
//		int b = i - j;
//		int c = i * j;
//		String d = "" + a +","+ b +","+ c;
//		return d;
	}
	public static void main(String[] args) {
		Test t = new Test();
		int result = t.sum(3, 5);//result�� return�Ǵ� Ÿ���� ��ġ�ؾ� �Ѵ�.
	}
}
//�޼ҵ� : �ݺ����ΰ�, ���� ���ɼ��� �ִ� ���� ����س��� �ʿ��� ������ �ҷ����� ����ϴ� ���.
//		ȣ���Ѵٰ� ǥ����. static �ٿ������� ��ü�ȸ��� ��, �������� ��ü�� ������ ��.