package Thread;
/*
 * Thread : 하나의 프로그램내에서 여러개의 작업단위를 한순간에 하나씩 수행시키는 것을 말합니다.
 * MultiThread : 하나의 프로그램내에서 여러개의 작업단위를 한순간에 동시에 수행시키는 것을 말합니다.
 * - Thread class
 * - Runnable Interface
 * 
 * 1) Thread 클래스를 상속 받아서 처리하는 방법
 * 
 */

class ThreadTest extends Thread{
	public void number(){
		int sum = 0;
		for(int i = 1; i <= 15; i++){
			sum+=i;
			System.out.println("number = > " + i + ", sum = > " + sum);
		}
	}
	public void run(){
		number();
	}
}
public class ThreadSample1 {
// single Thread
	public static void main(String[] args) {
		
		ThreadTest tt = new ThreadTest();

		tt.start();
	}

}
