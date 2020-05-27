package Exam1;

/*
 * 6) 1부터 10까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다. 그렇다면 1부터 20까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까? 
 * */

public class Exam1_1_6 {

	public static void main(String[] args) {
		boolean k = true;
		int n = 1;

		while (k) {
			n++;
			if (n % 1 == 0 && n % 1 == 0 && n % 2 == 0 && n % 3 == 0
					&& n % 4 == 0 && n % 5 == 0 && n % 6 == 0 && n % 7 == 0
					&& n % 8 == 0 && n % 9 == 0 && n % 10 == 0 && n % 11 == 0
					&& n % 12 == 0 && n % 13 == 0 && n % 14 == 0 && n % 15 == 0
					&& n % 16 == 0 && n % 17 == 0 && n % 18 == 0 && n % 19 == 0
					&& n % 20 == 0) {
				k = false;
			}
		}
		System.out.println(n);//232792560
	}
}