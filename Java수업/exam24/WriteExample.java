package exam24;

import java.io.FileWriter;

public class WriteExample {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("test.txt");
			myWriter.write("�����ϼ���");
			myWriter.close();
			System.out.println("����");
		} catch (Exception e){
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
