package exam12;
//��ü�迭
public class Ex02 {

	public static void main(String[] args) {
		int[] s1 = {11,22,33,44,55};
		String[] s2 = {"��","��","��","��","��","��","��"};

//		for (int i = 0; i<s1.length;i=i+1) {
//			System.out.println(s1[i]);
//		}
		for (int i:s1) {//i�� �ƹ� �ų� �ᵵ �ȴ�
			System.out.println(i);
		}
		
		for (String s:s2) {
			System.out.println(s);
		}
	}

}
