import java.util.Scanner;

public class JavaSample10_Method2 {

	private static int Adder() {
		// 2. 전달인자는 없으나 리턴값(반환값)이 있는경우
		int kor, eng;// 지역변수의 선언 및 초기화
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해 주세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요 : ");
		eng = sc.nextInt();

		sum = kor + eng;
		return sum;

	}

	public static void main(String[] args) {

		int sum = Adder();
		System.out.println("총점 : " + sum);

	}

}
