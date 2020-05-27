package GenericCollection_T;

/* 제네릭(Generic)    JDK 5.x
	Vector  v = new Vector();

	Vector<String>  v = new Vector<String>();
	Vector<Integer>  v = new Vector<Integer>();
	Vector<Double>  v = new Vector<Double>();
	Vector<Double>  v = new Vector();

.제네릭: 데이터 처리의 능력을 향상 시키기 위하여 만들어진 틀.
  - 하나의 코드를 여러 타입에 대하여 재사용할 수 있는 기술입니다. type of T : <E>
  - 클래스에 사용할 타입을 클래스 디자인시에 지정하는 것이 아니라 클래스를 사용하는 시점에서 지정한 후 사용하는 기술 
  - 캐스팅이 필요한 곳에 별도의 형변환이 없이 캐스팅을 자동으로 넣어줍니다.
  - 자바에서의 제네릭은 클래스형이 아니라 캐스팅을 위한 표시입니다.
  
  
	//단점: 형 변환이 필요하므로 속도가 저하된다.
	public static void printArray(Object[] OArray) {
		for (Object element : OArray) {
			System.out.println(element);
		}
	}  
  
  //형변환의 개선(느려지는 시간을 방지)
			public static <T> void printArray(T[] TArray){			
				for(T element: TArray){
			
					System.out.println(element);		
				}
							  
.켈렉션: 향상시킨 클래스 또는 인터페이스 (list, set, map 구조) 
  List: 순서가 있고, 데이터의 중복은 허용합니다. 
       예)대기자 명단, ArrayList, LinkedList, Stack, Vector 등
  Set: 순서를 유지하지 않고, 데이터의 중복을 허용하지 않는다. 
       예) 양의 정수 집합, 소수의 집합, HashSet, TreeSet, sortedSet
  Map: Key와 value의 쌍으로 이루어진 데이터의 집합 
       예)로그인아이디와 비밀번호, 우편번호, 전화번호(지역번호)
       순서는 유지하지 않지만, 키는 중복을 허용하지 않으며, 값은 중복을 허용합니다.
       HashMap, TreeMap, HashTable, Properties 등
*/

class SimpleGeneric<T> {
	private T[] values;
	private int index;
	
	@SuppressWarnings("unchecked")
	SimpleGeneric(int len){
		values = (T[]) new Object[len];
		index = 0;
		
	}

	public void add(T...args) {   //가변배열타입
		for(T element: args)
			values[index++] = element;
	}
	
	public void print() {   //가변배열타입
		for(T element: values)
			System.out.println(element + " ");
	}
	
}


public class CollectionSample1_T {

	public static void main(String[] args) {
		SimpleGeneric<Integer> sg = new SimpleGeneric<Integer>(12);
		SimpleGeneric<Double> sg2 = new SimpleGeneric<Double>(10);
		SimpleGeneric<String> sg3 = new SimpleGeneric<String>(3);
		
		sg.add(100, 200, 300);
		sg.add(400, 500, 600);
		sg.print();
		
		sg2.add(10.0, 20.0, 30.0, 40.0, 50.0);
		sg2.print();
		
		sg3.add("홍길동", "세종대왕", "장길산");
		sg3.print();
		
		
	}

}
