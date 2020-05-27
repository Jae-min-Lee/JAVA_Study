package Array;

import java.util.Scanner;

/*
 * 배열 Num(10)에 숫자를 저장합니다.
 * <변경 전 데이터>
 * 10 20 30 40 50 60 70 80 90 100
 * <변경 후 데이터>
 * 20 10 40 30 60 50 80 70 100 90
 */
public class ArraySample7_Arraychange {

	public static void main(String[] args) {
		
		int temp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열에 저장 할 데이터의 갯수를 입력해주세요.");
		int count = sc.nextInt();
		
		int[] Num = new int[count];
		
		System.out.println("정수형 데이터를" + count + "개 입력 해주세요.");
	
		for(int i = 0; i < Num.length; i++){
			Num[i] = sc.nextInt();
			System.out.print(Num[i] + " ");
		}
		
		System.out.println();
		System.out.println("-------------변경전 배열 출력-------------");
		System.out.println();
		
		for(int i = 0; i < Num.length; i+=2){
			
			temp = Num[i];// temp = Num[0],
			Num[i] = Num[i+1];//Num[0+1];
			Num[i+1] = temp;//Num[1] = temp;
			
//			if(i % 2 == 0){
//				Num[i] = Num[i+1];
//			}
//			else{
//				Num[i] = Num[i-1];
//			}
//			System.out.print(Num[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < Num.length; i++){
		System.out.print(Num[i] + " ");
		}
		System.out.println();
		System.out.println("-------------변경후 배열 출력-------------");
//		int Num[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
//		
//		System.out.println("-------------변경전 배열 출력-------------");
//		
//		for (int num : Num)
//			System.out.print(num + " ");
//		
//		System.out.println();
//		
//		System.out.println("-------------변경후 배열 출력-------------");
//		
//		for (int i = 0; i < Num.length; i++) {
//
//			if (i == 0) {
//				Num[i] = 20;
//			} else if (i == 1) {
//				Num[i] = 10;
//			} else if (i == 2) {
//				Num[i] = 40;
//			} else if (i == 3) {
//				Num[i] = 30;
//			}
//			System.out.print(Num[i] + " ");
//		}
//
	}

}
