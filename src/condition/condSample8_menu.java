package condition;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * 음식점의 메뉴가 다양하게 전시되어있습니다.
 * 1.피자  2.스파게티  3.햄버거  4.스프  5.토마토  6.종료
 * 피자가격은 8600원이고, 스파게티는 15000원, 햄버거는 10만원, 스프는 5천원, 토마토는 3500원 입니다.
 * if문으로 작성하고, 이를 switch ~ case문으로 옮겨보세요
 * ==============================
 *     메뉴                가격
 * ==============================
 * 1. 피자                8,600
 * 2. 스파게티         15,000
 * 3. 햄버거           100,000
 * 4. 스프                 5,000
 * 5. 토마토              3,500
 * 6. 종료
 *=================================
 *다음 메뉴 중에서 고르세요
 *1
 *주문할 피자의 갯수를 입력하세요 : 3
 *8600 * 3 = 25,800원 입니다.
 *6
 *프로그램이 종료되었습니다.
 * */
public class condSample8_menu {

	static int num1, num2;
	static int pizza = 8600, spa = 15000, ham = 10000, soup = 5000,
			tomato = 3500;
	static String dfNum2 = "";
	public static void main(String[] args) {
		while (true) {
			// 숫자 금액 표시 클래스
			DecimalFormat df = new DecimalFormat("###,###");

			System.out.println("======Menu==========Price======");
			System.out.println("=== 1.피자                         8,600   ===");
			System.out.println("=== 2.스파게티                   15,000  ===");
			System.out.println("=== 3.햄버거                      10,000  ===");
			System.out.println("=== 4.스프                         5,000   ===");
			System.out.println("=== 5.토마토                      3,500   ===");
			System.out
					.println("=== 6.종료                                           ===");
			System.out.println("===============================");
			Scanner sc = new Scanner(System.in);
			System.out.println("다음 메뉴 중에서 고르세요.");
			System.out.println("프로그램 종료는 6번 입니다.");
			num1 = sc.nextInt();
			if (num1 == 6) {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);// 안전하게 정상적으로 프로그램 종료
			}
			System.out.println("주문한 음식의 갯수를 입력하세요.");
			num2 = sc.nextInt();
			switch (num1) {
			
			case 1 : 
				num2 *= pizza;
				dfNum2 = df.format(num2);
				System.out.println("피자는  : " + dfNum2 + "원 입니다.");
				break;
			case 2 :
				num2 *= spa;
				dfNum2 = df.format(num2);
				System.out.println("스파게티는  : " + dfNum2 + "원 입니다.");
				break;
			case 3 : 
				num2 *= ham;
				dfNum2 = df.format(num2);
				System.out.println("햄버거는  : " + dfNum2 + "원 입니다.");
				break;
			case 4 :
				num2 *= soup;
				dfNum2 = df.format(num2);
				System.out.println("스프는  : " + dfNum2 + "원 입니다.");
				break;
			case 5 : 
				num2 *= tomato;
				dfNum2 = df.format(num2);
				System.out.println("토마토는  : " + dfNum2 + "원 입니다.");
				break;
			}
		}
	}

}
