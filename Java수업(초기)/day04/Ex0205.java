package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0205 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸� : ");
		String name1 = in.readLine();
		
		System.out.print("���� : ");
		String a = in.readLine();
		int kor1 = Integer.parseInt(a);
		
		System.out.print("���� : ");
		String b = in.readLine();
		int eng1 = Integer.parseInt(b);
		
		System.out.print("���� : ");
		String c = in.readLine();
		int math1 = Integer.parseInt(c);

		System.out.print("���� : ");
		String d = in.readLine();
		int sci1 = Integer.parseInt(d);

		System.out.print("���� : ");
		String e = in.readLine();
		int his1 = Integer.parseInt(e);


		System.out.print("�̸� : ");
		String name2 = in.readLine();
		
		System.out.print("���� : ");
		a = in.readLine();
		int kor2 = Integer.parseInt(a);
		
		System.out.print("���� : ");
		b = in.readLine();
		int eng2 = Integer.parseInt(b);
		
		System.out.print("���� : ");
		c = in.readLine();
		int math2 = Integer.parseInt(c);

		System.out.print("���� : ");
		d = in.readLine();
		int sci2 = Integer.parseInt(d);

		System.out.print("���� : ");
		e = in.readLine();
		int his2 = Integer.parseInt(e);

		int total1 = kor1 + eng1 + math1 + sci1 + his1;
		double avg1 = total1 / 5;
		String pass1 = (avg1 > 80) ? "Pass":"�����";
		int total2 = kor2 + eng2 + math2 + sci2 + his2;
		double avg2 = total2 / 5;
		String pass2 = (avg2 <= 80) ? "�����":"Pass";
		
//		String print_value = "";
//		print_value = print_value + "=====================================================================\n";
//		print_value = print_value + "�̸�\t����\t����\t����\t����\t����\t����\t���\t�����\n";
//		print_value = print_value + "=====================================================================\n";
//		print_value = print_value + name1 + "\t";
//		print_value = print_value + kor1 + "\t";
//		print_value = print_value + eng1 + "\t";
//		print_value = print_value + math1 + "\t";
//		print_value = print_value + sci1 + "\t";
//		print_value = print_value + his1 + "\t";
//		print_value = print_value + total1 + "\t";
//		print_value = print_value + avg1 + "\t";
//		print_value = print_value + pass1 + "\n";
//		
//		print_value = print_value + name2 + "\t";
//		print_value = print_value + kor2 + "\t";
//		print_value = print_value + eng2 + "\t";
//		print_value = print_value + math2 + "\t";
//		print_value = print_value + sci2 + "\t";
//		print_value = print_value + his2 + "\t";
//		print_value = print_value + total2 + "\t";
//		print_value = print_value + avg2 + "\t";
//		print_value = print_value + pass2 + "\n";
//		print_value = print_value + "=====================================================================";

		String print_value = "";
		print_value = print_value + "=====================================================================\n";
		print_value = print_value + "�̸�\t����\t����\t����\t����\t����\t����\t���\t�����\n";
		print_value = print_value + "=====================================================================\n";
		print_value = print_value + name1+"\t"+kor1+"\t"+eng1+"\t"+math1+"\t"+sci1+"\t"+his1+"\t"+total1+"\t"+avg1+"\t"+pass1+"\n";
		print_value = print_value + name2+"\t"+kor2+"\t"+eng2+"\t"+math2+"\t"+sci2+"\t"+his2+"\t"+total2+"\t"+avg2+"\t"+pass2+"\n";
		print_value = print_value + "=====================================================================";
		
		System.out.println(print_value);

	}

}
