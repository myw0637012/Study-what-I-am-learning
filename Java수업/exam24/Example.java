package exam24;

import java.io.File;
public class Example {

	public static void main(String[] args) {
		try {
			File myObj = new File("test.txt");//import �ʿ�.
			
			if (myObj.createNewFile()) {
				System.out.println("File create : " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (Exception e){
			System.out.println("An error occurred.");//������ �߻��߽��ϴ�.
			e.printStackTrace();
		}

	}

}
//����ó��