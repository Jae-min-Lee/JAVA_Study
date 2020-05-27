package condition;

/* 다음과 같이 입력 받아서 연산자에 의해 처리하는 프로그램을 작성하세요.
 * 예> 30 + 50 = 80 , 40 - 20 = 20
 */
import java.util.Scanner;

public class condSample7 {

	public static void main(String[] args) {
		int num, num2, result;
		String oper = "";//객체변수(장조변수)

		System.out.println("부호를 입력하는 계산기");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		num = sc.nextInt();
		System.out.print("부호를 입력해 주세요 : ");
		oper = sc.next();
		System.out.print("숫자를 입력해 주세요 : ");
		num2 = sc.nextInt();
		if (oper.equals("+")) {//== <=숫자비교할 때 사용하는 기본 자료형
			result = num + num2;
			System.out.println("덧셈 : " + result);
		} else if (oper.equals("-")) {
			result = num - num2;
			System.out.println("뺄셈 : " + result);
		} else if (oper.equals("*")) {
			result = num * num2;
			System.out.println("곱셈 : " + result);
		} else if (oper.equals("/")) {
			result = num / num2;
			System.out.println("나눗셈(몫) : " + result);
		} else if (oper.equals("%")) {
			result = num % num2;
			System.out.println("나눗셈(나머지) : " + result);
		} else {
			System.out.println("수식에 문제가 발생하였습니다.");
		}
	}
}