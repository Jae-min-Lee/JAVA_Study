package Lambda_Expression;

import java.util.Scanner;

import Inher1.Adder;

@FunctionalInterface
interface Subtract {
	public abstract void Suber(int x, int y);
}

public class LambdaExpression2_Suber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Subtract suber = (w, z) -> {
			int sum = w - z;
			System.out.println("합계 : " + sum);
		};

		System.out.println("두수를 입력 해주세요.");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		suber.Suber(su1, su2);

	}
}