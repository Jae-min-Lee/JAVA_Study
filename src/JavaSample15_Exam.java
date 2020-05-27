import java.util.Scanner;

//문제> 키보드로부터 두수를 입력받아서 덧셈, 뺄셈, 곱셈, 나눗셈을 구하여 출력하세요.
//단, 메소드를 이용할 것.
/* 요구사항 파악 : 가감승 계산
 * 요구사항 분석 : 키보드 입력, 연산, 출력
 * 요구사항 설계 : 데이터(정수형or실수형)가 무엇인지 파악, 어떤 변수(정수형 = num1, 실수형 = num2)를 써야할지 파악, 
 *            어떤 자료형을 사용해야할지 파악, 
 *            메소드명(덧셈 : adder, 뺄셈 : sub, 곱셈 : mul, 나눗셈(몫) : div, 나눗셈(나머지) : div2)
 * 요구사항 코딩 : 
 * 
 * */
public class JavaSample15_Exam {

	private static void sum1(int i) {
		System.out.println("덧셈 : " + i);
	}

	private static void sum4(int i) {
		System.out.println("뺄셈 : " + i);
	}

	private static void sum3(int i) {
		System.out.println("곱셈 : " + i);
	}

	private static void sum2(int i) {
		System.out.println("나눗셈 : " + i);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		int a = sc.nextInt();
		System.out.print("숫자를 입력해 주세요 : ");
		int b = sc.nextInt();
		sum1(a + b);
		sum2(a - b);
		sum3(a * b);
		sum4(a / b);

	}

}
