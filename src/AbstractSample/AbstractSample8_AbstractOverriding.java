package AbstractSample;

import java.util.Scanner;

/*
 * 가감승제산을 두수를 입력받아서, 
 * 추상클래스로 선언하여, 
 * 오버라이딩 시키고, 결과를 출력합니다.
 * add(), sub(), mul(), div1(), div2()
 */

abstract class Calculator {

	public abstract void add();

	public abstract void sub();

	public abstract void mul();

	public abstract void div1();

	public abstract void div2();
}

class Operation extends Calculator {

	static Scanner sc = new Scanner(System.in);

	@Override
	public void add() {
		
		System.out.println("덧셈할 두수를 차례로 입력하세요.");
		int x = sc.nextInt();
		System.out.println("덧셈할 두수를 차례로 입력하세요.");
		int y = sc.nextInt();

		int adder = x + y;
		System.out.println("덧셈 : " + adder);

	}

	@Override
	public void sub() {
		
		System.out.println("뺄셈할 두수를 차례로 입력하세요.");
		int x = sc.nextInt();
		System.out.println("뺄셈할 두수를 차례로 입력하세요.");
		int y = sc.nextInt();

		int sub2 = x - y;
		System.out.println("뺄셈 : " + sub2);

	}

	@Override
	public void mul() {
		
		System.out.println("곱셈할 두수를 차례로 입력하세요.");
		int x = sc.nextInt();
		System.out.println("곱셈할 두수를 차례로 입력하세요.");
		int y = sc.nextInt();

		int mult = x*y;
		System.out.println("곱셈 : " + mult);

	}

	@Override
	public void div1() {

		System.out.println("나눗셈(값)할 두수를 차례로 입력하세요.");
		int x = sc.nextInt();
		System.out.println("나눗셈(값)할 두수를 차례로 입력하세요.");
		int y = sc.nextInt();

		int div1 = x/y;
		System.out.println("나눗셈(값) : " + div1);
		
	}

	@Override
	public void div2() {

		System.out.println("나눗셈(몫)할 두수를 차례로 입력하세요.");
		int x = sc.nextInt();
		System.out.println("나눗셈(몫)할 두수를 차례로 입력하세요.");
		int y = sc.nextInt();

		int div2 = x%y;
		System.out.println("나눗셈(몫) : " + div2);
		
	}

}

public class AbstractSample8_AbstractOverriding {

	public static void main(String[] args) {

		Operation ot = new Operation();

		ot.add();
		ot.sub();
		ot.mul();
		ot.div1();
		ot.div2();

	}

}
