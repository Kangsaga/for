
public class Exam02������ϱ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���׷��̵�� ��� ���ϱ�
		for (int b = 2; b <= 30; b++) {
			System.out.print(b + "�� ��� : ");
			for (int i = b, a = 1; a <= i; a++) {
				if (i % a == 0) {
					System.out.print(a + " ");
				}
			}
			System.out.println();
		}

	}

}
