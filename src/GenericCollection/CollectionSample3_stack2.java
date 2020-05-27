package GenericCollection;

import java.util.Scanner;
import java.util.Stack;

/*
 * 회문수 구하기
 * 다음과 같이 주어지는 숫자에 대하여 회문수인지를 판별하여 출력합니다.
 * 회문수1234321처럼 앞뒤로 읽어도 같은 수, 거꾸로 써도 자기 자신이 되는 수.
 * 예> 123321 => 회문수가 맞습니다.
 */

public class CollectionSample3_stack2 {

	public static void main(String[] args) {

		while (true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력 : ");
			String num = sc.next();
			String str = num;

			String result = "";

			Stack<Character> stack = new Stack<Character>();
			

			//stack Input
			for (int i = 0; i < str.length(); i++) {
				stack.push(str.charAt(i));
			}
			//stack check
			while (!stack.isEmpty()) {//123321 => 123321
				result += stack.pop();
			}
			if (str.equals(result)) {
				System.out.println("회문수가 맞습니다.");
			} else {
				System.out.println("회문수가 아닙니다.");
			}
		}
	}
}