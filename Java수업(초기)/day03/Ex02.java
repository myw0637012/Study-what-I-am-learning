package day03;

public class Ex02 {

	public static void main(String[] args) {

		int kor = 80;
		int eng = 91;
		int math = 100;
		
		int total = kor + eng + math;
		
		float avg = (float)total / 3;

//		String lin = "==============================================";
//		String title = "���� \t ���� \t ���� \t ���� \t ���";
//		String value = kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg;
//		String printValue = lin + "\n" + title + "\n" + lin + "\n" + value + "\n" + lin;
//
//		System.out.println(printValue);

		
//		String printValue = "==========================================" + "\n" + 
//				"���� \t ���� \t ���� \t ���� \t ���" + "\n" + 
//				"==========================================" + "\n" +
//				kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg + "\n" +
//				"==========================================";
//
//		System.out.println(printValue);
		
		String printValue = "";
		printValue = printValue + "==========================================" + "\n"; 
		printValue = printValue + "���� \t ���� \t ���� \t ���� \t ���" + "\n"; 
		printValue = printValue + "==========================================" + "\n";
		printValue = printValue + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg + "\n";
		printValue = printValue + "==========================================";

		System.out.println(printValue);

		
//		String a = "";
//		a = a + "�ȳ��ϼ���?\n";
//		a = a + "�ݰ����ϴ�.";
//				
//		System.out.println(a);
		
		
		
//		float avg1 = (float)(total / 3);
//		float avg2 = (float)total / 3;
//		float avg3 = total / (float)3;
//		float avg4 = total / 3.0f;
		
//		System.out.println(total);
//		System.out.println(avg);
//		System.out.println(avg1);
//		System.out.println(avg2);
//		System.out.println(avg3);

		
//		System.out.println("==============================================");
//		System.out.println("����"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"���");
//		System.out.println("==============================================");
//		System.out.println(kor + "\t" + eng + "\t"+math+"\t"+total+"\t"+avg);
//		System.out.println("==============================================");
		
//		short kor = 80;
//		short eng = 90;
//		short math = 100;
//		//short aa = kor + eng; -> short�� short �������� ���������� ����
//		
//		int total = kor + eng + math;
//		
//		double avg = total / 3;
//		
//		System.out.println(total);
//		System.out.println(avg);
		
		
	}

}
