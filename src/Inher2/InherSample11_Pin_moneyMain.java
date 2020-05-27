package Inher2;

import java.util.Scanner;

/*
 * 상속 연습문제
 * 용돈 : 아빠가 용돈을 2000원을 주셨습니다.
 *      엄마는 용돈을 3000원을 주셨습니다.
 *      두분에게 받은 금액을 합산하여 출력하세요.
 *      단, 상속을 이용합니다.
 *      
 */
public class InherSample11_Pin_moneyMain extends MomMoney{

	public InherSample11_Pin_moneyMain(int money1) {
		super(money1);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		do{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------용돈기입장------------");
		System.out.print("아버지가 주신용돈 : ");
		int money1 = sc.nextInt();
		System.out.print("어머니가 주신용돈 : ");
		FatherMoney fm = new FatherMoney(money1);
		int money2 = sc.nextInt();
		MomMoney(money2);
		System.out.println("용돈 총 합계 : " + total);
		}while(true);

	}
}
