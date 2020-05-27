package methodtest;

import java.util.Scanner;

/*
 * 메소드 오버로딩 ? 메소드가 같은 이름으로 다른기능을 구현한 것.
 * 구분 기준> 메소드 구분기준
 * -자료형
 * -자료의 갯수
 */


//이름과 나이를 입력 받아서 출력하되, 메소드 오버로딩을 이용하세요.

public class methodOverLoding1 {
	//
	
	private void Information(int age) {
		System.out.println("나이는 " + age + "입니다.");
	}
	                          //문자데이터
	private void Information(String name) {
		System.out.println("이름은 " + name + " 이고, ");
		
	}

	public static void main(String[] args) {
		methodOverLoding1 mol1 = new methodOverLoding1();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		mol1.Information(name);
		mol1.Information(age);

	}



}
