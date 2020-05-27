package Exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 1) 이름과 나이를 입력하여 그대로 출력하는 프로그램을 작성하되, 
 나이와 이름을 메소드를 만들어 서 코드의 재 사용성이 돋보이도록 작성하세요.      
 예시] 입력 : 홍길동 300     출력 : 홍길동님의 나이는 300세입니다.

 1. 일반적인 코딩 : 1_11_1 [메소드 사용X]
 2. 비객체지향적 코딩 : static [메소드 만드는것]
 3. 객체지향적 코딩 : 객체의 생성(new 키워드)[객체를 나누는것]

 */
//3. static 키워드를 이용한 비객체지향적 코딩
public class Exam1_11_2_2 {
	// 필드영역
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	private static String name;

	private static int age;

	// 접근제한자 //반환형(리턴x) //메소드형 // 매개변수목록

	private static String name() {
		name = null;// ="";

		try {
			System.out.println("이름을 입력해 주세요 : ");
			name = br.readLine();// 한줄 (80컬럼)을 모두 문자열로 처리해서 읽으세요.
		} catch (IOException e) {// IOException e : 데이터가 입출력을 할때 일어나는 예외상황
			e.printStackTrace();
		}
		return name;

	}

	private static int age() {
		age = 0;
		try {
			System.out.println("나이를 입력해 주세요 : ");
			age = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return age;

	}

	public static void main(String[] args) {// 메인메소드영역, 객체생성

		Exam1_11_2_2 nameage = new Exam1_11_2_2();// 이 객체를 이용해서 호출

		name = nameage.name();
		age = nameage.age();

		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 입니다.");
	}
}

//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/* BufferedReader br : 버퍼를 통하여 처리하시오.
 * br : 객체를 생성하고,
 * =
 * new : 메모리 할당 연산자를 이용하여
 * BufferedReader br : 버퍼에 담아서 저장하고(32비트 = 4k or 64비트 = 8k : 운영체제의 차이)
 * new InputStreamReader : 1바이트씩 입력을 받아서
 * System.in : 키보드로부터
 */