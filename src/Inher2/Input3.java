package Inher2;

import java.util.Scanner;

public class Input3 {
	static int sum3 = 0;
	static int input3() {
		int input3;

		Scanner sc = new Scanner(System.in);
		System.out.println("입금하실 금액을 입력해 주세요.");
		input3 = sc.nextInt();
		sum3 += input3;
		return sum3;
	}
}

