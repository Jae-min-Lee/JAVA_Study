package Inher2_Teacher;

import java.util.Scanner;

/*
 * 저축은행이 있습니다. 첫 개설에 100원을 입금합니다.
 * 그리고, 3000원, 5000원, 10000원을 차례로 입금합니다.
 * 중간에 2500원을 찾습니다.
 * 현재까지 누적된 금액은 얼마일까요?
 * 상속을 이용하고 클래스를 용도별로 나누어서 구현해봅니다.
 * 필요하다면, 기능별로 메소드를 만들어 처리합니다.
 * 
 * 요구사항 파악 : 입금과 출력
 * 요구사항 분석 : 상속 , 1) extends, 2) implements
 * 요구사항 설계 :
 *      클래스 : AccountInput, AccountOutput, AccountMain
 *      메소드 : 초기 입금은 생성자로, 차후 입금은 일반메소드이거나 생성자메소드 형태이거나 setter & getter 형태로.
 * 요구사항 구현 : coding
 * 요구사항 테스트 : error처리(예외처리)
 * 
 */

class AccountOutput extends AccountInput {

	public AccountOutput() {
		super(money);//부모에게 가라
	}

	public static int total;

	public void withdraw(int outmoney) {

		if (total > outmoney) {
			System.out.println("출금하실 금액이 잔액보다 많습니다." + "\n"
					+ "다시 입력하여 주시기 바랍니다.");
		} else
			total = total - outmoney;
		
		System.out.println("출금하신 계좌의 잔액은 " + total + "원 입니다.");
	}
}

class AccountInput {

	public static int money;
	public static int total;

	public AccountInput(int iniValue) {

		this.total = iniValue;

	}

	public void deposit(int money) {

		this.money = money;

		if (money < 0)
			System.out.printf("입금액이 잘 못 되었습니다." + "\n" + "다시 입력하여 주시기 바랍니다.");
		else
			total += money;

	}
}

public class InherSample6_BankAccount_T {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("계좌 개설에 필요한 금액을 입력하여 주십시오.");
		int iniValue = sc.nextInt();

		AccountInput ai = new AccountInput(iniValue);
		
		int count = 0;
		// 입금
		
			System.out.println("입금하실 금액을 입력해 주세요.");
			int money = sc.nextInt();
			ai.deposit(money);
		

		// 출금
		AccountOutput ao = new AccountOutput();
		System.out.println("찾으실 금액을 입력해 주세요.");
		int outmoney = sc.nextInt();
		ao.withdraw(outmoney);

	}

}
