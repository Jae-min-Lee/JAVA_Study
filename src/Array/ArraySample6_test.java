package Array;

import java.util.Scanner;//package명. class명 => Library

/*
 * 10 ~ 50을 초기값으로 갖는 1차원 배열을 test라는 이름으로 선언합니다.
 * 5번째 원소의 값을 100으로 변경하고, 출력합니다.
 * 모든 원소의 값을 0 으로 초기화하고 출력합니다.
 */
public class ArraySample6_test {

	public static void main(String[] args) {

		// 1. 배열에 실 데이터를 각각 넣어줍니다.
		int[] test = new int[5];

		test[0] = 10;
		test[1] = 20;
		test[2] = 30;
		test[3] = 40;
		test[4] = 50;

		for (int value : test)

			System.out.println(value);

		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println();

		// 2. 배열 선언과 동시에 데이터를 바로 넣어줍니다. 배열선언 및 초기화
		int test2[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < test.length; i++) {
			if(i < 5){
				test2[i] = 0;
			}
			System.out.print(test2[i] + " ");
		}
		System.out.println();

		// 3. 반복문이면서 데이터를 입력받아서 처리하는 방법.

		int[] test3 = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("데이터의 갯수를 입력해 주세요.");

		for (int i = 0; i < test3.length; i++) {
			test3[i] = sc.nextInt();
			System.out.print(test3[i] + " ");
		}
//     프로그램은 항상 확장성을 염두해두고 코딩한다.
		//소프트웨어 공학적 측면에서 보면, 코드의 재사용성 내지는 스프트웨어 재사용성
	}

}
