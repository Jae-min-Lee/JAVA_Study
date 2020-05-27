package Exam1;

/*
 * 1)1부터 100사이의 수를 이용하여 for문으로 홀수의 합계를 구하는 프로그램을 2가지 방법으로 작성하세요. 
 * 2)1)에서 while문을 이용하여 2가지 방법으로 풀어보세요. 
 * 3)1부터 100사이에 홀수는  더하기를 하고, 짝수는 빼기를 하여 합계를 구하되 2가지 방법으로 푸세요. 
 * 4)1/2-2/3+3/4-4/5 ~ 49/50 분수의 합계를 구하는 프로그램을 작성하세요. 
 * 5)3개의 숫자를 입력으로 받고 3개의 숫자 중에 중간 값을 가지는 숫자를 출력하세요.    ex) 20, 50, 30 => 30 
 * 6) 1부터 10까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다. 그렇다면 1부터 20까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까? 
 * */

public class Exam1_1_3 {

	public static void main(String[] args) {
		// 1.
		
		int sum = 0, sub = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 != 0){//홀수이면
				sum+=i;//합계를 누적해라
			}
			else 
				sub-=i;
		}
		System.out.println("홀수의 합계 1 : " + sum);
		System.out.println("짝수의 뺄셈 1 : " + sub);
		
		//2.
		int sum2 = 0, Value = 0;
		for( int i2 = 1; i2 <= 100; i2+=2){
			Value = i2 - (i2+1);
			sum2+=Value;
		}//1-2+3-4+5-6...........= ?
		System.out.println("짝수의합과 홀수의 합 1 : " + sum2);//-50

		// 3. 삼항연산자(조건연산자) : flag 기법사용 (현업에서 많이사용)(=sw(전환) : 스위치기법)
		int flag = 0, sum3 = 0;
		for (int i3 = 1; i3 <= 100; i3++) {
			flag = (i3 % 2 == 0) ? -1 : 1;
			sum3 += i3 * flag;
		}
		System.out.println("짝수의합과 홀수의 합 2 : " + sum3);
		
		// 4. ~부정연산자 이용
		int j = 0;
		int value2 = -1;
		int remain = 0;
		int sum4 = 0;
		while (j < 100) {
			j++;//1, 2, 3 
			remain = j % 2; // 1 -> 0 -> 1
			value2 = ~value2;// 0 -> -1 -> 0

			sum4 = sum4 + j * (value2 + remain);
		}//  1   =  0   + 1 * (  0    +   1   )
	     //  -1  =  1   + 2 * (  -1   +   0   ) [1-2]
	     //  2   = -1   + 3 * (  0    +   1   ) [-1+3]
		System.out.println("짝수의합과 홀수의 합 3 : " + sum4);
	}
}
