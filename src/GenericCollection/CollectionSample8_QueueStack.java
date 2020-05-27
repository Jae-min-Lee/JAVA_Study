package GenericCollection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
 * 문제> 스택과 큐의 속성을 이용하여 100, 200, 300이라는 데이터를 저장하고,
 * 다음과같이 스택으로 출력하고, 큐로 출력하세요.
 * 
 * ex-
 * ====== stack ======
 */
public class CollectionSample8_QueueStack {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();

		Stack<Integer> s = new Stack<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("처리할 데이터의 갯수를 입력해 주세요.");

		int cnt = sc.nextInt();

		int count = 0;

		do {
			count++;

			System.out.println("숫자를 입력해 주세요.");

			int number = sc.nextInt();

			q.add(number);

		} while (count < cnt);

		System.out.println("================Queue================");
		while (!q.isEmpty()) {
			System.out.print(" " + q.poll() + " ");
		}
		System.out.println();
		System.out.println("처리할 데이터의 갯수를 입력해 주세요.");

		int cnt2 = sc.nextInt();

		int count2 = 0;

		do {
			count2++;

			System.out.println("숫자를 입력해 주세요.");

			int number2 = sc.nextInt();
			// push = add
			s.add(number2);

		} while (count2 < cnt2);

		System.out.println("================Stack================");
		while (!s.isEmpty()) {
			System.out.print(" " + s.pop() + " ");
		}
	}
}