package exam13;

public class Car extends Vehicle {//��� : �θ�(Vehicle)�� ���� �ڽ�(Car)�� �����޾Ƽ� ����. ����Ҷ��� extends + �θ� class
	private String modeName = "Mustang";
	
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.modeName);
		car.honk();
		System.out.println(car.brand);
		System.out.println(car.modeName);
	}

}
