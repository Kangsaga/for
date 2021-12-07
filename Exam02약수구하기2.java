
public class Exam02약수구하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 업그레이드된 약수 구하기
		for (int b = 2; b <= 30; b++) {
			System.out.print(b + "의 약수 : ");
			for (int i = b, a = 1; a <= i; a++) {
				if (i % a == 0) {
					System.out.print(a + " ");
				}
			}
			System.out.println();
		}

	}

}
