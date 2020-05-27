package GenericCollection;

import java.util.LinkedList;

/*
 * LinkedList class
 * 좌측과 우측에 주소가(번지) 존재합니다.
 * 가운데는 데이터가 있습니다.
 * 데이터가 많아지면, Three형태가 되거나 그래프 형태를 지냅니다.
 */
public class CollectionSample10_LinkedList {

	public static void main(String[] args) {

		LinkedList<String> link = new LinkedList<String>();

		link.add("홍길동");
		link.offer("자바");
		link.offer("HTML5");

		while (link.peek() != null) {// 데이터가 존재한다면.. 큐가 비어있지 않으면..

			System.out.println(link.poll());
		}
	}
}