
public class Exam03������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� �ڱ��ڽ��� ������ ����� ������ ������

		for (int b = 2; b <= 1000; b++) {
			int result = 0;

			for (int i = b, a = 1; a < i; a++) {
				if (i % a == 0) {
					result = result + a;
				}

			}
			if (b == result) {
				System.out.println(result);
			}

		}

	}

}
