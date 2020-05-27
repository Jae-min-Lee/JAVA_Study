package Thread;
/*
 * 두개의 Thread를 만들어서 하나는 Interface를 적용하여 동작시키고,
 * 다른하나는 스레드 클레스를 이용하여, 작성하세요.
 * 1부터 10까지의 숫자를 생성하여 합계르 구하세요.
 */

class ThreadTest4 extends Thread{
	public void number(){
		int sum = 0;
		for(int i = 1; i <= 10; i++){
			sum+=i;

			System.out.println(getName() + " i = >  " + ", sum = > " + sum);
		}
	}
	public void run(){
		number();
	}
}

class ThreadTest5 implements Runnable {

	public void run() {
		int sum = 0;
		for (int i = 1; i <= 15; i++) {
			sum += i;

			System.out.println(Thread.currentThread().getName() + i + ", sum = > " + sum + " number = > " + i + ", sum = > " + sum);
		}
	}

	public void start() {
		run();
	}
}

public class ThreadSample3_multithread {

	public static void main(String[] args) {
		
		ThreadTest4 tt4 = new ThreadTest4();
		Runnable r = new ThreadTest5();
		Thread tt5 = new Thread(r);
		
		tt4.start();
		tt5.start();

	}

}
