
public class Exam01���ǹ�������ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1���� 100������ 3�ǹ���� ������ ���
		int result = 0;
		//result�� 0���� �ξ ���ǿ� �´� 3�ǹ���� �����ذ��� �����Ų��
		for (int i = 1; i <=100; i++) { //1���� 100������ ���ڸ� �̴´�
			if (i % 3 == 0) {//1���� 100�� 3���� ���������� �������� 0�̶�� 3�� ����̹Ƿ� �������� 0�ΰ��� �̴´�
			//System.out.println(i);
			result = result + i;}//���������� result���� �����ش�
		}
		System.out.println(result); //1���� 100 �� ���� 3�ǹ���� ���Ѱ��� �̴´�
		
		
		
	}

}
