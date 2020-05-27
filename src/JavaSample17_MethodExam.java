import java.util.Scanner;

public class JavaSample17_MethodExam {

	private static void gugudan(int number) {
		for (int i = 1; i < 10; i++) {
			System.out.println(number + " x " + i + " = " + number * i);

		}
	}

	public static void main(String[] args) {
		// 구구단 구하기, <단>메소드 이용하기
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단 : ");
		int number = sc.nextInt();
		gugudan(number);

	}

}
