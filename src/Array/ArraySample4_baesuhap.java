package Array;

import java.util.Scanner;

// 키보드로부터 숫자를 5개 입력 받아서
// 그중에서 3의 배수가 되는 숫자의 합과 갯수를 구하라.

public class ArraySample4_baesuhap {

	public static void main(String[] args) {
		
		int count = 0;
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("데이터의 갯수를 입력해 주세요.");		
		int n = sc.nextInt();
		
		int[] data = new int[n];
		
		int value = data.length;
		
		//1. data input
		System.out.println("5개의 숫자를 입력해 주세요.");
		for(int i = 0; i < data.length; i++){
			data[i] = sc.nextInt();
			if(data[i]%3 == 0){
				sum+=data[i];
				count++;
				System.out.println(data[i]);//확인용	
			}	
		}
		System.out.println("3의 배수의 합은 : " + sum + "이고, 갯수는 : " + count + "개 이다.");
	}
}
