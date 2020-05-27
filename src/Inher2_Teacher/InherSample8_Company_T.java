package Inher2_Teacher;

import java.util.Scanner;

/* 이름과 부서와 연봉, 수당을 입력 받아서 연산하는 프로그램을 작성
 * 1. 상속관계 이용
 * 2. 생성자
 * 3. 메소드 이용
 * 
 * 
 */
public class InherSample8_Company_T extends Oper {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요.");
		String name = sc.next();//이름
		System.out.println("부서를 입력해 주세요.");
		String dept = sc.next();//부서
		System.out.println("연봉을 입력해 주세요.");
		int salary = sc.nextInt();//연봉
		System.out.println("수당을 입력해 주세요.");
		int commition = sc.nextInt();//수당

		Sales sales = new Sales(name, dept, salary, commition);//생성자를 이용해서 데이터를 전달(전달인자값)
		
		Oper oper = new Oper();
		
		oper.Operation();
		
		//oper.setxxx();
		
		//oper.getxxx();
	}

}
