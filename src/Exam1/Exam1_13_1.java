package Exam1;

import java.util.Scanner;

//1) 이름, 미술, 음악, 체육 점수를 입력 받아서, 총점, 평균, 학점, 가산점, 합격/불합격을 판정합니다.    
//평균이 60점이상 10%의 가산점을 주고, 평균이 60점 이하이면 10%의 감산점을 줍니다.    
//그리고, 합격/불합격를 판정하는데, 합격인 경우에는 평균이 60점이상, 60점이하면 불합격입니다. 

public class Exam1_13_1 {

	static double avg;
	static char grade;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.println("미술 점수를 입력해주세요 : ");
		int Art = sc.nextInt();
		System.out.println("음악 점수를 입력해주세요 : ");
		int Music = sc.nextInt();
		System.out.println("체육 점수를 입력해주세요 : ");
		int PE = sc.nextInt();

		int sum = 0;

		sum = Art + Music + PE;
		avg = sum / 3.0;

		switch ((int) avg / 10) {
		case 10:
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
		}

		double add = (avg >= 60) ? (avg * 1.1) : (avg * 0.9);

		String pass = (avg >= 60) ? "합격" : "불합격";

		System.out.println("이름 : " + name);
		System.out.println("미술 점수 : " + Art);
		System.out.println("음악 점수 : " + Music);
		System.out.println("체육 점수 : " + PE);
		System.out.println("총점  : " + sum);
		System.out.println("평균  : " + avg);
		System.out.println("학점 : " + grade);
		System.out.println("가산점 : " + add);
		System.out.println("합격여부 : " + pass);

	}

}
