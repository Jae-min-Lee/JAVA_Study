package Exam1;

import java.io.IOException;
import java.util.Scanner;

// 특수문자, 숫자, 알파벳 문자, 제어문자 등을 입력 받아서 각 문자의 갯수를 출력하는 프로그램을 작 성하세요. 
// 특수문자 : !@#$%^&*()_.............
// 숫자 : 0~9, 10, 11, 12...... 무한대의 숫자영역 참조...
// 알파벳 : 대문자 26, 소문자 26 :star ....... 무한대의 문자영역의 창조...
// Escape 제어문자 : \\, \t, \b

public class Exam1_9_2 {

	public static void main(String[] args) {

//		String count = "";
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("문자를 입력해 주세요 : ");
//		count = sc.next();
//		System.out.println(count.length());
//		
		int data = ' ';
		int alphabet = 0;
		int digit = 0;
		int special = 0;
		int control = 0;
		int other = 0;
		
		//ctrl + z : 프로그램 중지

		try { // 여기에 문장의 실행중에 문제가 생기면 catch에서 붙잡아서 IOException e 에서 처리해라

			
			while ((data = System.in.read()) != -1) {// 키보드로 입력받으라는 메소드.
				// 아스키코드 기준 : 데이터를 주고 받는 정보통신용 표준 코드
				if (data >= 'A' && data <= 'Z' || data >= 'a' && data <= 'z')
					alphabet++;

				else if (data >= '0' && data <= '9')
					digit++;
				else if (data == '!' || data == '2' || data == '#'
						|| data == '$' || data == '%')
					special++;
				else if (data == '\t' || data == '\b' || data == ' ')
					control++;
				else
					other++;
			}
			
		} catch (Exception e) { //ArithmeticException e : 산술적 예외상황이 발생했습니다. 라는 의미포함
			// TODO Auto-generated catch block
			System.out.println("예상하지 못한 오류가 발생하였습니다. 잠시 기다려주세요.");
			//e.printStackTrace();// 스택의 오류메세지를 찾아서 표시해주는 역할
		}
		System.out.println("Alphabet count : " + alphabet);
		System.out.println("Digit count : " + digit);
		System.out.println("Special count : " + special);
		System.out.println("Control count : " + control);
		System.out.println("Other count : " + other);
	}

}
