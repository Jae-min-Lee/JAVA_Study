package Lambda_Expression;

import java.util.Scanner;

/*
 * 람다식(Lambda Expression)
 * 메소드를 하나의 식으로 표현한 것 입니다.
 * 
 * 람다식 장점
 * 1. 코드를 간결하게 만들 수 있습니다. 
 * 2. 코드가 간결하고 식에 개발자의 의도가 명확히 드러나므로 가독성이 향상됩니다.
 * 3. 함수를 만드는 과정없이 한번에 처리할 수 있기에 코딩하는 시간이 줄어듭니다.
 * 4. 병렬프로그래밍이 용이합니다.
 * 
 * 람다식 단점
 * 1. 람다를 사용하면서 무명함수는 재사용이 불가능합니다.
 * 2. 디버깅이 다소 까다롭습니다.
 * 3. 람다를 남발하면 코드가 지저분해 질 수 있습니다.
 *    (비슷한 함수를 계속 중복생성할 가능성이 높음)
 * 4. 재귀로 만들경우에는 다소 부적합면이 있습니다.
 * 
 * 메소드
 * int min(int x, int y){
 * 
 *              return x < y ? x : y;
 * }
 * 람다 표현식
 * (x, y) -> x < y ? x : y;
 * 
 * 이러한 람다 표현식은 메소드의 매개변수로 전달 될 수도 있으며,
 * 메소드의 결과 값으로 반환 될 수도 있습니다.
 * 따라서 람다 표현식을 사용하면, 기존의 불필요한 코드를 줄여주고,
 * 작성된 코드의 가독 성을 높여 줍니다.
 * 
 * Java SE 8부터는 이러한 람다 표현식을 사용하여 자바 에서도 
 * 함수형 프로그래밍(C언어)을 할 수 있게 되었습니다.
 * 
 * 함수형 인터페이스(functional interface)
 * ----------------------------------------------------------------------------------
 * 람다 표현식을 사용할 때는 람다 표현식을 저장 하기 위한 
 * 참조 변수의 타입을 결정해야만 합니다.
 * 
 * 문법
 * ----------------------------------------------------------------------------------
 * 참조변수의 타입 참조변수의 이름 = 람다 표현식
 * 
 * 위의 문법처럼 람다 표현식을 하나의 변수에 대입할 때 사용하는 참조 변수의 타입을 
 * 함수형 인터페이스라 부릅니다.
 * 함수형 인터페이스는 추상클래스와는 달리
 * 단 하나의 추상 메소드만을 가져야 합니다.
 * 또한, 다음과 같은 어노테이션(annotation)을 사용하여 
 * 함수형 인터페이스임을 명시할 수 있습니다.
 * 
 * 문법
 * ----------------------------------------------------------------------------------
 * @Functional Interface
 * 
 * 위의 같은 어노테이션을 인터페이스의 선언 앞에 붙이면, 
 * 컴파일러는 해당 인터페이스를 함수형 인터페이스로 인식합니다.
 * 자바 컴파일러는 이렇게 명시된 함수형 인터페이스에 
 * 두 개 이상의 메소드가 선언되면 오류를 발생 시킵니다.
 */

//두수를 입력 받아서 작은 값을 구하여 출력하세요.
@FunctionalInterface
interface Calculator {
	public int min(int su1, int su2);
}
@FunctionalInterface
interface Calculator2 {
	public int max(int su3, int su4);
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두수를 입력 해주세요.");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		Calculator minNumber = (k, m) -> k < m ? k : m;//작은 값 찾기

		System.out.println(minNumber.min(su1, su2));
		
		//두수를 입력 받아서 큰 값을 구하여 출력하세요.
		System.out.println("두수를 입력 해주세요.");
		int su3 = sc.nextInt();
		int su4 = sc.nextInt();
		
		Calculator2 maxNumber = (i, j) -> i > j ? i : j;//큰 값 찾기

		System.out.println(maxNumber.max(su3, su4));
		
	}
}