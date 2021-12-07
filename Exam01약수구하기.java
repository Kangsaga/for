import java.util.Scanner;

public class Exam01약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 약수 구하기
		// 12-> 결과 : 12의 약수는 1,2,3,4,6,12 입니다
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.print(num + "의 약수는 ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i);
				if (num != i) {
					System.out.print(",");
				}
			}
		}System.out.println(" 입니다");

	}

}
