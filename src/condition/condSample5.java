package condition;

import java.util.Scanner;

/* 국어, 영어, 수학 점수를 각각 입력 받아서 총점과 평균을 구하고, 학점을 구해서 출력하세요.
 * 조건>
 * 1. 입력은 메소드를 이용해서 입력합니다.
 * 2. 총점과 평균도 메소드를 이용합니다.
 * 3. 학점을 구하는데 if문, switch~case문, 조건연산자를 각각 이용하여 구하세요.
 * */

public class condSample5 {

	static int kr;
	static int eg;
	static int ma;
	static char grade;
	static double aver;

	private static void input() {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		kr = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eg = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		ma = sc.nextInt();

	}

	private static void total() {
		int total = kr + eg + ma;
		aver = total / 3.0;

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + aver);

	}

	private static void score() {

		char grade = (aver >= 90.0) ? 'A' : (aver >= 80.0) ? 'B'
				: (aver >= 70.0) ? 'C' : (aver >= 60.0) ? 'D' : 'F';
		System.out.println("학점 : " + grade);

	}

	public static void main(String[] args) {

		input();
		total();
		score();

	}

}