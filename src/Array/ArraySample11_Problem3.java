package Array;

import java.util.Scanner;

/* 
 * 3. 숫자 맞추기 게임
 * 특정 숫자, 난수를 입력받아 발생시키고, 사용자는 이숫자를 맞추는 게임입니다. 
 * 난수 범위는 1~1000 사이 입니다.
 * 맞춘 횟수는 count하고 출력합니다.
 * 
 */ 
public class ArraySample11_Problem3 {

	public static void main(String[] args) {
		//3. C : 난수발생, D : 맞추는 사람
		
		int count=0;
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("맞출 숫자를 입력하세요.^^");
		int C = sc3.nextInt();
		
		while(true) {
			count++;			
		
		System.out.println("맞출 숫자를 입력하세요.^^");
		int D = sc3.nextInt();
		
		if(C == D){
			System.out.println("정답입니다.^^");
			System.out.println(count + "번 만에 맞추셨습니다.^^");
		}else if(C > D){
			System.out.println("숨겨진 숫자보다 작습니다.ㅠㅠ");
		}else {
			System.out.println("숨겨진 숫자보다 큽니다.ㅠㅠ");
		}
		}	
		
	}

}
