package exam09;

public class Ex01 {
	static int i = 15;//��������
	static void ppp() {
		++i;
		System.out.println(i);//16
	}
	static void qqq() {
		i = i + 5;
		System.out.println(i);//21
	}
	public static void main(String[] args) {
		System.out.println(i);
		ppp();
		qqq();
	}
}
//����������
//public : ������ ����
//default : ���� ��Ű�������� �����ϴ�.
//private : �ڱ� class �������� ����� �� �ִ�.