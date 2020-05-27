package methodtest;

import java.util.Scanner;

/*
 * 가감승계산을 메소드 오버로딩을 이용하여 결과를 출력하세요.
 * 메소드> calculator
 */
public class methodOverLoding2 {

	private static void calculator(int su1, int su2) {

		int sum = su1 + su2;

		System.out.println("덧셈 : " + sum);

	}

	private static void calculator(int su3, double su4) {

		double sum = su3 - su4;

		System.out.println("뺄셈 : " + sum);

	}

	private static void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수형 수 입력 : ");
		int su1 = sc.nextInt();
		System.out.println("정수형 수 입력 : ");
		int su2 = sc.nextInt();

		int sum = su1 * su2;

		System.out.println("곱셈 : " + sum);

	}

	private static void calculator(double su5, double su6) {

		double sum = su5 / su6;

		System.out.println("나눗셈 : " + sum);

	}

	private static void calculator(double su7, int su8) {

		double sum = su7 % su8;

		System.out.println("나눗셈2 : " + sum);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수형 수 입력 : ");
		int su1 = sc.nextInt();
		System.out.println("정수형 수 입력 : ");
		int su2 = sc.nextInt();
		calculator(su1, su2);

		System.out.println("정수형 수 입력 : ");
		int su3 = sc.nextInt();
		System.out.println("실수형 수 입력 : ");
		double su4 = sc.nextDouble();
		calculator(su3, su4);

		calculator();

		System.out.println("실수형 수 입력 : ");
		double su5 = sc.nextDouble();
		System.out.println("실수형 수 입력 : ");
		double su6 = sc.nextDouble();
		calculator(su5, su6);

		System.out.println("실수형 수 입력 : ");
		double su7 = sc.nextDouble();
		System.out.println("정수형 수 입력 : ");
		int su8 = sc.nextInt();
		calculator(su7, su8);

	}

}
