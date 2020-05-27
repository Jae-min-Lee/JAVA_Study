package condition;

import java.util.Scanner;

/* 국어, 영어, 수학 점수를 각각 입력 받아서 총점과 평균을 구하고, 학점을 구해서 출력하세요.
 * 조건>
 * 1. 입력은 메소드를 이용해서 입력합니다.
 * 2. 총점과 평균도 메소드를 이용합니다.
 * 3. 학점을 구하는데 if문, switch~case문, 조건연산자를 각각 이용하여 구하세요.
 * */

public class condSample3 {

	static int kr;
	static int eg;
	static int ma;
	static char grade;
	private static double aver;

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

	private static void score1() {

		if (aver >= 90.0) {
			grade = 'A';
		} else if (aver >= 80.0) {
			grade = 'B';
		} else if (aver <= 70.0) {
			grade = 'C';
		} else if (aver >= 60.0) {
			grade = 'D';
		} else if (aver >= 50.0) {
			grade = 'f';
		}
		System.out.println("if 문 학점 : " + grade);

	}

	private static void score2() {

		int avg = (int) aver;

		switch (avg / 10) {
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("Switch 학점 : " + grade);
	}

	private static void score3() {

		char grade = (aver >= 90.0) ? 'A' : (aver >= 80.0) ? 'B'
				: (aver >= 70.0) ? 'C' : (aver >= 60.0) ? 'D' : 'F';
		System.out.println("조건 연산자 학점 : " + grade);

	}

	public static void main(String[] args) {

		input();
		total();
		score1();
		score2();
		score3();

	}

}
