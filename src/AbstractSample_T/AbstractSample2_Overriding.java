package AbstractSample_T;

import java.util.Scanner;

/*
 * 인사말 소개 
 * ~님 안녕하세요 (~:ex-홍길동)
 * ~님 안녕히가세요
 * ~님 안녕!!!
 * 
 * - interface introduce로 묶어서 처리함
 * 
 * 오버라이딩이란 ?
 * - 상속관계일 경우 적용, 아니면 사용하지 않습니다.
 * - 기존의 클래스의 메소드를 상속을 통하여 물려주면서 추상메소드를 오버라이딩을 합니다.
 * - 부모와 같은 이름을 가진 메소드가 물려받은 자식 클래스에서 구현됩니다.
 * - @Override 라고 표기 됩니다.
 * - 메소드 오버라이딩 : 일반적인 상속관계일 경우
 * - 추상메소드 오버라이딩 : Interface, abstract class 인 경우 
 * */

interface introducee {

	void hi(String name);

	void bye(String name);

	void hello(String name);

}

class insamal implements introducee {

	@Override
	public void hello(String name) {
		System.out.println(name + "님 안녕하세요.");

	}

	@Override
	public void bye(String name) {
		System.out.println(name + "님 안녕히가세요.");

	}

	@Override
	public void hi(String name) {
		System.out.println(name + "님 안녕!!!");

	}
}

public class AbstractSample2_Overriding {

	static String name;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력해주세요.");

		String name = sc.next();

		insamal isl = new insamal();

		isl.hello(name);
		isl.bye(name);
		isl.hi(name);

	}
}