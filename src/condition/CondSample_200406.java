package condition;

import java.util.Scanner;

public class CondSample_200406 {

	// 문제> 임의의 수를 입력받아서 짝수인지, 홀수인지, 0인지를 판별하여 출력하세요.

	public static void main(String[] args) {

		int score = 0, i = 0;
		String name = "";

		// 초기값 조건식 증감식
//		 for (int i = 0; i < 5; i++) {

		do { // 무한반복 처리 (true)
		i += 1;// i = i + 1 ,count (cnt)
		// 무조건 한번은 실행합니다.
		// do {
		// i += 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요 : ");
		name = sc.next();
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();

		if (score == 0) {
			System.out.println("0을 입력하셨습니다.");
		} else {

			String str = (score > 80) ? "합격" : "불합격";// 2의 배수 , 짝수 달인지,
															// 홀 수 달인지.

			System.out.println(name + " 님의 점수는 " + score + " 점으로 " + str + "입니다.");
		}
		System.out.println();
		}
	  while (i < 3);
	}

}
