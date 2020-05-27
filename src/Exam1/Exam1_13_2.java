package Exam1;

import java.util.Random;
import java.util.Scanner;

/*
 * 2) 가위, 바위, 보 게임을 합니다.    
 * 조건] 난수를 발생하여 처리합니다.    
 * Random()클래스 사용, 
 * rd.nextInt(3); 0~2 숫자생성.
 *  
 */
public class Exam1_13_2 {

	public static void main(String[] args) {
		
		while (true) {
			Random rd = new Random();

			// int Computer = rd.nextInt(3);//0,1,2
			int Computer = rd.nextInt(3) + 1;// 1,2,3

			Scanner sc = new Scanner(System.in);
			System.out.println("가위(1),바위(2),보(3)를 입력해 주세요.");
			int user = sc.nextInt();

			if (user == 1) {// 유저가 가위이면
				switch (Computer) {
				case 1:
					System.out.println("무승부");
					break;
				case 2:
					System.out.println("졌습니다.");
					break;
				case 3:
					System.out.println("이겼습니다.");
					break;
				}
			} else if (user == 2) {// 유저가 가위이면
				switch (Computer) {
				case 1:
					System.out.println("이겼습니다.");
					break;
				case 2:
					System.out.println("무승부");
					break;
				case 3:
					System.out.println("졌습니다.");
					break;
				}
			} else if (user == 3) {// 유저가 가위이면
				switch (Computer) {
				case 1:
					System.out.println("졌습니다.");
					break;
				case 2:
					System.out.println("이겼습니다.");
					break;
				case 3:
					System.out.println("무승부");
					break;
				}
			} else
				System.out.println("잘못 입력하셨습니다.");
		}
	}

}
