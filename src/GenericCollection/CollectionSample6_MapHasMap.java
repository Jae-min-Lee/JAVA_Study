package GenericCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Map 구조?
 * ss(key,value) 쌍으로 구성되어 있습니다.
 * - 중복키는 허용하지 않습니다.
 * - 중복값은 허용합니다.
 * - 키값으로 검색을 하므로 검색속도는 매우 빠르다.
 */
public class CollectionSample6_MapHasMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("처리할 데이터의 갯수를 입력해 주세요.");

		int cnt = sc.nextInt();

		int count = 0;

		do {
			count++;
			System.out.println("이름을 입력해 주세요.");
			String name = sc.next();
			System.out.println("숫자를 입력해 주세요.");
			int number = sc.nextInt();

			map.put(name, number);

		} while (count < cnt);

		// map.put(name, number);

		// map.put("홍길동1", 1000);
		// map.put("홍길동2", 1010);
		// map.put("문재인", 1900);
		// map.put("안철수", 2100);
		// map.put("홍길동3", 3100);

		// System.out.println(map.get("홍길동1"));
		// System.out.println(map.get("홍길동2"));
		// System.out.println(map.get("문재인"));
		// System.out.println(map.get("안철수"));
		// System.out.println(map.get("홍길동3"));
		
		System.out.println("========반복절을 이용한 데이터 출력========");
		
		Iterator<String> keys = map.keySet().iterator();

		while (keys.hasNext()) {// 안에 데이터가 존재하는지?
			String currentKey = keys.next();
			System.out.printf("문자열이름 : %s %d \n", currentKey, map.get(currentKey));// 다음데이터 출력
		}
	}
}