package Inher1;

import java.util.Scanner;

/*
 * 전달인자 값이 없고, 반환값이 있습니다.
 */
public class Multiply {
	public static int multiply() {

		Scanner sc = new Scanner(System.in);
		System.out.println("승산 첫번 째 데이터를 입력해 주세요.");
		int x3 = sc.nextInt();
		System.out.println("승산 두번 째 데이터를 입력해 주세요.");
		int y3 = sc.nextInt();

		int mul = 0;

		mul = x3 * y3;

		return mul;
	}
}
