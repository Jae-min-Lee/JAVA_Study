package Array;

public class ArraySample8_Arraysub {

	public static void main(String[] args, int[] Num) {
		
		ArraySample8_Arraysort as = new ArraySample8_Arraysort();
		
		as.Ascending(Num);
		as.Descending(Num);
		as.Sum();
/*
 * 접근제한자의 개념 ?
 * private : 자신이 속한 클래스 이외에서는 동작하지 않습니다.
 * 생략 : 자신의 클래스와 연관된 클래스에서만 동작합니다.
 * protected : 상속개념이 동작하는 클래스에서 동작합니다.
 * public : 아무나 동작합니다.
 * 
 * = > 순서중요
 */		

	}

}
