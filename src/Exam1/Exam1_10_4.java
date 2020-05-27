package Exam1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 4) 3)번을 이클립스에서 Args 인자값으로 입력 받아서 처리하는 프로그램을 작성하세요.  
 */
public class Exam1_10_4 {

	public static void main(String[] args) {
		
		

		int value1 = Integer.parseInt(args[0]);
		String input = args[1];
		int value2 = Integer.parseInt(args[2]);

				Scanner sc = new Scanner(System.in);
				System.out.println("숫자를 입력해주세요 : ");
				value1 = sc.nextInt();
				System.out.println("부호를 입력해 주세요 : ");
				input = sc.next();
				System.out.println("숫자를 입력해 주세요 : ");
				value2 = sc.nextInt();

	}

}
