
public class Exam03완전수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 완전수란 자기자신을 제외한 약수의 총합이 같은거

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
