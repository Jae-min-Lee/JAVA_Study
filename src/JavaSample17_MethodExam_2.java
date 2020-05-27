//문제> 시작단과 끝단을 입력하면 출력되도록 하세요.
// ex_ 3~5
import java.util.Scanner;

public class JavaSample17_MethodExam_2 {

	private static void gugudan(int dan, int dan2) {
		//     초기값                   조건식           증강식
		for (int i = dan; i <= dan2; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 단을 입력하세요 : ");
		int dan = sc.nextInt();
		System.out.print("끝 단을 입력하세요 : ");
		int dan2 = sc.nextInt();

		gugudan(dan, dan2);

	}

}