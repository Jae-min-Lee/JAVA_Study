package GenericCollection;

import java.util.Vector;

/*
 * Vector class
 * - 한가지 데이터형만 저장가능 합니다.
 * - 벡터는 객체형 데이터는 저장하지만, 기본 자료형 데이터는 저장하지 않습니다.
 * - 서로 다른 종류의 데이터를 저장 가능합니다. 단, 객체변수만을 저장합니다.
 * 
 */

public class CollectionSample2_Vector {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "100";
		String s3 = "abcde";
		String s4 = "감사합니다.";
		
		Vector<String> v = new Vector<String>(10,5);
		//10개의 데이터를 넣을 수 있지만 초과되서 확장이되면 5개를 추가로 넣을수 있다.
		
		v.add(s1);
		v.addElement(s1);
		v.add(s2);
		v.addElement(s2);
		v.add(s3);
		v.addElement(s3);
		v.add(s4);
		v.addElement(s4);
		
		System.out.println(v.size());//저장된 가능한 크기?
		System.out.println(v.capacity());//전체용량?
		System.out.println("-----------------------------");
		for(int i = 0; i < v.size(); i++){
			System.out.println(v.get(i));
		}

	}

}
