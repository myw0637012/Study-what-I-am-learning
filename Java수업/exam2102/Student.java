package exam2102;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {
	//member field
	String name;
	int kor;
	int eng;
	int mat;
	int sci;
	int his;
	int tot;
	double avg;
	
	//constructor
	//method
	Scanner scan = new Scanner(System.in);
	ArrayList<HashMap> list = new ArrayList<HashMap>();
	public void input() {
		HashMap<String, String> map = new HashMap<String, String>();
		System.out.print("�̸� : ");
		name = scan.next();
		System.out.print("���� : ");
		kor = scan.nextInt();
		System.out.print("���� : ");
		eng = scan.nextInt();
		System.out.print("���� : ");
		mat = scan.nextInt();
		System.out.print("���� : ");
		sci = scan.nextInt();
		System.out.print("���� : ");
		his = scan.nextInt();
		
		tot = kor + eng + mat + sci + his;
		avg = (double)(tot)/5;
		
		map.put("�̸�", name);
		map.put("����", "" + kor);
		map.put("����", "" + eng);
		map.put("����", "" + mat);
		map.put("����", "" + sci);
		map.put("����", "" + his);
		map.put("����", "" + tot);
		map.put("���", "" + avg);
		list.add(map);
	}
	public void disp() {
		System.out.println("=====================================================");
		System.out.println("�̸�\t����\t����\t����\t����\t����\t����\t���");
		System.out.println("=====================================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).get("�̸�") + "\t");
			System.out.print(list.get(i).get("����") + "\t");
			System.out.print(list.get(i).get("����") + "\t");
			System.out.print(list.get(i).get("����") + "\t");
			System.out.print(list.get(i).get("����") + "\t");
			System.out.print(list.get(i).get("����") + "\t");
			System.out.print(list.get(i).get("����") + "\t");
			System.out.println(list.get(i).get("���"));
		}
		System.out.println("=====================================================");
	}
}
