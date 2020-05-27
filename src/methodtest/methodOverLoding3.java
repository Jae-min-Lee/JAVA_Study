package methodtest;

/*
 * 가감승계산을 메소드 오버로딩을 이용하여 결과를 출력하세요.
 * 메소드> calculator
 * 1. 덧셈, 2. 뺄셈, 3. 곱셈, 4. 나눗셈, 5. 나눗셈(나머지)
 * 반복 수행 하도록 프로그램을 작성하세요.
 */
import java.util.Scanner;

public class methodOverLoding3 {

	private static double num1;
	private static double num2;
	private static double num3;
	private static int su1;

	private static void calculator(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("덧셈 : " + sum);
	}

	private static void calculator(double num1, int num2) {
		double sum = num1 - num2;
		System.out.println("뺄셈 : " + sum);
	}

	private static void calculator(int num1, int num2) {
		int sum = num1 * num2;
		System.out.println("곱셈 : " + sum);
	}

	private static void calculator(double num1, double num2, double num3) {
		double sum = num1 / num2;
		System.out.println("나눗셈 : " + sum);
	}

	private static void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수형 데이터를 입력해 주세요 : ");
		num1 = sc.nextDouble();
		System.out.print("실수형 데이터를 입력해 주세요 : ");
		num2 = sc.nextDouble();
		double sum = num1 % num2;
		System.out.println("나눗셈2 : " + sum);

	}

	public static void main(String[] args) {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out
						.println("1. 덧셈, 2. 뺄셈, 3. 곱셈, 4. 나눗셈, 5. 나눗셈(나머지), 6. 종료");
				su1 = sc.nextInt();
				switch (su1) {

				case 1:
					try {
						System.out.print("실수형 데이터를 입력해 주세요 : ");
						num1 = sc.nextDouble();
						System.out.print("실수형 데이터를 입력해 주세요 : ");
						num2 = sc.nextDouble();
						calculator(num1, num2);// int, double
					} catch (java.util.InputMismatchException e) {
						// e.printStackTrace();
						System.out.println("입력데이터의 자료형이 다릅니다.");
					}
					break;

				case 2:
					try {
						System.out.print("실수형 데이터를 입력해 주세요 : ");
						num1 = sc.nextDouble();
						System.out.print("정수형 데이터를 입력해 주세요 : ");
						num2 = sc.nextDouble();
						calculator(num1, (int) num2);
					} catch (java.util.InputMismatchException e) {
						// e.printStackTrace();
						System.out.println("입력데이터의 자료형이 다릅니다.");
					}
					break;

				case 3:
					try {
						System.out.print("정수형 데이터를 입력해 주세요 : ");
						num1 = sc.nextDouble();
						System.out.print("정수형 데이터를 입력해 주세요 : ");
						num2 = sc.nextDouble();
						calculator((int) num1, (int) num2);
					} catch (java.util.InputMismatchException e) {
						// e.printStackTrace();
						System.out.println("입력데이터의 자료형이 다릅니다.");
					}
					break;

				case 4:
					try {
						System.out.print("정수형 데이터를 입력해 주세요 : ");
						num1 = sc.nextDouble();
						System.out.print("정수형 데이터를 입력해 주세요 : ");
						num2 = sc.nextDouble();
						System.out.print("정수형 데이터를 입력해 주세요 : ");
						num3 = sc.nextDouble();
						calculator(num1, num2, num3);
					} catch (java.util.InputMismatchException e) {
						// e.printStackTrace();
						System.out.println("입력데이터의 자료형이 다릅니다.");
					}
					break;

				case 5:
					try {
						calculator();
					} catch (java.util.InputMismatchException e) {
						// e.printStackTrace();
						System.out.println("입력데이터의 자료형이 다릅니다.");
					}

				case 6:
					System.out.println("프로그램이 정상적으로 종료되었습니다.");
					System.exit(0);

				}
			} catch (java.util.InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("입력데이터의 자료형이 다릅니다.");
			}
		}
	}
}
