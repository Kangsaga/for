
public class Exam05for문사용수추출and합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1!100까지 숫자중 3의배수만 출력
		int result = 0;
		for (int i = 3; i <= 100; i += 3) {
//			System.out.println(i);
			result = result + i;
		}
		System.out.println("결과 : " + result);
	}

}
