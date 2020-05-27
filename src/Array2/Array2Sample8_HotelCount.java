package Array2;

import java.util.Scanner;

/*
 * kosmo Hotel 새롭게 증축을 합니다.
 * 5층이고 각층은 7개 호실로 구성됩니다. [5][7]
 * 이럴때 투숙객의 데이터가 다음과 같다면, 전체 인원수와 각층의 평균 인원수는 얼마인가요?
 * <데이터>
 * 1층 : 10, 90, 70, 60, 80, 65, 55 = {      }
 * 2층 : 1, 9, 7, 6, 8, 5, 6
 * 3층 : 60, 30, 80, 8, 9, 45, 32
 * 4층 : 10, 9, 8, 5, 7, 3, 9
 * 5층 : 60, 30, 80, 25, 35, 45, 21
 * */
public class Array2Sample8_HotelCount {

	public static void main(String[] args) {

		
		int[][] arr1 = new int[5][7];

		
		Scanner sc = new Scanner(System.in);

		// input data
		for (int i = 0; i < arr1.length; i++) {

			System.out.println(i+"층의 인원수를 입력하세요.");
			
			for (int j = 0; j < arr1[i].length; j++) {

				arr1[i][j] = sc.nextInt();
			}
		}
		// operation


		for (int i = 0; i < arr1.length; i++) {
			
			int sum = 0;
			double avg = 0.0;

			for (int j = 0; j < arr1[i].length; j++) {
				sum += arr1[i][j];
			}
			avg = sum / arr1[i].length;
			System.out.println("합계" + sum + "평균" + avg);
		}
		System.out.println();
	}
}
