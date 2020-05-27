package Array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Sort[정렬] 이란 ?
 * 오름차순 (Ascending)과 내림차순(Desending)으로 나눕니다.
 * 오름차순 (Ascending) : 작은 값에서 큰 값으로, ex) 1,2,3,4 / a,b,c,d
 * 내림차순(Desending) : 큰 값에서 작은 값으로 ex) 4,3,2,1 / d,c,b,a
 * 아스키코드 기준으로 소문자가 대문자보다 더 큰값임.
 * 
 * Arrays / sort () : 기본 오름차순
 */
public class ArraySample8_Arraysort {

	static void Ascending(int[] Num) {
		System.out.println("----------오름차순----------");
		for (int i = 0; i < Num.length; i++) {
			System.out.print(Num[i] + " ");
		}
		System.out.println();
		return;
	}
	
	public static void Descending(int[] Num) {
		System.out.println("----------내림차순----------");
		for (int i = Num.length - 1; i > -1; i--) {
			System.out.print(Num[i] + " ");
		}
		System.out.println();
	}
	
	static void Sum() {
		int sum = 0;
		
		for(int i = 0; i <= 100; i++){
			
			sum+=i;
			
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("배열에 저장 할 데이터의 갯수를 입력해주세요.");
		int count = sc.nextInt();

		int[] Num = new int[count];

		System.out.println("정수형 데이터를" + count + "개 입력 해주세요.");

		for (int i = 0; i < Num.length; i++) {
			Num[i] = sc.nextInt();
			System.out.print(Num[i] + " ");
		}

		System.out.println();
		
		Arrays.sort(Num);//오름차순
		
		Ascending(Num);
		Descending(Num);
		Sum();
	}


}