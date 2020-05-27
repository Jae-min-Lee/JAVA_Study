package Thread;
/*
 * synchronized ?
 * 소비자와 생산자, 수요와 공급, 학습과 지도, 공중화장실, 영화입장등의 데이터 처리에 있어서
 * 순서가 지켜지지 않으면 심각한 문제를 초래합니다.
 * 이에 질서를 부여하기 위해 동기화를 사용합니다.
 * 
 */

class DressingRoomThread implements Runnable{
	
	public void run(){
		synchronized(this) {//this = DressingRoomThread
		for(int i = 4; i >= 1; i--){
			System.out.println(Thread.currentThread().getName());
			System.out.println("Dressing 종료 " + (i*10) + "초전.");
		}
		}
		System.out.println(Thread.currentThread().getName() + " Dressing 종료.");
	}
}
public class ThreadSample4_synchronized {

	public static void main(String[] args) {
		//병원관리시스템
		DressingRoomThread dr = new DressingRoomThread();

		Thread tt1 = new Thread(dr, "홍길동");
		Thread tt2 = new Thread(dr, "임꺽정");
		Thread tt3 = new Thread(dr, "전우치");
		Thread tt4 = new Thread(dr, "장길산");
		
		tt1.start();
		tt2.start();
		tt3.start();
		tt4.start();
	}

}
