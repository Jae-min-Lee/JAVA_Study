import java.util.*;

public class JavaSample4_Scanner {

	public static void main(String[] args) {
		// Scanner class : 키보드로부터 데이터를 입력 받습니다.

		int kor = 0;

		double eng = 0;

		try {

			Scanner sc = new Scanner(System.in);
			System.out.print("국어점수를 입력해주세요 : ");
			kor = sc.nextInt();
			System.out.print("영어 점수를 입력해주세요 : ");
			eng = sc.nextDouble();

			double sum = kor + eng;
			double aver = sum / 2.0;
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + aver);
		} catch (java.util.InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("입력되는 점수가 잘못되었습니다.");
		}
	}
}