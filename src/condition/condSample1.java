package condition;

import java.util.Scanner;

/*
 * 조건문이란? 문제해결에 실마리가 되는 상황이나 여건을 파악하여 기술하는 것.
 * 1. if문 (단순if문)
 * 2. if ~ else문 
 * 3. if ~ elseif문
 * 4. if if else if 문
 * */

public class condSample1 {

	
		// 홍길동이라는 사람이 살고 있습니다. 이사람이 시험을 보았는데, 80점을 받았습니다.
		// 그러면, 합격입니다.
		
//		String name = "홍길동";
//		int Score = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요 : ");
//		Score = sc.nextInt();
//     1.		
//		if (Score >= 80){
//			System.out.println("합격");
//		}
//	   2.
//      if (Score >= 80){
//			System.out.println("합격");
//		}
//		else {
//			System.out.println("불합격");
//		}
//	   3.
//		if (Score >= 90){
//			System.out.println("A학점");
//		}
//		else if(Score >= 80){
//			System.out.println("B학점");
//		}
//		else if(Score >= 70){
//			System.out.println("C학점");
//		}
//		else if(Score >= 60){
//			System.out.println("D학점");
//		}
//		else {
//		System.out.println("F학점");
//	    }
//	   3-4. 번은 대부분 스위치 케이스나 삼항연산자로 돌림
		
		//조건연산자 (삼항연산자)
		// int x = (조건문) y? a:b ;
	// 홍길동이라는 사람이 살고 있습니다. 이사람이 시험을 보았는데, 80점을 받았습니다.
    // 그러면, 합격입니다.
	
//	public static void main(String[] args) {
//
//		String name = "홍길동";
//		int Score = 0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요 : ");
//		Score = sc.nextInt();
//
//		String str = (Score >= 80) ? "합격" : "불합격";
//		System.out.println(name + " 님은 " + Score + " 점으로 " + str + " 하셨습니다.");
//	}
//}

//문제> 임의의 수를 입력받아서 음수인지, 양수인지, 0인지를 판별하여 출력하세요.

//	public static void main(String[] args) {
//
//		int number = 0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		number = sc.nextInt();
//
//		if (number == 0) {
//			System.out.println("0을 입력하셨습니다.");
//		} else {
//
//			String str = (number % 2 == 0) ? "짝수" : "홀수";
//
//			System.out.println(str + "입니다.");
//		}
//	}
//}
//	public static void main(String[] args) {
//
//		int number = 0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		number = sc.nextInt();
//
//		String str = (number > 0) ? "양수" : (number < 0) ? "음수" : "0";
//
//		System.out.println(str + "입니다.");
//	}
//
//}
//	public static void main(String[] args) {
//
//		int number = 0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		number = sc.nextInt();
//
//		if (number > 0) {
//			System.out.println("양수 입니다.");
//		} else if (number < 0) {
//			System.out.println("음수 입니다.");
//		} else {
//			System.out.println("0입니다.");
//		}
//	}
//
//}
	//문제> 임의의 수를 입력받아서 짝수인지, 홀수인지, 0인지를 판별하여 출력하세요.

//	public static void main(String[] args) {
//
//		int number = 0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		number = sc.nextInt();
//
//		if (number == 0) {
//			System.out.println("0을 입력하셨습니다.");
//		} else {
//
//			String str = (number % 2 == 0) ? "짝수" : "홀수";
//
//			System.out.println(str + "입니다.");
//		}
//	}
//}
//
//	public static void main(String[] args) {
//
//		int number = 0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		number = sc.nextInt();
//		if (number % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
//	}
//}
//	public static void main(String[] args) {
//
//		int number = 0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		number = sc.nextInt();
//		
//		String x = (number % 2 == 0) ? "짝수" : "홀수";
//		System.out.println(x);
//	}
}


