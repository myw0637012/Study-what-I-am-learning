package exam10;
//ĸ��ȭ : Getter & Setter : private ������ ���� �о���ų� �����Ҷ�
public class Person {
	private String name = "ȫ�浿";
	private int age;
	private String address;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
//	public String getName() {//Getter : ��������� public���� ����, get + ������(���� �빮��) ����
//		return name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setName(String name) {//Setter
//		this.name = name;
//	}
	
	
	
	
	
	
}
