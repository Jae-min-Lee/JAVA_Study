package FileIo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 파일 입출력을 이용하여 가감승제산을 연산해 봅니다.
 */
public class FileSample6 {
	private static int num1;
	private static int num2;

	private static void div2Num(int num1, int num2) {
		int res5 = num1 + num2;// result1
		System.out.println("%:" + res5);

	}

	private static void div1Num(int num1, int num2) {
		int res4 = num1 / num2;// result1
		System.out.println(" / : " + res4);

	}

	private static void multiNum(int num1, int num2) {
		int res3 = num1 * num2;// result1
		System.out.println(" x : " + res3);

	}

	private static void minusNum(int num1, int num2) {
		int res2 = num1 - num2;// result1
		System.out.println(" - : " + res2);

	}

	private static void plusNum(int num1, int num2) {
		int res1 = num1 + num2;// result1
		System.out.println(" + : " + res1);

	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("첫번째 수를 입력하세요.");
			num1 = Integer.parseInt(br.readLine());
			System.out.println("첫번째 수를 입력하세요.");
			num2 = Integer.parseInt(br.readLine());

			plusNum(num1, num2);

			minusNum(num1, num2);

			multiNum(num1, num2);

			div1Num(num1, num2);

			div2Num(num1, num2);
		} catch (ArithmeticException e) {
			System.out.println("어떤 수를 0으로 연산 할 수 없습니다.");
		} catch (NumberFormatException e) {
			System.out.println("잘못 입력하셨습니다.");
		} catch (Exception e) {
			System.out.println("예상치 못한 상황이 발생하였습니다.");
		}
	}
}