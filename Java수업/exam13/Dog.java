package exam13;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);//�θ�Ŭ������ �Ű�����
	}
	void sound() {
		super.sound();
		System.out.println("�۸�");
	}
}
