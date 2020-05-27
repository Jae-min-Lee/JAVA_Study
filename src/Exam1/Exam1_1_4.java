package Exam1;

/*
 * 1)1부터 100사이의 수를 이용하여 for문으로 홀수의 합계를 구하는 프로그램을 2가지 방법으로 작성하세요. 
 * 2)1)에서 while문을 이용하여 2가지 방법으로 풀어보세요. 
 * 3)1부터 100사이에 홀수는  더하기를 하고, 짝수는 빼기를 하여 합계를 구하되 2가지 방법으로 푸세요. 
 * 4)1/2-2/3+3/4-4/5 ~ 49/50 분수의 합계를 구하는 프로그램을 작성하세요. 
 * 5)3개의 숫자를 입력으로 받고 3개의 숫자 중에 중간 값을 가지는 숫자를 출력하세요.    ex) 20, 50, 30 => 30 
 * 6) 1부터 10까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다. 그렇다면 1부터 20까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까? 
 * */

public class Exam1_1_4 {

	public static void main(String[] args) {
		// 1.
		int molecule = 1, denominator = 2; //(분자),(분모)
		double sum = 0.0;
		boolean sw = true;
		while(true){
		if (sw == true) {
		sum += (double)molecule / denominator;
		}
		else{//-
			sum -= (double)molecule / denominator;
		}
		molecule++;
		denominator++;
		
		sw = !sw; // + -> - 변환, - -> + 변환 ....... 반복
		
		if(denominator >= 50)
			break;
		}
		System.out.println(sum);//소숫점 형식의 합계가 출력됩니다.
		
		//2.
		double sum2 = 0, Value = 0;
		for(int i2 = 1; i2 <= 49; i2+=2){
			for(int j2 = 1; j2 <= 50; j2++){
				Value = (i2/j2) - ((i2/j2)+1);
				sum2+=Value;	
			}
		}//1-2+3-4+5-6...........= ?
		System.out.println("짝수의합과 홀수의 합 1 : " + sum2);//-50
}
}