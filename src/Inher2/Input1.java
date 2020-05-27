package Inher2;

import java.util.Scanner;

public class Input1 extends Input2{
	
	static int sum1 = 0;
	
	static int input1() {

		int input1;

		Scanner sc = new Scanner(System.in);
		System.out.println("계좌개설에 필요한 금액을 입력해 주세요.");
		input1 = sc.nextInt();
		sum1 += input1;
		return sum1;
	}
}
