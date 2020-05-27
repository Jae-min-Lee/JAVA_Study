//문제> 0~100사이의 5의 배수의 갯수와 합계 구하라.

import java.util.Scanner;

public class JavaSample17_MethodExam3 {

	private static void sum(int one, int back) {
		int sum = 0, count = 0;
		for (int i = one; i <= back; i += 5) {
			sum += i;
			count++;
		}
		System.out.println("합계 : " + sum);
		System.out.println("갯수 : " + count);
	}

	public static void main(String[] args) {
		System.out.println("0~100사이의 5의 배수의 갯수와 합계를 구하라");
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값(5)을 입력하세요 : ");
		int one = sc.nextInt();
		System.out.print("끝값(100)을 입력하세요 : ");
		int back = sc.nextInt();

		sum(one, back);
	}
}
