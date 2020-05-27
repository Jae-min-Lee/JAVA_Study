package methodtest;

import java.util.Scanner;

/*
 * [연습문제]
 * 1. 1~100까지의 합계를 구하여 출력하세요.
 * 2. 1~100사이의 3의배수의 합계를 구하여 출력하세요.
 * 3. 1~100사이의 홀수의 합계를 구하여 출력하세요.
 * 
 * 사용 메소드> HAP
 */
public class methodOverLoding5 {

	private static void HAP() {
		int i, sum = 0;

		for (i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합 : " + sum);
	}

	private static int HAP(int i, int j) {
		int sum = 0;
		for (i = i; i <= j; i++) {
			if (i % 3 == 0) {
				sum += i;
			}

		}
		return sum;

	}

	private static void HAP(int i) {

		int sum = 0;
		for (i = i; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			} else
				sum += i;
		}
		System.out.println("1~100사이의 홀수의 합 : " + sum);
	}

	public static void main(String[] args) {

		HAP();
		int sum = HAP(1, 100);
		System.out.println("1~100사이의 3의배수의 합 : " + sum);
		HAP(1);
	}
}
