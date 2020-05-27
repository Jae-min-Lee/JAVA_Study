package Exam1;

import java.util.Scanner;

/*
 * 
 * 1) 3개의 숫자를 입력받아서 가장 큰수(max), 중간수(med), 가장 작은수(min)를  찾아서 출력하는 프 로그램을 작성하세요.^^    
 *     [예] 23 45 12    MAX = 45,   MED = 23,    MIN = 12 
 * 2) X와 Y 좌표인 2차원 공간상의 좌표값을 입력하여 몇 사분면인지 확인하는 프로그램을 작성하세요.  
 * 3) 입력된 문자가 대문자이면 소문자로, 소문자이면 대문자로 변경하는 프로그램을 작성하세요.  
 * 4) 한 개의 점수를 입력 받아서 학점을 구하고, 학점이 A이면 전액 장학금 대상이고, 학점이 B이면 반 액 장학금 대상이고, 
 *    학점이 C이면 근로 장학금 대상이고, 아니면, 장학금 대상이 아닙니다.를 출 력합니다. [hint] switch~case를 이용하세요. 
 *
 */
public class Exam1_12_1 {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("x축을 입력 하세요 : ");
		x = sc.nextInt();
		System.out.println("y축을 입력 하세요 : ");
		y = sc.nextInt();

		if ((x > 0) && (y > 0)) {
			System.out.println("1사분면");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("2사분면");
		} else if ((x < 0) && (y < 0)) {
			System.out.println("3사분면");
		} else
			System.out.println("4사분면");
	}
}
