
public class Exam01삼의배수만더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 100까지의 3의배수의 총합을 출력
		int result = 0;
		//result을 0으로 두어서 조건에 맞는 3의배수를 더해준값을 저장시킨다
		for (int i = 1; i <=100; i++) { //1부터 100까지의 숫자를 뽑는다
			if (i % 3 == 0) {//1부터 100중 3으로 나누었을때 나머지가 0이라면 3의 배수이므로 나머지가 0인것을 뽑는다
			//System.out.println(i);
			result = result + i;}//뽑힌수만을 result값에 더해준다
		}
		System.out.println(result); //1부터 100 중 뽑힌 3의배수를 더한값을 뽑는다
		
		
		
	}

}
