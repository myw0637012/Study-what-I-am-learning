package exam04;

public class SJExample {

	public static void main(String[] args) {
		SJ s1 = new SJ();
		s1.name = "ȫ�浿";
		s1.kor = 90;
		s1.eng = 80;
		s1.math = 70;
		s1.tot = s1.kor + s1.eng + s1.math;
		s1.avg = (double)s1.tot / 3;

		SJ s2 = new SJ();
		s2.name = "��ö��";
		s2.kor = 50;
		s2.eng = 60;
		s2.math = 50;
		s2.tot = s2.kor + s2.eng + s2.math;
		s2.avg = (double)s2.tot / 3;

		
	
	}

}
