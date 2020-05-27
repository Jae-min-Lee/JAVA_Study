package GenericCollection;

import java.util.Vector;

/*
 * 자바의 자료구조 기능을 제공하는 클래스 중 가장 기본적인 클래스로,
 * 배열과 비슷하지만 배열과는 달리 다른 종류의 데이터 타입의 데이터 요소를 가질 수 있으며,
 * 데이터가 가득차면 자동적으로 저장영역을 늘려준다.
 * 
 * 또한 객체 레퍼런스를 저장하기 때문에 JDK5.0 이전에는 자바 기본형 데이터는 저장할 수 없었으며
 * JDK5.0 이후 부터는 오토박싱/오토 언박싱 기능으로 기본형 데이터도 저장이 가능하다.
 * - 오토박싱 : 기본 자료형을 레퍼타입으로 자동형변환하는 것.
 * #레퍼타입 ? 
 * = 레퍼런스 타입
 * = Byte, Short, Integer, Long, Float, Double, Boolean, Char......
 * #기본자료형 ?
 * = byte, short, int, long, float, double, boolean, char......
 * - 오토 언박싱 : 레퍼타입을 기본자료형으로 자동 형변환하는 것.
 * 
 * Vector클래스의 기본구조는 시퀀스(Sequence) 데이터 구조에 기반하며,
 * 시퀀스는 데이터접근을 순차적인 인덱스 값에 대한 위치로 접근한다.
 * 
 * 따라서 자료구조의 양단에서만 접근이 가능한 스택이나 큐와달리
 * 시퀀스는 인덱스 값을 이용하여 자료구조 임의의 지점에서 저장 및 접근이 가능하다.
 */
public class CollectionSample9_Vector {

	public static void main(String[] args) {
		// 오토 박싱|언박싱
		// int n1 = 10;//AutoBoxing 오토박싱
		// int n2;//AutoUnBoxing 오토 언박싱
		//
		// Integer num1;//AutoBoxing 오토박싱
		// Integer num2 = new Integer(200);//AutoUnBoxing 오토 언박싱
		//
		// num1 = n1;//AutoBoxing 기본자료형 => 레퍼타입
		// n2 = num2;//AutoUnBoxing 오토 언박싱 레퍼타입 => 기본자료형
		//
		// System.out.println(num1);
		// System.out.println(n2);

		// 4개의 요소를 저장할 수 있는 벡터 객체 생성, 3개씩 증가.
		Vector<Integer> vec = new Vector(4, 3);
		System.out.println("벡터의 크기는 " + vec.size());// 벡터에 저장된
		System.out.println("벡터의 용량은 " + vec.capacity());// 벡터의 용량을
		
		for(int i = 0; i < 5; i++)
			vec.add(i*10);
		System.out.println("벡터의 크기는 " + vec.size());
		System.out.println("벡터의 용량은 " + vec.capacity());
		System.out.println("첫 번째 요소는 " + vec.firstElement());
		System.out.println("두 번째 요소는 " + vec.get(1));
		System.out.println("마지막 요소는 " + vec.lastElement());
		
		for(int i = 0; i < vec.size(); i++){
			System.out.print(" " + vec.get(i) + " ");
		}

	}
}