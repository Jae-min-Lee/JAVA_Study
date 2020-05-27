package Array;

import java.util.Random;
import java.util.Scanner;

/*
 * 1. 설문조사 통계 구하기.
 * 조건> 30명의 조사원들이 주변 음식점에 대한 만족도 조사를 했습니다.
 * 점수기준> 매우 만족(5), 만족(4), 보통(3), 불만족(2), 매우 불만족(1)
 * 결과 : 5점만점 : 10명, 4점만점 : 5명, 3점만점 : 10명, 2점만점 : 2명, 1점만점 : 3명
 */
public class ArraySample11_Problem {

	public static void main(String[] args) {

//		int[] data = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 3, 3, 3, 3,
//				3, 3, 3, 3, 3, 3, 2, 2, 1, 1, 1 };
//
//		int[] result = new int[6];
//
//		for (int i = 0; i < data.length; i++) {
//
//			result[data[i]]++;
//		}
//
//		System.out.println("총 응답자의 수는 " + data.length + "명 입니다.");
//		for (int i = 1; i < result.length; i++) {
//			System.out.println(i + "점 을 선택한 사람 : " + result[i]);
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("만족도 배열에 저장 할 데이터의 갯수를 입력해 주세요.");
		int count = sc.nextInt();// 30
		int Response[] = new int[count];

		System.out.println("정수형 데이터를" + count + "개 입력해 주세요.");
		for (int i = 0; i < Response.length; i++) {
			Response[i] = sc.nextInt();
		}
		System.out.println();

		System.out.println("응답지 배열에 저장 할 데이터의 갯수를 입력해 주세요.");
		int cnt = sc.nextInt();// 5
		int franquency[] = new int[cnt];

		System.out.println();

		for (int i = 0; i < Response.length; i++) {
			if (Response[i] == 1)
				++franquency[0];
			else if (Response[i] == 1)
				++franquency[0];// 1점
			else if (Response[i] == 2)
				++franquency[1];// 2점
			else if (Response[i] == 3)
				++franquency[2];// 3점
			else if (Response[i] == 4)
				++franquency[3];// 4점
			else
				++franquency[4];// 5점
		}

		// output
		for (int i = 0; i < franquency.length; i++) {
			System.out.println("응답지 : " + "[" + i + "]" + franquency[i]);
		}
	}
}