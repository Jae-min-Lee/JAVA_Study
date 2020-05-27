package Inher2;

import java.util.Scanner;

/*
 * 저축은행이 있습니다. 첫 개설에 100원을 입금합니다.
 * 그리고, 3000원, 5000원, 10000원을 차례로 입금합니다.
 * 중간에 2500원을 찾습니다.
 * 현재까지 누적된 금액은 얼마일까요?
 * 상속을 이용하고 클래스를 용도별로 나누어서 구현해봅니다.
 * 필요하다면, 기능별로 메소드를 만들어 처리합니다.
 * */
public class InherSample6_BankAccount extends Input1 implements Input4 {

	Scanner sc = new Scanner(System.in);

	int sub;
	int sum4 = 0;

	@Override
	public void input4() {
		int input4;

		System.out.println("입금하실 금액을 입력해 주세요.");
		input4 = sc.nextInt();
		sum4 += input4;
	}

	@Override
	public void output() {
		int output;
		System.out.println("찾으실 금액을 입력해 주세요.");
		output = sc.nextInt();
		sub = output;
	}

	@Override
	public void total() {
		int total = sum1 + sum2 + sum3 + sum4 - sub;
		System.out.println("고객님의 계좌에는 총 : " + total + "원 이 있습니다.");
	}

	public static void main(String[] args) {

		input1();
		input2();
		input3();
		InherSample6_BankAccount is6 = new InherSample6_BankAccount();
		is6.input4();
		is6.output();
		is6.total();

	}
}
