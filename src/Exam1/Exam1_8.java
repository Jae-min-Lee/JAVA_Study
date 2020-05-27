/*
 * 1)다음과 같은 결과가 나오도록 프로그래밍 하세요.      
 * 성적 처리       
 * ---------------    
 * 성명: 홍길동    
 * 국어: 92    
 * 영어: 88    
 * 수학: 80    
 * 총점: 260    
 * 평균: 86.666667  
 * 
 * */

package Exam1;

import java.util.Scanner;

public class Exam1_8 {

	public static void main(String[] args) {
		String name = "";
		int kor, eng, mat;
		int count = 0;
		int sum = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);

		while (count < 3) {
			count++;
			System.out.println("이름을 입력하세요 : ");
			name = sc.next();
			System.out.println("국어 점수를 입력하세요 : ");
			kor = sc.nextInt();
			System.out.println("영어 점수를 입력하세요 : ");
			eng = sc.nextInt();
			System.out.println("수학 점수를 입력하세요 : ");
			mat = sc.nextInt();

			sum = kor + eng + mat;
			avg = sum / 3.0;

			System.out.println("=========================");
			System.out.println("========= 성적처리 =========");
			System.out.println("=========================");
			System.out.println(" 성명 :            " + name);
			System.out.println(" 국어 :            " + kor);
			System.out.println(" 영어 :            " + eng);
			System.out.println(" 수학 :            " + mat);
			System.out.println(" 총점 :            " + sum);
			System.out.println(" 평균 :            " + avg);
			System.out.println("=========================");
		}
	}
}
