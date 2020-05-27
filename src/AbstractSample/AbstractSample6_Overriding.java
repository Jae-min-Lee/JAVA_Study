package AbstractSample;

import java.util.Scanner;

/*
 * 자동차 프로그램
 * 회사 : 금호 타이어, 한국 타이어
 * 이 두개 회사는 타이어를 판매하는 회사입니다.
 * 인터페이스를 활용하여 오버라이팅을 합니다.
 * 메세지 : "금호타이어가 굴러갑니다. 아주좋습니다.^^"
 * 메세지 : "한국타이어가 굴러갑니다. 매우좋습니다.^^"
 * 
 * 상속, 인터페이스, 추상메소드 오버라이딩 이용
 */

interface Kumho{
	void kumho(String name);
}
interface Korea{
	void korea(String name);
}

public class AbstractSample6_Overriding implements Kumho, Korea{


	@Override
	public void korea(String name) {
		if(name.equals("금호"))
		System.out.println("금호타이어가 굴러갑니다. 아주좋습니다.^^");
	}

	@Override
	public void kumho(String name) {
		if(name.equals("한국"))
		System.out.println("한국타이어가 굴러갑니다. 매우좋습니다.^^");
		
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		AbstractSample6_Overriding ao = new AbstractSample6_Overriding();
		System.out.println("원하시는 타이어회사명을 입력해 주세요.");
		String name = sc.next();
		ao.kumho(name);
		ao.korea(name);

	}
}