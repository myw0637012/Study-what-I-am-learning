package exam20;

import java.util.HashMap;

public class Example {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
//		System.out.println(capitalCities);
		capitalCities.put("England","London");//���߰�
		capitalCities.put("Germany","Berlin");
		capitalCities.put("Norway","Oslo");
		capitalCities.put("USA","Washington DC");//size������ ����
		
//		System.out.println(capitalCities);//Ű = ��

//		System.out.println(capitalCities.get("England"));
//		capitalCities.remove("England");
//		System.out.println(capitalCities);
		
//		capitalCities.clear();
//		System.out.println(capitalCities);

//		System.out.println(capitalCities.size());
		
		for (String s : capitalCities.keySet()) {//Ű�� ���
			System.out.println(s);
		}
		System.out.println();
//		
		for (String s : capitalCities.keySet()) {
			System.out.println(capitalCities.get(s));//���� ���
		}
		System.out.println();
//		
//		
		for (String s : capitalCities.values()) {//���� ���
			System.out.println(s);
		}
		System.out.println();
//
		for (String s : capitalCities.keySet()) {
			System.out.println("key : " + s + ", value : " + capitalCities.get(s));//Ű,�� ���� ���
		}
		System.out.println();

//==============================================================================================
		
//		HashMap<String, Integer> people = new HashMap<String, Integer>();
//
//		people.put("john", 32);
//		people.put("Steve", 30);
//		people.put("Angle", 33);
//		System.out.println(people);
//		System.out.println();
//		
//		for (String s : people.keySet()) {
//			System.out.println("key : " + s + ", value : " + people.get(s));
//		}
//		System.out.println();
//
//		for (String s : people.keySet()) {
//			System.out.println(s);
//		}
//		System.out.println();
//		
//		for (String s : people.keySet()) {
//			System.out.println(s + "," + people.get(s));
//		}
//		System.out.println();

		
	}

}
//����Ʈ : ������ �ִ�(�ε������� ����), �ߺ��� ���� �����ִ�.
//�� : Ű���� �ߺ��ɼ� ����. Ű = ������·� ��µǹǷ� �ε����� ����.
//List, Map <-- Container����, �ݺ��� ���