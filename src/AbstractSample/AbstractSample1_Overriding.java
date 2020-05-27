package AbstractSample;

import java.util.Scanner;

/*
 * 1~100사이의 덧셈의 합계를 구하고, 
 * 임의의 x,y 값을 입력 받아서 뺄셈을 하는 로직을 작성하세요.
 * hint> 상속, 오버라이딩 이용
 * 오버라이딩이란 ?
 * - 상속관계일 경우 적용, 아니면 사용하지 않습니다.
 * - 기존의 클래스의 메소드를 상속을 통하여 물려주면서 추상메소드를 오버라이딩을 합니다.
 * - 부모와 같은 이름을 가진 메소드가 물려받은 자식 클래스에서 구현됩니다.
 * - @Override 라고 표기 됩니다.
 * 
 * */
public class AbstractSample1_Overriding extends SUM implements SUB {

	static Scanner sc = new Scanner(System.in);
	static int sub;

	@Override
	public void operation2() {

		System.out.println("x 값 입력 : ");
		int x = sc.nextInt();
		System.out.println("y 값 입력 : ");
		int y = sc.nextInt();
		sub = x - y;
		System.out.println("x-y의 값 : " + sub);

	}

	public static void main(String[] args) {

		int sub = 0;

		operation1();
		AbstractSample1_Overriding AO = new AbstractSample1_Overriding();

		AO.operation2();

	}
}