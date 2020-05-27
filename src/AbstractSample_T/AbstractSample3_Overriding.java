package AbstractSample_T;

import java.util.Scanner;
/*
 * 인사말 소개 
 * ~님 안녕하세요 (~:ex-홍길동)
 * ~님 안녕히가세요
 * ~님 안녕!!!
 * 
 * interface introduce1 => Hello
 * interface introduce2 => Bye
 * interface introduce3 => Hi
 * 
 * 오버라이딩이란 ?
 * - 상속관계일 경우 적용, 아니면 사용하지 않습니다.
 * - 기존의 클래스의 메소드를 상속을 통하여 물려주면서 추상메소드를 오버라이딩을 합니다.
 * - 부모와 같은 이름을 가진 메소드가 물려받은 자식 클래스에서 구현됩니다.
 * - @Override 라고 표기 됩니다.
 * - 메소드 오버라이딩 : 일반적인 상속관계일 경우
 * - 추상메소드 오버라이딩 : Interface, abstract class 인 경우 
 * - 인터페이스와 추상클래스는 객체를 생성할수 없다.
 * */
interface introducee1 {

	void hello(String name);

}

interface introducee2 {

	void bye(String name);

}

interface introducee3 {

	void hi(String name);

}

class insamal2 implements introducee1, introducee2, introducee3 {

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

public class AbstractSample3_Overriding {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력해주세요.");

		String name = sc.next();
		
		insamal2 isl2 = new insamal2();

		isl2.hello(name);
		isl2.bye(name);
		isl2.hi(name);

	}

}
