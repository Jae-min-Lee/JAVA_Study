package condition;

import java.util.Scanner;

public class conSample2 {

//	public static void main(String[] args) {
//		//data input range : 0 ~ 100
//		int score = 0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요 : ");
//		score = sc.nextInt();
//		
//		if (score >= 0 && score <= 100){
//			System.out.println("정상적인 데이터 입니다.");
//		}
//		else{
//			System.out.println("비정상적인 데이터 입니다.");
//		}
//	}
	
//국어 점수와 수학 점수를 입력 받아서 점수의 범위가 정상적인지를 판별하여 출력하세요.
	
//	public static void main(String[] args) {
//
//		int kr, ma;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어점수를 입력하세요 : ");
//		kr = sc.nextInt();
//		
//		System.out.print("수학점수를 입력하세요 : ");
//		ma = sc.nextInt();
//
//		if (kr >= 0 && kr <= 100) {
//			System.out.println("정상적인 데이터 입니다.");
//		} else {
//			System.out.println("비정상적인 데이터 입니다.");
//		}
//		if (ma >= 0 && ma <= 100) {
//			System.out.println("정상적인 데이터 입니다.");
//		} else {
//			System.out.println("비정상적인 데이터 입니다.");
//		}
//		
		//문제> 두수를 입력받아서, 큰 값과 작은 값으로 구분하여 출력하세요.
	public static void main(String[] args) {

		int num1, num2, max, min;

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		num1 = sc.nextInt();

		System.out.print("숫자를 입력하세요 : ");
		num2 = sc.nextInt();

		int x = (num1 > num2) ? num1 : num2;
		int y = (num1 < num2) ? num1 : num2;

		System.out.println("큰 값 " + x);
		System.out.println("작은 값 " + y);

	}
}
