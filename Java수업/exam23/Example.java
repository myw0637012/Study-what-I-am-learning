package exam23;

public class Example {

	public static void main(String[] args) {
		try {
			int[] nums= {1, 2, 3};
			System.out.println(nums[10]);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("�ε����� �߸��Ǿ����ϴ�.");//���ܹ߻��� ����
		} finally {//���� �߻��ص�, ���ص� ��µ�.
			System.out.println("The 'try catch' is finished..");
		}

	}

}
//����ó��