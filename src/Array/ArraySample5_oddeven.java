package Array;

import java.util.Scanner;

/*
 * 7개의 데이터를 입력받아서, 홀수의 합과 짝수의 합을 구하여 출력하세요.
 * 그리고, 7개의 데이터의 전체합과 평균도 구하여 출력합니다.
 * 그리고, 3의 배수이면서 짝수가 되는 숫자의 합을 구하여 출력하세요.
 */
public class ArraySample5_oddeven {

	public static void main(String[] args) {

		int count = 0;
		
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int avg = 0;
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("데이터의 갯수를 입력해 주세요.");		
		int n = sc.nextInt();
		
		int[] data = new int[n];
		
		int value = data.length;
		
		//1. data input
		System.out.println("7개의 숫자를 입력해 주세요.");
		for(int i = 0; i < value; i++){
			data[i] = sc.nextInt();
			if(data[i]%2 == 0){
				sum+=data[i];
			}
			else
				sum2+=data[i];
		}
		System.out.println("1-1. 짝수의 합은 : " + sum + " 이다.");
		System.out.println("1-2. 홀수의 합은 : " + sum2 + " 이다.");
		
		System.out.println("----------------------------------------------");
		
		for(int i = 0; i < value; i++){
			sum3+=data[i];
			avg = sum3 / value;
		}
		System.out.println("2-1. 데이터의 전체 합은 : " + sum3 + " 이다.");
		System.out.println("2-1. 데이터의 평균은 : " + avg + " 이다.");
		
		System.out.println("----------------------------------------------");
		
		for(int i = 0; i < value; i++){
			if(data[i]%3 == 0 && data[i]%2 == 0){
				sum4+=data[i];
			}
		}
		System.out.println("3. 3의 배수이면서 짝수가 되는 숫자의 합 : " + sum4);
	}
}
