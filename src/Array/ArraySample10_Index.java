package Array;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 배열에서 원하는 데이터 찾기
 * 임의의 수를 10개 입력받아서, 찾고자 하는 데이터의 위치가 어디인지를 찾으세요.
 * 그 index값을 출력하세요.
 * 
 */

public class ArraySample10_Index {

	public static void main(String[] args) {
		int cnt = 0;
		do{
			cnt++;
		try{
		Scanner sc = new Scanner(System.in);

		System.out.println("배열에 저장 할 데이터의 갯수를 입력해주세요.");
		int count = sc.nextInt();

		int[] Num = new int[count];

		System.out.println("정수형 데이터를" + count + "개 입력 해주세요.");

		for (int i = 0; i < Num.length; i++) {
			Num[i] = sc.nextInt();
		}
		System.out.println();

		System.out.println("찾을 데이터를 숫자로 입력하세요.");
		int su = sc.nextInt();
		int i;
		for (i = 0; i < Num.length; i++) {
			
			if (Num[i] == su)
				
				break;
//			System.out.println("찾지못함");
		}
		
		System.out.println("숫자가 위치한 곳의 배열의 철자는 = " + "[" + i + "]");
		
		}catch(InputMismatchException e){
			System.out.println("숫자를 입력해주세요.");
		}
		}while(cnt < 7);
	}
}