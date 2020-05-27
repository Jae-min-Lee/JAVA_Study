package Lambda_Expression;

import java.util.Scanner;

import Inher1.Adder;

@FunctionalInterface
interface Addition {
	public abstract void Adder(int x, int y);
}

@FunctionalInterface
interface Sub{
	public abstract void Sub(int i, int j);
}

public class LambdaExpression2_Adder {

	public static void main(String[] args) {
		
		Addition adder = (k, m) -> {
			int sum = k + m;
			System.out.println("합계 : " + sum);
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두수를 입력 해주세요.");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		adder.Adder(su1, su2);
		
		Sub sub = (w, z) -> {
			int sum2 = w - z;
			System.out.println("합계 : " + sum2);
		};
		
		System.out.println("두수를 입력 해주세요.");
		int su3 = sc.nextInt();
		int su4 = sc.nextInt();
		sub.Sub(su3, su4);

	}
}
