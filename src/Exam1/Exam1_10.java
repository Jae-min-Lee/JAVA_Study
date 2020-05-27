package Exam1;

import java.util.Scanner;

/*
 * 1. 물건을 삽니다. 커피 가격은 개당 4000원 이었을 때, n개의 커피를 구입합니다.
 * 이때 부가세는 10%를 부과합니다.
 * 거스름돈은 얼마인가요 ?
 * 
 * 2. 주어진 초를 이용하여 몇시간 몇분 몇초인가를 알아보는 프로그램을 작성합니다.
 * 
 * 3. 입력 50 + 40       50 - 40
 *    출력 50 + 40 = 90     50 - 40 = 10
 *    Scanner version으로 작성하세요
 *    
 * 4. 3번을 이클립스에 Args 인자값으로 입력받아서 처리하는 프로그램을 작성하세요.
 * 
 * */
public class Exam1_10 {

	public static void main(String[] args) {

		int coffee = 0;
		int pay = 0;
		int price = 4000;
		int cost2 = 0;
		int count = 0;
		double vat = 0.1;
		
		while(count < 2){

		Scanner sc = new Scanner(System.in);

		System.out.println("구매하실 커피의 갯수를 입력 하세요 : ");
		coffee = sc.nextInt();
		System.out.println();
		System.out.println("지불하실 금액을 입력해주세요 : ");
		pay = sc.nextInt();
		System.out.println();

		double price2 = (int) (price * coffee);
		double vat2 = (int) (price * coffee * vat);
		double value = (int) price2 + (int) vat2;
		double cost = (int) (pay - value);

		if (pay < (int) value)
			System.out.println("지불하신 금액이 모자랍니다.");
		else
			System.out.println("커피 값은 " + (int) value + "원 이며 거스름돈은 "
					+ (int) cost + "원 입니다.");
		System.out.println();
		cost2+=cost;
		System.out.println("누적 거스름돈 : " + cost2);//vat의 연산ㅇ ㅣ제대로 되었는지를 확인이 가능합니다.
		System.out.println();
		}
	}
}
