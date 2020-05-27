package Inher2;

import java.util.Scanner;

public class Input2 extends Input3{
	static int sum2 = 0;
	
	static int input2() {
	
		int input2;

		Scanner sc = new Scanner(System.in);
		System.out.println("입금하실 금액을 입력해 주세요.");
		input2 = sc.nextInt();
		sum2 += input2;
		return sum2;
	}
}
