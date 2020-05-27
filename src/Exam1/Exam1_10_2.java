package Exam1;

import java.util.Scanner;

/*
 * 2. 주어진 초를 이용하여 몇 시간 몇 분 몇 초인가를 알아보는 프로그램을 작성합니다.
 * */
public class Exam1_10_2 {

	public static void main(String[] args) {

		int s = 0, nam;

		Scanner sc = new Scanner(System.in);

		System.out.println("초 를 입력하세요 : ");
		s = sc.nextInt();

		int h = s / (60*60);
		nam = s % (60*60);		
        int m = nam / 60;				
		nam = nam % 60;
		
		System.out.println(s + "초 는 " + h + "시간 " + m + "분 " + nam + "초 입니다.");

	}

}
