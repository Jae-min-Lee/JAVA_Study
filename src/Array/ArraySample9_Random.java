package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 랜덤 클래스(Random)
 * 난수 발생
 * 예> 로또 복권 추첨, 이벤트 추첨.....
 * 표기법>
 * 1. 숫자 : 0 ~ 숫자-1 까지 난수발생
 * 2. 숫자 + 1 : 1 ~ 숫자까지 난수 발생
 * 
 * 문제] 로또 복권 추첨 : 1 ~ 45 숫자중에서 6개 숫자를 난수로 발생
 * - 숫자 + 1 : 1 ~ 숫자까지 난수 발생
 */
public class ArraySample9_Random {

	public static void main(String[] args) {

		do{
		
		Random random = new Random();

		int[] selectNumber = new int[6];

		Scanner sc = new Scanner(System.in);
		
		int count = 6;

		System.out.println("1 ~ 45까지의 숫자 중 6개의 숫자를 입력 해주세요.");

		int input = sc.nextInt();

		int cnt = 0;

		// 당첨번호 체크 루틴, user(사용자 입력)

		int[] winnerNumber = new int[count];

		random = new Random();
		System.out.print("당첨 번호 : " + " ");

		for (int i = 0; i < count; i++) {

			winnerNumber[i] = random.nextInt(45) + 1;
			System.out.print(winnerNumber[i] + " ");
		}
		System.out.println();
		
		//당첨여부 확인
		Arrays.sort(selectNumber);
		Arrays.sort(winnerNumber);
		
		
		//비교 루틴
		boolean result = Arrays.equals(winnerNumber, selectNumber);
		
		if(result == true){
			System.out.println("당첨되셨습니다.");
		}
		else
			System.out.println("다음 기회에...");
		
		}while(true);
	}
}
