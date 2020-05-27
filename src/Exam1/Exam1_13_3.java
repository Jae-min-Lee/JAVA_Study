package Exam1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 * 3) 스무고개 게임   컴퓨터가 하나의 어떤 숫자를 생성합니다. 
 * 그러면, 사람이 컴퓨터가 생성한 숫자가 무엇인지를 생각 하여 알아 맞추는 게임입니다.  
 * 조건1] 1부터 500까지의 사이의 난수가 발생하도록 하고, 시도횟 수를 카운트합니다. 
 * 그리고, 큰수인지, 작은수 인지를 판단하여 알려주고, 
 * 맞추었으면 "정답입니 다.!!!!^^“ 를 화면에 메시지로 출력합니다.    
 * 예외처리도 작성하여 테스트 해봅니다. 
 * 
 * 1. 1부터 500까지의 난수가 발생
 * 2. 시도횟수 카운트
 * 3. 사람이 난수를 알아 맞추려고 한다.
 * 4. 스무고개가 반복되는 동안에 컴퓨터가 사람이 입력한 수가 큰 수 인지, 작은 수 인지를 판단하여 알려준다.
 * 5. 맞췄으면 "정답입니다. !!!!!^^"
 * 6. 예외처리 작성 및 테스트
 * 
 */
public class Exam1_13_3 {

	public static void main(String[] args) {
		// Random rd = new Random();
		// int Computer = rd.nextInt(500) + 500; //1 ~ 500
		int count = 0;

		int computer = (int) (Math.random() * 500) + 1; // 1 ~ 500

		do {
			try {
				count++;
				Scanner sc = new Scanner(System.in);
				System.out.println("1 ~ 500 사이의 숫자를 입력해 주세요 : ");
				int user = sc.nextInt();
				
				if (user >= 1 && user <= 500)//이라인을 만족 하지않으면 가냥 빠져나감 (이중 if문)

					if (computer > user) {
						System.out.println("더 큰 숫자를 입력 해 주세요.");
					} else if (computer < user) {
						System.out.println("더 작은 숫자를 입력 해 주세요.");
					} else
						System.out.println("정답입니 다.!!!!^^");
				        System.out.println("시도 횟수는 : " + count + " 입니다.");

			} catch (InputMismatchException ime) {// ime :
													// InputMismatchException 약자
				System.out.println("숫자를 입력해 주세요.");
			}
		} while (count <= 20);
	}
}
