package exam12;
//��ü�迭
class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void disp() {
		System.out.println(name + " : " + age);
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Person[] pa = new Person[5];
		pa[0] = new Person("ȫ�浿", 22);
		pa[1] = new Person("��ö��", 32);
		pa[2] = new Person("�̿���", 28);
		pa[3] = new Person("�����", 44);
		pa[4] = new Person("������", 37);

		for (int i = 0; i<pa.length;i = i + 1) {
			pa[i].disp();
		}
	}
}
