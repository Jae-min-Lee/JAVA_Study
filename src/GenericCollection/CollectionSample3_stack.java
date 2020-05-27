package GenericCollection;

import java.util.Stack;

/*
데이터를 효율적으로 사용하기 위해서 자료구조가 사용 된다.
자주 사용되는 자료구조로는 배열, 리스트, 스택, 큐, 해쉬테이블 등이 있다.
자바에서는 이러한 다양한 자료구조를 Collection 클래스로 제공하고 있다.

자바 컬렉션 클래스는 Collection 인터페이스로 부터 구현 된다.
- Collection 인터페이스의 주요 메서드

.int size(): 요소 갯수 반환
.boolean isEmpty(): 컬렉션이 비어있는가?
.boolean add(Object obj): 요소 추가 성공 했을시 true 리턴

.boolean remove(Object obj): 요소 삭제, 성공 하면 true 리턴
.boolean removeAll(Collention col): 요소 전체 삭제

.boolean contains(Object obl): 해당 객체가 컬렉션 클래스에 포함 되어 있으면 true 반환

.Iterator iterator(): Iterator 인터페이스 객체를 얻는다
.Object[] toArray(): 컬랙션에 들어있는 요소를 객체 배열로 반환

Collection 인터페이스는 크게 Set,List로 나뉘는데
 Set 은 순서가 없는 집합으로 중복을 허용하지 않는다.
 List 는 순서가 있는 집합으로 중복을 허용 한다.
 iterator 인터페이스는 HashSet 에 저장된 요소를 하나씩 얻어내어
 Collection 인터페이스에 제공하는 iterator() 메서드를 호출 하여
 Iterator 인터페이스 객체를 얻어낸다

.순서가 있는 켈렉션
 Vector : 스레드세이프 설계 완료(synchronized) => 속도가 느림.
 ArrayList : 스레드세이프 설계 x => 속도 빠름
 LinkedList : 링크(스레드)를 사용하여 연결 
 CopyOnWriteArrayList : ArrayList와 동일하나 컨텐츠를 복사해서 전달후 해당 List의 내용이 변경될것을
 	걱정할 필요가 없음. 멀티 스레드 환경에 적합.
 	
 Set
 HashSet : 속도가 아주 빠름.
 TreeSet : 정렬
 CopyOnWriteArraySet : 중복이 안됨.
 */

/*
 * Stack() 구현 : LIFO 방식 = > 제일먼저 들어간게 제일 나중에 나오고,나중에 들어간게 먼저나온다.
 *              (ex-연탄교체,옷갈아입기)
 * - push() : 입력 / pop() : 출력              
 *
 */
class Coin {

	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
public class CollectionSample3_stack {

	public static void main(String[] args) {
		Stack<Coin> coin = new Stack<Coin>();
		
		coin.push(new Coin(1000));
		coin.push(new Coin(3000));
		coin.push(new Coin(5000));
		
		while(!coin.isEmpty()){
			Coin coinBox = coin.pop();
			System.out.println("꺼내온 지폐 : " + coinBox.getValue() + "원");
		}
	}

}
