package Inher1;

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
 * 다중 상속의 효과 : 추상클래스, 인터페이스 사용
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
 * 
 * 문제> 이름, 주민번호, 학번을 입력 받아서 출력하는 프로그램을 작성하세요.
 */
public class InherSample1_people extends People{

	public static void main(String[] args) {
		String name, jumin, stdNo;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("주민번호를 입력하세요.");
		jumin = sc.next();
		System.out.println("학번을 입력하세요.");
		stdNo = sc.next();

		setName(name);
		setJumin(jumin);
		setStdNo(stdNo);
		
		System.out.println(getName());
		System.out.println(getJumin());
		System.out.println(getStdNo());
	}

}
