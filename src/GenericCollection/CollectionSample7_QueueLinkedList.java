package GenericCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class CollectionSample7_QueueLinkedList {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();

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

		// q.add(1000);
		// q.add(1010);
		// q.add(1900);
		// q.add(2100);
		// q.add(3100);
		// q.offer(1500);
		System.out.println("=================1================");
		System.out.println(q.size());
		System.out.println(q);
		System.out.println("=================2================");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		// 위의 while 때문에 밑의 문장이 else 성격이 되버리기때문에 출력이 되지않음
		System.out.println("========반복절을 이용한 데이터 출력========");
		Iterator<Integer> elements = q.iterator();

		while (elements.hasNext()) {// 안에 데이터가 존재하는지?
			System.out.println(elements.next());// 다음데이터 출력
		}
	}
}