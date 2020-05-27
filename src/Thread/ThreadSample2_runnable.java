package Thread;
/* 
* - Runnable Interface를 상속 받아서 처리하는 방법
*/
class ThreadTest2 implements Runnable {

	public void run() {
		int sum = 0;
		for (int i = 1; i <= 15; i++) {
			sum += i;
			System.out.println("number = > " + i + ", sum = > " + sum);
		}
	}

	public void start() {
		run();
	}
}

public class ThreadSample2_runnable {

	public static void main(String[] args) {

		ThreadTest2 tt = new ThreadTest2();

		tt.start();
	}
}