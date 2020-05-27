package Exam1;

import java.util.Scanner;

public class Exam1_9_4 {

	public static void main(String[] args) {
		
		while(true){
		int kor = 0, eng = 0, mat = 0;
		int sum = 0;
		double avg = 0.0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해 주세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력해 주세요 : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3;
		
		System.out.println("점수의 합계는 : " + sum);
		System.out.println("점수의 평균는 : " + avg);
		}
		
	}

}
