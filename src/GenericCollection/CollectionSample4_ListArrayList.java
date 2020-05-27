package GenericCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * java.util패키지의
 * List컬렉션 인터페이스를 구현 상속한 컬레션 클래스 ArrayList특징
 * 1. 복수개의 원소값을 동시 저장할 수 있다.
 * 2. 복수개의 자료형을 동시 저장 가능한다.
 * 3. 가변적 크기이다.
 * 4. 중복원소값을 허용한다.
 * 5. 저장된 순서를 유지한다.
 */
public class CollectionSample4_ListArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		System.out.println("처리할 데이터의 갯수를 입력해 주세요.");
		int cnt = sc.nextInt();

		int count = 0;
		do {
			count++;
			System.out.println("이름을 입력해 주세요.");
			String name = sc.next();

			list.add(name);

		} while (count < cnt);

		System.out.println("=======Indexing에 의한 데이터 출력=======");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println("========반복절을 이용한 데이터 출력========");

		// 반복자
		Iterator<String> elements = list.iterator();

		while (elements.hasNext()) {// 안에 데이터가 존재하는지?
			System.out.println(elements.next());// 다음데이터 출력
		}
	}
}