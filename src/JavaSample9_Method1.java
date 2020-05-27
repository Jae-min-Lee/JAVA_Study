/*
 * Method : 특정 조건문이나 반복문을 실행 하는 것.

 * 분류기준
 * -------------------------
 *    반환값             전달인자값의 유무
 * -------------------------
 * 1.   O            O [O]
 * 2.   O            X [O]
 * 3.   X            O
 * 4.   X            X
 * -------------------------
 * 
 * 
 */
import java.util.*;

public class JavaSample9_Method1 {
	// field area
	// 클래스 매소드
	private static int Adder(int kor, int eng) {
		int sum = 0;
		sum = kor + eng;
		return sum;
	}

	// 프로그램의 시작과 끝
	public static void main(String[] args) {
		// 1. 전달인자와 리턴값(반환값)이 있는경우
		int kor, eng;// 지역변수의 선언 및 초기화

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해 주세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요 : ");
		eng = sc.nextInt();

		int sum = Adder(kor, eng);// 메소드 호출, 전달인자값 전달
		System.out.println("총점 : " + sum);

	}
}







/*
 * 메소드의 구성 정보
 * private : 접근 제한자 / static : 데이터 공유 / int(정수) : 리턴 타입 / Adder : 메소드 명 
 * (int kor, int eng) : 매개변수 목록
 * private static int Adder(int kor, int eng){
 * }
 * 
 * */
