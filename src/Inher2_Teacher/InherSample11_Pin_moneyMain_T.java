package Inher2_Teacher;
/*
 * 상속 연습문제
 * 용던 : 아빠가 용돈을 2000원을 주셔습니다.
 *      엄마는 용돈을 3000원을 주셨습니다.
 *      두분에게 받은 금액을 합산하여 출력하세요.*/
import java.util.Scanner;

class Parent{
	
	private int dad;

	public Parent(int dad){
		this.dad = dad;
	}
}

class Child extends Parent{
	
	private int mom;
	private int sum;

	public Child (int mom, int dad){
		super(dad);
		this.mom = mom;
		
		sum = dad + mom;
		System.out.println("용돈의 합계 : " + sum);
	}
}

public class InherSample11_Pin_moneyMain_T {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------용돈기입장------------");
		System.out.print("어머니가 주신용돈 : ");
		int mom = sc.nextInt();
		System.out.print("아버지가 주신용돈 : ");
		int dad = sc.nextInt();
		Child c = new Child(mom, dad);

	}
}
