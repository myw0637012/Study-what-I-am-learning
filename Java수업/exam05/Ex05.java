package exam05;

public class Ex05 {
	//�������
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;

	
//������ - �⺻������, ()�ȿ� �ƹ��͵� ���°�
//	public Ex05() {
//	}

//
	public Ex05(String name, int kor, int eng, int mat) { //()���� �Ű�����, �Ű������� �ٸ��� ������ ��������
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
		avg = (double)tot / 3;
	}
	
//�����ڴ� �������� �ʱ�ȭ �����ִ°�	
	
}
