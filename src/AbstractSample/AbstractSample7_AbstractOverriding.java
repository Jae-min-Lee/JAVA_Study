package AbstractSample;

import java.sql.Time;

/*
 * 추상클래스(객체생성불가)
 * - 터페이스와 사용법은 같습니다.
 * - 사전에 미리 설계해서 만들어 놓아야 합니다.
 * - 
 * 
 * 
 * 
 */

abstract class Tire{
	String msgKumho = "금호 타이어가 굴러갑니다. 아주 좋습니다.";
	String msgHankuk = "한국 타이어가 굴러갑니다. 매우 좋습니다.";
	abstract void KumhoTire();
	abstract void HankukTire();
}

public class AbstractSample7_AbstractOverriding extends Tire{

	public static void main(String[] args) {
//		
//		Tire t = new Time();
//		t.KumhoTire();
//		t.HankukTire();
	}

	@Override
	void KumhoTire() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void HankukTire() {
		// TODO Auto-generated method stub
		
	}

}
