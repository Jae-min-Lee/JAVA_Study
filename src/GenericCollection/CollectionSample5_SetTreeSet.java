package GenericCollection;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * TreeSet : 정렬기능을 포함한 set구조 형태
 * 자동으로 sort기능을 내장하고 있는 인터페이스.
 * 기본적으로 오름차순
 * 
 */
public class CollectionSample5_SetTreeSet {

	public static void main(String[] args) {
		
	TreeSet<Integer> tset = new TreeSet<Integer>();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("처리할 데이터의 갯수를 입력해 주세요.");
	
	int cnt = sc.nextInt();

	int count = 0;
	
	do {
		count++;
		System.out.println("숫자를 입력해 주세요.");
		int number = sc.nextInt();

		tset.add(number);

	} while (count < cnt);
	
//	tset.add(100);
//	tset.add(35);
//	tset.add(350);
//	tset.add(500);
//	tset.add(70);

//	System.out.println(tset.size());
//	System.out.println(tset);
//	
//	tset.add(200);
//	System.out.println(tset);
//	
//	tset.remove(350);
//	System.out.println(tset);
	
	System.out.println(tset.size());
	System.out.println(tset);
	}

}
