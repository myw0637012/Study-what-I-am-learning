package exam19;

import java.util.ArrayList;
import java.util.Collections;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();//�ڿ� Integer�� ����� �ȴٸ�, ����.
		nums.add(30);
		nums.add(10);
		nums.add(40);
		nums.add(20);//������ �ִ�(index ��밡��)

		Collections.sort(nums);//������
		
		for (int i : nums) {
			System.out.println(i);
		}

		nums.clear();//������ ���
		System.out.println(nums);
		
		
//		for (int i = 0; i<nums.size(); i = i + 1) {
//			System.out.println(nums.get(i));
//		}

	}

}
