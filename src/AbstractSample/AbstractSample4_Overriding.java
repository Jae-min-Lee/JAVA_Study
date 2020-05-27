package AbstractSample;


import java.util.Scanner;

/*
 * 성적처리
 * 국어 = ? , 영어 = ?
 * 
 * 메시지처리 : 200점이 나오면 "축하드립니다. 만점입니다."
 *          그렇지 않으면 "총점이 처리되었습니다."
 *          
 * Hint> 상속, 인터페이스, 추상메소드 오버라이딩 이용
 */

interface SUM2 {

	void total(int kscore, int escore);
}

class Score implements SUM2 {

	static int total;

	static Scanner sc = new Scanner(System.in);

	public static void score() {
		System.out.println("국어점수를 입력해 주세요");
		int kscore = sc.nextInt();
		System.out.println("영어점수를 입력해 주세요");
		int escore = sc.nextInt();
		Score s = new Score();
		s.total(kscore, escore);
	}

	@Override
	public void total(int kscore, int escore) {

		total = kscore + escore;
		if (total == 200) {
			System.out.println("축하드립니다. " + total + "점만점입니다.");
		} else
			System.out.println("총점" + total + "점으로 처리되었습니다.");
	}

}

public class AbstractSample4_Overriding extends Score {

	public static void main(String[] args) {

		score();
	}
}