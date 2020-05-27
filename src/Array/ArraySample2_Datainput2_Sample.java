package Array;

import java.util.Scanner;

public class ArraySample2_Datainput2_Sample {

	public static void main(String[] args) {

		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("데이터의 갯수를 입력해주세요");

		int n = sc.nextInt();// 입력할 데이터의 갯수.

		String[] data = new String[n];

		int len = data.length;

		System.out.println(len);// 5

		System.out.println("1.--------------------------------------");

		// 1. 키보드 데이터 입력
		System.out.println("키보드로 데이터를 입력해 주세요.");
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.next();
			count++;
		}

		System.out.println("2.--------------------------------------");

		// 2. 데이터출력
		for (int i = 0; i < data.length; i++) {
			System.out.println("data [ " + i + " ] = " + data[i]);
		}
		System.out.println("카운트 : " + count);
		System.out.println("3.--------------------------------------");

		for (int i = 0; i < data.length; i++) {
			if(data[i].equals("-1")){
				break;
			}
			System.out.println("data [ " + i + " ] = " + data[i]);
		}

		System.out.println("카운트 : " + count);
		System.out.println("3.--------------------------------------");
		
		// 3. 데이터 출력
		for (String s : data) {
			System.out.println("data [ " + s + " ] = " + s);
		}
	}
}
