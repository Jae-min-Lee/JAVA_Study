package Array2;

import java.util.Scanner;

/*
 * 구구단을 연산하여 배열에 저장하고
 * 원하는 단을 추력 배열에서 읽어서 출력하세요
 * 배열명> gudan[][]
 * */
public class Arrays2Sample6_gugudan {

	public static void main(String[] args) {

		int gudan[][] = new int[10][10];
		
		int i, j;

		Scanner sc = new Scanner(System.in);

		for (i = 0; i < 9; i++) {

			for (j = 0; j <= 9; j++) {

				gudan[i][j] = (i+1) * (j+1);
			}
		}
		System.out.println("출력하고자하는 단을 입력하세요.");

		int n = sc.nextInt();
		
		for (j = 0; j < 9; j++) {
			System.out.println(n + " x " + (j + 1) + " = " + gudan[n - 1][j]);
		}
	}

}
