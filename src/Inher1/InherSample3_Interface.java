package Inher1;

import java.util.Scanner;

public class InherSample3_Interface implements people3_Interface{

	@Override
	public void personInformation() {
		String name, jumin, stdNo;

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("주민번호를 입력하세요.");
		jumin = sc.next();
		System.out.println("학번을 입력하세요.");
		stdNo = sc.next();
		
		System.out.println(name);
		System.out.println(jumin);
		System.out.println(stdNo);
		
	}
	
	public static void main(String[] args) {

		InherSample3_Interface is3 = new InherSample3_Interface();
		is3.personInformation();
		
	}
}
