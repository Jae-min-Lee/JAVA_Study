package Exam1;

import java.util.Scanner;

//주어진 단위 구하기
//예] 345이면 3은 백의자리,4는 십의자리, 5는 일의자리
public class Exam1_9_3 {

	public static void main(String[] args) {
		
		int value = 0;
		int thousand = 0;
		int hubdred = 0;
		int nam = 0;
		int ty = 0;
		int one = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1234를 입력해주세요 : ");

		value = sc.nextInt();
		//공식적용
		//value 의 값을 
		//value / 100 ;
		
		thousand = value / 1000; // 천의 단위를 구하기 ,1
		nam = value % 1000; // 나머지 구하기 ,234
		
		hubdred = nam / 100;// 백의단위 234/100
		nam = nam % 100; //34
		
		ty = nam / 10;// 십의단위 , 34/10
		nam = nam % 10; // 4
		
		one = nam / 1;// 일의단위, 4 
		nam = nam % 1; // 4
		
		
		System.out.println("입력받은 값은 얼마인가요 ? " + value); //1234
		System.out.println("천의 단위 : " + thousand);//1
		System.out.println("백의 단위 : " + hubdred);//2
		System.out.println("십의 단위 : " + ty);//3
		System.out.println("일의 단위 : " + one);//4
	}

}
