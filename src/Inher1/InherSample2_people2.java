package Inher1;

import java.util.Scanner;

public class InherSample2_people2 extends People2 {

	public static void main(String[] args) {

		String name, jumin, stdNo;

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("주민번호를 입력하세요.");
		jumin = sc.next();
		System.out.println("학번을 입력하세요.");
		stdNo = sc.next();

		People2 p2 = new People2(name, jumin, stdNo);

		// data output : 생성자는 상속이 절대로 안된다. 그러므로 extends해서 사용할 수 없다.
//		                                      억지로는 강제적으로는 클래스명을 이용해 사용은 가능하다.

		p2.DataList();
		System.out.println("-----------------------------------");
		//만약에
		InherSample2_people2 is2 = new InherSample2_people2();
		is2.DataList();
		//이때

	}
}