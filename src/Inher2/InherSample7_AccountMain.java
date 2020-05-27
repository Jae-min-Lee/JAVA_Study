package Inher2;

import java.util.Scanner;

/*
 * 문제] 입금, 출금, 계좌조회(잔액조회), 잔액이 100000원 이상이면 종료
 * 1. 입금메뉴
 * 2. 출금 메뉴
 * 3. 계좌 메뉴
 * [조건] if문(switch ~ case), 상속이용
 * */

class BankAccount {

	static void deposit(int input) {
		// TODO Auto-generated method stub
		
	}
	
	void withdraw(int output) {
		// TODO Auto-generated method stub
		
	}
	
	int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class InherSample7_AccountMain {
	
	int gugee;
	
	public static void main(String[] args) {

		while (true) {

			int menu, input, output;

			Scanner sc = new Scanner(System.in);
			System.out.println("==========================");
			System.out.println("1. 입금      2. 출금      3. 계좌조회");
			System.out.println("==========================");
			System.out.println();
			System.out.println("원하시는 메뉴를 선택해 주세요.");
			menu = sc.nextInt();
			InherSample7_AccountMain is7 = new InherSample7_AccountMain();
			is7.gugee = 0;
			switch (menu) {

			case 1:
				System.out.print("입금 액을 입력하세요.(단위 : 원) ");

		        input = sc.nextInt();

		        is7.deposit(input);

		        System.out.println(input + " 원 입금 후 잔액 : " + is7.getBalance());
				break;
				
			case 2:
				
				System.out.print("출금 액을 입력하세요.(단위 : 원) ");

		        output = sc.nextInt();

		        is7.withdraw(output);

		        if(is7.gugee == 1){

		        break;

		        }

		        System.out.println(output + " 원 출금 후 잔액 : "+is7.getBalance());
				break;

			case 3:
				is7.search();
				break;
			}
		}
	}

	private void deposit(int input) {
		// TODO Auto-generated method stub
		
	}

	private int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void withdraw(int output) {
		// TODO Auto-generated method stub
		
	}

	private void search() {
		// TODO Auto-generated method stub
		
	}

}
