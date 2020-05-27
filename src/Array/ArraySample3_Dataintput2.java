package Array;

import java.util.Scanner;

/*
 * 다음과 같은 데이터를 키보드로부터 입력 받아서 저장하고,
 * 5,3,7,1,4,-2,9,15
 * 음수가 나오면 프로그램을 종료. 
 */

public class ArraySample3_Dataintput2 {

	public static void main(String[] args) {
		int data [] = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("배열에 저장할 숫자를 입력하세요.");
		//배열에 데이터 저장하기
		for(int i = 0; i < data.length; i++){
			data[i] = sc.nextInt();
			if(data[i] < 0){
				continue;
			}
			else{
				sum+=data[i];
			}
		}
		System.out.println("배열의 합계 : " + sum);
		
		//배열에 저장된 데이터 출력하기
		for(int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}
		//가변for문
		for(int num : data){
			System.out.println(num);
		}

	}

}
