package Exam1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 3. 입력 50 + 40       50 - 40
 *    출력 50 + 40 = 90     50 - 40 = 10
 *    Scanner version으로 작성하세요
 * */
public class Exam1_10_3 {
	
	public static void main(String[] args) {
	
	int value1 = 0;
	String input;
	int value2 = 0;
	while(true){
	try {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력해주세요 : ");
	value1 = sc.nextInt();
	System.out.println("부호를 입력해 주세요 : ");
	input = sc.next();
	System.out.println("숫자를 입력해 주세요 : ");
	value2 = sc.nextInt();

		

	        
			switch (input) {
			case ("+"):
				System.out.println("값은 : " + value1 + " + " + value2
						+ " = " + (value1 + value2) + " 입니다.");
				break;

			case ("-"):
				System.out.println("값은 : " + value1 + " - " + value2
						+ " = " + (value1 - value2) + " 입니다.");
				break;

			case ("x"):
				System.out.println("값은 : " + value1 + " x " + value2
						+ " = " + (value1 * value2) + " 입니다.");
				break;

			case ("/"):
				System.out.println("값은 : " + value1 + " / " + value2
						+ " = " + (value1 / value2) + " 입니다.");
				break;

			case ("&"):
				System.out.println("값은 : " + value1 + " % " + value2
						+ " = " + (value1 % value2) + " 입니다.");
				break;
			
	        	
			}
			
		} 
		catch (InputMismatchException ime) {

			System.out.println("잘못 입력하셨습니다.");
		}
	}
	}

	

}
