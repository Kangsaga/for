import java.util.Scanner;

public class Exam01������ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��� ���ϱ�
		// 12-> ��� : 12�� ����� 1,2,3,4,6,12 �Դϴ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		System.out.print(num + "�� ����� ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i);
				if (num != i) {
					System.out.print(",");
				}
			}
		}System.out.println(" �Դϴ�");

	}

}
