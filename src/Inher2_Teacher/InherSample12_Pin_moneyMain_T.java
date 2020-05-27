package Inher2_Teacher;

import java.util.Scanner;

class Pin_money{
	
	private static int mom;
	private static int dad;
	private static int sum;
	
	public int getMom() {
		return mom;
	}
	public static void setMom(int mom) {
		Pin_money.mom = mom;
	}
	public int getDad() {
		return dad;
	}
	public static void setDad(int dad) {
		Pin_money.dad = dad;
	}
	public static int sum() {
	sum = mom + dad;
	return sum;
	}
	
}
/*
 * 상속 연습문제
 * 용던 : 아빠가 용돈을 2000원을 주셔습니다.
 *      엄마는 용돈을 3000원을 주셨습니다.
 *      두분에게 받은 금액을 합산하여 출력하세요.
 *      단, 상속, setter/getter 이용*/
public class InherSample12_Pin_moneyMain_T extends Pin_money{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------용돈기입장------------");
		System.out.print("어머니가 주신용돈ekd : ");
		int mom = sc.nextInt();
		System.out.print("아버지가 주신용돈ekd : ");
		int dad = sc.nextInt();
		setMom(mom);
		setDad(dad);
		
		int sum = sum();
		System.out.println("용돈의 합계ekd : " + sum);

	}

}
