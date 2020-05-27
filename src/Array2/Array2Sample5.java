package Array2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 성적 처리 첫번째
 * 음악, 미술, 체육 과목의 점수를 입력 받아서 배열에 저장합니다.
 * 그리고, 총점과 평균을 구하여 출력합니다.
 * 
 */
public class Array2Sample5 {
	 
	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("학생 수를 입력해주세요.");
			int n = sc.nextInt();

			String name[] = new String[n];// 학생이름 배열 선언

			float score[][] = new float[n][5];//

			for (int i = 0; i < score.length; i++) {// row , 학생이름 입력
				System.out.println("학생 이름을 입력해주세요.");
				name[i] = sc.next();

				float sum = 0.0f;
				float avg = 0.0f;

				for (int j = 0; j < 3; j++) {// column , 과목성적 입력

					if (j == 0) {
						System.out.println("음악 점수 : ");
						score[i][0] = sc.nextFloat();
						sum += score[i][j];
					} else if (j == 1) {
						System.out.println("미술 점수 : ");
						score[i][1] = sc.nextFloat();
						sum += score[i][j];
					} else if (j == 2) {
						System.out.println("체육 점수 : ");
						score[i][2] = sc.nextFloat();
						sum += score[i][j];
					}
					// 총점과 평균 구하기
					score[i][3] = sum;// 학생 수만큼 저장
					avg = sum / 3.0f;// score.length를 쓰면 5.0으로 나누게됨
					score[i][4] = avg;
				}
			}
			for (int i = 0; i < name.length; i++) {
				System.out.println("\t------------------------------------------");
				System.out.println("\t이름\t\t총점\t\t평균 ");
				System.out.println("\t------------------------------------------");
				System.out.printf("\t %s \t %5.2f \t %5.2f \n", name[i], score[i][3], score[i][4]);
			}
		}catch (InputMismatchException e) {
			System.out.println("잘못된 데이터의 입력입니다.");
		}
	}
}