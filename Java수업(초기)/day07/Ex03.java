package day07;

public class Ex03 {

	public static void main(String[] args) {
//�迭
//Ÿ�� ����(����)
//Ÿ��

//		String[] car1; �̷��� �ϸ� ����(���� �ϰ� �ʱ�ȭ ���� ����)
//		String[] car1 = {"Volvo","BMW","Ford","Mazda"};
//		System.out.println(car1); �޸𸮰� ��ȯ��.
//		System.out.println(car1[0]);
//		System.out.println(car1[2]);

		int[] myNum = {10,20,30,40};
//		System.out.println(myNum[1]);
//		System.out.println(myNum[3]);
	
//		int[] myNum2 = {1,2,3,4,"5"};5�� ���ڶ� �ȵ�
		int[] myNum3 = new int[7];//���� �� ����
//		myNum3[0] = 1;
//		myNum3[1] = 2;
//		myNum3[2] = 3;
//		myNum3[3] = 4;
//		myNum3[4] = 5;
//		myNum3[5] = 6;
//		myNum3[6] = 7;

		int[] myNum4 = new int[] {10,20,30,40,50};
//		System.out.println(myNum4[2]);
	
//		System.out.println(myNum.length);
//		System.out.println(myNum3.length);
//		System.out.println(myNum4.length);
	
//		for (int i = 0; i < myNum4.length; i = i + 1) {
//			System.out.println(myNum4[i]);
//		}
	
		System.out.println(myNum4[2]);
		myNum4[2] = 100;
		System.out.println(myNum4[2]);

		
		
		
		
	}

}
