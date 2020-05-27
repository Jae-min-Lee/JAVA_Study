import java.util.Scanner;

//문제> 키보드로부터 두수를 입력받아서 덧셈, 뺄셈, 곱셈, 나눗셈을 구하여 출력하세요.
//단, 메소드 이용하여 
/* 요구사항 파악: 가감승제산 
 * 요구사항 분석: 키보드 입력, 연산, 출력
 * 요구사항 설계: 데이터(정수형, 실수형), 변수명(num1, num2), 자료형 파악, 
 * 			 메소드명(덧셈: adder, 뺄셈: sub, 곱셈: mul, 나눗셈(몫): div1, 나눗셈(나머지): div2
 * 요구사항 코딩: 
 */
public class JavaSample9_Method6Exam {
	private static double num1;
	private static double num2;

	private static void adder(int num1, double num2) {
		double sum = num1 + num2;
		System.out.println("덧셈 : " + sum);
	}

	private static void sub(int num1, double num2) {
		double sum = num1 - num2;
		System.out.println("뺄셈 : " + sum);
	}

	private static void mul() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실수형 데이터를 입력해 주세요.");
		num1 = sc.nextDouble();
		System.out.println("정수형 데이터를 입력해 주세요.");
		num2 = sc.nextInt();

		double sum = num1 * num2;
		System.out.println("곱셈  : " + sum);
	}

	private static void div1() {
		double mok = num1 / num2;
		System.out.println("나눗셈(mok) : " + mok);
	}

	private static void div2() {
		double remainer = num1 % num2;
		System.out.println("나눗셈(remainer) : " + remainer);
	}

	public static void main(String[] args) {
		// 1.덧셈 구하기

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수형 데이터를 입력해 주세요.");
			int num1 = sc.nextInt();
			System.out.println("실수형 데이터를 입력해 주세요.");
			double num2 = sc.nextDouble();

			adder(num1, num2);
			// 2.뺄셈 구하기
			sub(num1, num2);
			// 3.곱셈 구하기
			mul();
			// 4.나눗셈 몫 구하기
			div1();
			// 5.나눗셈 나머지 구하기
			div2();
		} catch (java.util.InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("입력데이터의  자료형이 다릅니다.");
		}
	}

}
