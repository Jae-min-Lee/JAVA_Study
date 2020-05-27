package GenericCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * java.util패키지의
 * List컬렉션 인터페이스를 구현 상속한 컬레션 클래스 HashSet특징
 * 1. 복수개의 원소값을 동시 저장할 수 있다.
 * 2. 가변적 크기이다.
 * 3. 중복원소값을 허용하지 않는다.
 * 4. 저장된 순서를 유지하지 않는다.
 */
public class CollectionSample4_SetArrayList {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("처리할 데이터의 갯수를 입력해 주세요.");
		
		int cnt = sc.nextInt();

		int count = 0;
		
		do {
			count++;
			System.out.println("이름을 입력해 주세요.");
			String name = sc.next();

			set.add(name);

		} while (count < cnt);
		
//		set.add("홍길동");
//		set.add("문재인");
//		set.add("안철수");
//		set.add("이순신");
//		set.add("홍길동");
		
		System.out.println("========반복절을 이용한 데이터 출력========");
		Iterator<String> elements = set.iterator();

		while (elements.hasNext()) {// 안에 데이터가 존재하는지?
			System.out.println(elements.next());// 다음데이터 출력
		}
	}

}
