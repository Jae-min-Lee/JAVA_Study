package AbstractSample;
/*
 * 현대 자동차가 있습니다.
 * 자동차에 대한 상태르 표시하는 메소드를 구현하세요.
 * 1. 자동차가 출발합니다. start()
 * 2. 자동차가 운행중 입니다. running()
 * 3. 자동차가 좌회전을 합니다. leftDrive()
 * 4. 자동차가 우회전을 합니다. rightDrive()
 * 5. 운행을 중지합니다. stop()
 * 
 * hint> 추상클래스. 추상메소드 오버라이딩, 상속이용   
 */

abstract class Hyundae{
	String msg = "화이팅~~~~~~~";
	public abstract void start();
	public abstract void running();
	public abstract void leftDrive();
	public abstract void rightDrive();
	public abstract void stop();
}

class Cars extends Hyundae{

	@Override
	public void start() {
		System.out.println(msg + " 자동차가 출발합니다.");
		
	}

	@Override
	public void running() {
		System.out.println(msg + " 자동차가 운행중입니다.");
		
	}

	@Override
	public void leftDrive() {
		System.out.println(msg + " 자동차가 좌회전을 합니다.");
		
	}

	@Override
	public void rightDrive() {
		System.out.println(msg + " 자동차가 우회전을 합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println(msg + " 운행을 중지합니다.");
		
	}
	
}
public class AbstractSample9_AbstractOverriding {

	public static void main(String[] args) {
	
		Cars car = new Cars();
		
		car.start();
		car.running();
		car.leftDrive();
		car.rightDrive();
		car.stop();

	}

}
