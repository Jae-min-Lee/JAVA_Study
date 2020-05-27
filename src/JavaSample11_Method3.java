import java.util.Scanner;

public class JavaSample11_Method3 {
	private static void Adder(int kor, int eng) {
		int sum = 0;
		sum = kor + eng;
		System.out.println("총점 : " + sum);
	}

	public static void main(String[] args) {

		// 3. 전달인자가 있지만 리턴값(반환값)이 없는경우
		int kor, eng;// 지역변수의 선언 및 초기화

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해 주세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요 : ");
		eng = sc.nextInt();

		Adder(kor, eng);// 메소드 호출, 전달인자값 전달

	}

}
