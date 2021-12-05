
public class Exam04for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문 언제부터 언제까지가 정해져있다
		// 1을 5번 출력시켜주세요!
		int cnt = 1;
		while (cnt <=5) {
			System.out.println(1);
			cnt++;
		}
		// i=1이 먼저 실행
		// i<=5가 다음에 실행
		// 그다음 출력을 한후 i++이 실행되고
		// 다시 i<=5를 실행시키고 다시 출력 되는것을 계속 반복
		for(int i=1; i<=10; i++) {
			System.out.println(1);
		}

		// 11 부터 30까지 출력시켜주세요

		for (int i = 11; i <= 30; i++) {
			System.out.println(i);
		}
		//96~53출력
		for (int i = 96; i>=53; i--) {
			System.out.println(i);
		}
	}

}
