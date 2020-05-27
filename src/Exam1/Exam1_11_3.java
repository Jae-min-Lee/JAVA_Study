package Exam1;

import java.util.Scanner;

//생성자 개념을 도입하여 프로그램(가감승제산) 하세요.
/*
 * 1. 일반적인 코딩
 * 2. 비객체지향 코딩
 * 3. 객체지향 코딩 : constructor(생성자 개념 이용)
 * 조건> constructor(생성자 개념 이용)
 * 
 * -디폴트 생성개념 :디폴트 생성자라 부릅니다. 프로그래머가 디폴트 생성자를 기재하지 않으면 (만들지 않으면) 자동으로 JVM(자바버추얼머신)이 내부적으로 만들어 줍니다.
 * -그리고, 필요하다면 디폴트 생성자 내부에 간단한 초기화나 연산 등을 할 수도 있습니다.(하지만 대부분 비워둡니다.)
 * -생성자는 상속이 되지 않습니다.
 * -생성자는 데이터를 초기화 시키는 것이 주 목적 입니다.
 * -메소드와 비슷하지만, 다른 점은 반환값이 존재하지 않습니다.
 * -반드시 클래스명과 같아야 합니다.
 * 
 * 
 * 생성자 오버로딩 : 같은 이름의 생성자를 가지고 서로 다른 역할(처리)을 하도록 하는 것을 말한다. 
 * 
 */
public class Exam1_11_3 {
	//1. 클래스변스
	private static int value1;//클래스 변수, 자동초기화 변수 = 0; => 100
	private static int value2;//클래스 변수, 자동초기화 변수 = 0; => 50
	private static int value3;
	private static int value4;
	private static int value5;
	private static int value6;

	
    //2. 디폴트 생성자
	public Exam1_11_3() {//디폴트 생성자라 부릅니다.

	}
	//3. 생성자 메소드
// 접근제한자  // 생성자 메소드명 // (매개변수 목록 : 반환값이 없음)
	                //   100    ,    50

	public Exam1_11_3(int value3) {
		this.value3 = value3;// this : 입력받은 값이 넘어오면 ...그림참조
	}

	
	public Exam1_11_3(int value1, int value2) {

		this.value1 = value1; // = value1 : =
		this.value2 = value2;
		int sum = value1 + value2;
		System.out.println("덧셈의 값 : " + sum);
	}

	// 4. 메소드
//	private void add(int value1, int value2) {
//		int sum = value1 + value2;
//
//		System.out.println("덧셈 : " + sum);
//
//	}

	public Exam1_11_3(int value4, int value5, int value6) {
		this.value4 = value6;
		this.value5 = value5;
		this.value6 = value4;
		
		int sum = value4 * value5 * value6;
		System.out.println("곱셈의 값 : " + sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 전달할 데이터를 입력하세요.");
		int value1 = sc.nextInt();//100
		System.out.println("두번째 전달할 데이터를 입력하세요.");
		int value2 = sc.nextInt();//50
		System.out.println("세번째 전달할 데이터를 입력하세요.");
		int value3 = sc.nextInt();//50
		                                     //100 , 50
		Exam1_11_3 operator1 = new Exam1_11_3();
		Exam1_11_3 operator2 = new Exam1_11_3(value1);
		Exam1_11_3 operator3 = new Exam1_11_3(value1, value2);
		Exam1_11_3 operator4 = new Exam1_11_3(value1, value2, value3);
		
		
		//operator.add(value1,value2);
		
		
		int x1 = Exam1_11_3.value1;
		int x2 = Exam1_11_3.value2;
		int sum = x1 + x2;
		System.out.println("덧셈의 값 : " + sum);
//		System.out.println("전달된 데이터 1 : " + Exam1_11_3.value1);//클래스명.클래스변수명, => 100
//		System.out.println("전달된 데이터 2 : " + Exam1_11_3.value2);//클래스명.클래스변수명, => 50

	}



}
