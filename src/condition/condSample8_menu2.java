package condition;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * 음식점의 메뉴가 다양하게 전시되어 있습니다.
 1.피자 2.스파게티 3.햄버거 4.스프 5.토마토가 존재 합니다.
 피자 가격은 8600원이고, 스파게티는 15000원, 햄버거는 1만원, 스프는 5천원, 토마토는 3500원 입니다.
 if문으로 작성하고, 이를 switch ~ case문으로 옮겨보세요.
 =======================
 메 뉴			가 격
 =======================
 1.피자		8,600
 2.스파게티            15,000
 3.햄버거 		10,000
 4.스프 		5,000
 5.토마토		3,500
 6.종료
 =======================
 다음 메뉴중에서 고르세요.
 1
 주문할 피자의 갯수를 입력하세요: 3
 8600 * 3 = 25,800원 입니다.
 6
 프로그램이 종료되었습니다.
 */

public class condSample8_menu2 {

	static int menu = 0, su = 0;
	static int pizza = 8600;
	static int spa = 15000;
	static int ham = 10000;
	static int soup = 5000;
	static int tomato = 3500;
	static String dfSu = "";

	public static void main(String[] args) {

		while (true) {
			// 숫자 금액 표시 클래스
			DecimalFormat df = new DecimalFormat("###,###");

			Scanner sc = new Scanner(System.in);
			System.out.println("===== Menu    Price  =====");
			System.out.println("=  1.피 자          8,600       ==");
			System.out.println("=  2.스파게티     15,000      ==");
			System.out.println("=  3.햄 버 거      10,000      ==");
			System.out.println("=  4.스 프          5,000       ==");
			System.out.println("=  5.토 마 토      3,500       ==");
			System.out
					.println("=  6.종 료                                       ==");
			System.out.println("==========================");
			System.out.println("원하는 메뉴를 선택해 주세요.");

			menu = sc.nextInt();// 1~6메뉴선택
			if (menu == 6) {
				System.out.println("정상적으로 종료되었습니다.");
				System.exit(0);// 안전하게 정상적으로 프로그램 종료
			}

			System.out.println("수량을 선택해 주세요.");
			su = sc.nextInt();// n개

			switch (menu) {
			case 1:
				su = su * pizza;
				dfSu = df.format(su);
				System.out.println("당신은 피자를 선택하셨군요. \n 피자 가격은 " + dfSu
						+ "원 입니다.\n");
				break;
			case 2:
				su = su * spa;
				dfSu = df.format(su);
				System.out.println("당신은 스파게티를 선택하셨군요. \n 스파게티 가격은" + dfSu
						+ "원 입니다.\n");
				break;
			case 3:
				su = su * ham;// su*=ham
				dfSu = df.format(su);
				System.out.println("당신은 햄버거를 선택하셨군요. \n 햄버거 가격은 " + dfSu
						+ "원 입니다.\n");
				break;
			case 4:
				su = su * soup;
				dfSu = df.format(su);
				System.out.println("당신은 스프를 선택하셨군요.\n 스프 가격은 " + dfSu
						+ "원 입니다.\n");
				break;
			case 5:
				su = su * tomato;
				dfSu = df.format(su);
				System.out.println("당신은 토마토를 선택하셨군요.\n 토마토 가격은 " + dfSu
						+ "원 입니다.\n");
				break;
			}
		}

	}

}
