import java.util.Scanner;

public class JavaSample12_Method4 {

	private static void Adder() {
		// 4. 전달인자도 없고 리턴값(반환값)도 없는경우
		int kor, eng;// 지역변수의 선언 및 초기화
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해 주세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요 : ");
		eng = sc.nextInt();

		sum = kor + eng;
		System.out.println("총점 : " + sum);

	}

	public static void main(String[] args) {
		Adder();

	}

}
