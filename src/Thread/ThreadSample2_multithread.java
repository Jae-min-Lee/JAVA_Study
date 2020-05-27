package Thread;

/*
 * MultiThread : 하나의 프로그램내에서 여러개의 작업단위를 한순간에 동시에 수행시키는 것을 말합니다.
 */
class ThreadTest3 implements Runnable {

	public void run() {
		int sum = 0;
		for (int i = 1; i <= 1; i++) {
			sum += i;
			System.out.println(Thread.currentThread().getName() + i + ", sum = > " + sum);
		}
	}

	public void start() {
		run();
	}
}

public class ThreadSample2_multithread {

	public static void main(String[] args) {
		// multiThread
		ThreadTest3 tt = new ThreadTest3();
		
		Thread tt1 = new Thread(tt, "홍길동");
		Thread tt2 = new Thread(tt, "임꺽정");
		Thread tt3 = new Thread(tt, "전우치");

		tt1.start();
		tt2.start();
		tt3.start();
	}
}