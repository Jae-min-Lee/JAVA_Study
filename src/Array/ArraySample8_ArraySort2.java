package Array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. 7개의 데이터를 입력받아서 가장 큰 값과 가장 작은 값을 구하여 출력하세요.
 * 2. 상속 을 이용하여 ArraySample8_Arraysub2 클래스 에서도 최대값과 최소값을 구하여 출력해봅니다.
 * 
 * 
 * 상속(Inheritance) 이란?
 * 기존에 작성된 클래스(부모클래스)를 바탕으로 자식 클래스에 기능과 속성을 물려주는 것.
 * 속성(Attribute) : 클래스에서 클래스 변수에 속하는 것들
 * 기능(method) : 클래스에서 클래스 메소드에 속하는 것들.
 * 
 * 단, 자바는 단일상속만 허용하므로, 많은 기능들이 필요하다면 다중 상속의 효과를 이용하여 처리합니다.
 * 
 * 
 * 
 * 1) class A Extend B { . . . (알고리즘)}
 * - 같은 클래스들 끼리의 상속 관계일때
 * 
 * 2) interface A Extend B, C, D,....... { . . . (알고리즘)}
 * - 같은 인터페이스들 끼리의 상속 관계일때
 * 
 * 3) class A implements B { . . . (알고리즘)}
 * - 클래스들과 인터페이스와의 상속 관계일 때
 * 
 * 4) class A Extend B implements C, D, E,... { . . . (알고리즘)}
 * - 같은 클래스들 끼리와 인터페이스들의 상속 관계일 때
 */

public class ArraySample8_ArraySort2 {

	static void Min(int[] Num) {

		int max = Num[0];

		for (int i = 0; i < Num.length; i++) {

			if (max < Num[i]) {
				max = Num[i];
			}
		}
		System.out.println("최대값 : " + max);

	}

	static void Max(int[] Num) {

		int min = Num[0];

		for (int i = 0; i < Num.length; i++) {

			if (min > Num[i]) {
				min = Num[i];
			}
		}
		System.out.println("최소값 : " + min);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("배열에 저장 할 데이터의 갯수를 입력해주세요.");
		int count = sc.nextInt();

		int[] Num = new int[count];

		System.out.println("정수형 데이터를" + count + "개 입력 해주세요.");

		for (int i = 0; i < Num.length; i++) {
			Num[i] = sc.nextInt();
			System.out.print(Num[i] + " ");
		}

		Arrays.sort(Num);

		System.out.println();
		Max(Num);
		Min(Num);
	}
}