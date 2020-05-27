package Exam1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 5)3개의 숫자를 입력으로 받고 3개의 숫자 중에 중간 값을 가지는 숫자를 출력하세요.    ex) 20, 50, 30 => 30 
 * */

public class Exam1_1_5 {

	public static void main(String[] args) {
		// 1. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력 해주세요 : ");
		int value1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력 해주세요 : ");
		int value2 = sc.nextInt();
		
		System.out.println("세번째 숫자를 입력 해주세요 : ");
		int value3 = sc.nextInt();
		
		int x[] = {value1, value2, value3};
		Arrays.sort(x); 
		//오름차순 : ascending 1, 2, 3,  4,......
		//내림차순 : descending  10, 9, 8, 7.....
			
			System.out.println(x[2]);//index : 0이면 가장 작은값, 1이면 중간값, 2면 가장 큰값
			System.out.println(x);//[I@7d4991ad => pointer (16진수 주소)
	}
}