package Inher1;

import java.util.Scanner;

/*
 * 가감 승계산을 하여 결과를 출력하라.
 * 1. 가산 : adder()          => class(Adder)
 * 2. 감산 : subtract()       => class(Subtract)
 * 3. 승산 : multiply()       => class(Multiply)
 * 4. 제산(몫) : divide1()    => interface(Divide1)
 * 5. 제산(나머지) : divide2() => interface(Divide2)
 */
public class InherSample4_Operation1 extends Adder implements Divide1, Divide2 {

	@Override //추상메소드 오버라이딩 루틴
	public void divide1() {

		Scanner sc = new Scanner(System.in);
		// '/'
		System.out.println("제산(몫) 첫번 째 데이터를 입력해 주세요.");
		int x4 = sc.nextInt();
		System.out.println("제산(몫) 두번 째 데이터를 입력해 주세요.");
		int y4 = sc.nextInt();

		int div = x4 / y4;
		System.out.println("제산(몫) : " + div);
		System.out.println("===========================");
	}

	@Override //추상메소드 오버라이딩 루틴
	public void divide2() {

		Scanner sc = new Scanner(System.in);
		// '%'
		System.out.println("제산(나머지) 첫번 째 데이터를 입력해 주세요.");
		int x5 = sc.nextInt();
		System.out.println("제산(나머지) 두번 째 데이터를 입력해 주세요.");
		int y5 = sc.nextInt();

		int div = x5 % y5;
		System.out.println("제산(나머지) : " + div);
		System.out.println("===========================");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// '+'
		System.out.println("가산 첫번 째 데이터를 입력해 주세요.");
		int x = sc.nextInt();
		System.out.println("가산 두번 째 데이터를 입력해 주세요.");
		int y = sc.nextInt();

		int sum = adder(x, y);// Static : 공유해
		System.out.println("가산 : " + sum);
		System.out.println("===========================");

		// '-'
		System.out.println("감산 첫번 째 데이터를 입력해 주세요.");
		int x2 = sc.nextInt();
		System.out.println("감산 두번 째 데이터를 입력해 주세요.");
		int y2 = sc.nextInt();
		subtract(x2, y2);
		System.out.println("===========================");

		// '*'
		int mul = multiply();
		System.out.println("승산 : " + mul);
		System.out.println("===========================");

		// '/'
		InherSample4_Operation1 is4 = new InherSample4_Operation1();// 메인클래스의
																	// 객체를 만들어서
																	// 사용
		is4.divide1();

		// '%'
		is4.divide2();
	}
}