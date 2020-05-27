import java.util.Scanner;

//문제> 전달인자값을 사용하여 1부터 10까지의 숫자를 출력해보세요.

public class JavaSample14_Exam {

	private static void print(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 10 사이의 숫자를 입력하세요 :  ");
		int number = sc.nextInt();

		print(number);

	}

}
