package Thread;

/*
 * 양보 메소드(vield())를 이용하여 각 프로그램의 출력을
 * 조정하는 프로그램을 작성하세요.
 * - Thread.yield
 */

class ThreadExam4_3 extends Thread{
	public void run() {
		
		for(int i = 0; i <  100; i++){
			System.out.println("T3");
			
			if(i == 10||i == 20||i == 30||i ==40||i == 50||i == 60||i == 70||i == 80||i == 90)
				Thread.yield();
		}
	}
}

class ThreadExam4_2 extends Thread{
	public void run() {
		
		for(int i = 0; i <  100; i++){
			System.out.println("T2");
			if(i == 5||i == 10||i == 15||i == 20||i == 25||i == 30||i == 35||i == 40||i == 45)
				Thread.yield();
		}
	}
}

class ThreadExam4_1 extends Thread{
	public void run() {
		
		for(int i = 0; i <  100; i++){
			System.out.println("T1");
		}

	}
}

public class ThreadSample4_yield {

	public static void main(String[] args) {

		ThreadExam4_1 t1 = new ThreadExam4_1();
		ThreadExam4_2 t2 = new ThreadExam4_2();
		ThreadExam4_3 t3 = new ThreadExam4_3();

		t1.start();
		t2.start();
		t3.start();

	}
}