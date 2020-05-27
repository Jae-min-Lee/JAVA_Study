/*
 * 2) 숫자 10이 2의 배수인지, 3의 배수인지, 4의 배수 인지를 체크하는 로직을 작성하세요. 
 */
package Exam1;

import java.util.Scanner;

public class Exam1_8_1 {

	public static void main(String[] args) {
		// 배수의 관한 문제
		int su = 0, count = 0;
		while (count < 3) {
			count++;
			Scanner sc = new Scanner(System.in);

			System.out.println("숫자를 입력하세요 : ");

			su = sc.nextInt();

			if (su % 2 == 0) {
				System.out.println("2의 배수입니다.");
			} else if (su % 3 == 0) {
				System.out.println("3의 배수입니다.");
			} else
				System.out.println("4의 배수입니다.");
		}
	}

}
