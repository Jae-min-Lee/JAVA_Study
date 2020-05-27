/*
 * 2.1과 2의 숫자를 대상으로 관계(비교) 연산자 6가지를 구현하여 결과를 출력하세요.
 */
public class Assignment_200401_02 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		boolean result = false;
		System.out.println("and : ");
		result = (x > y) && (x < y);//f && t
		System.out.println(result);//false
		result = (x < y) && (x < y);//t && t
		System.out.println(result);//true
		
		System.out.println("or : ");
		result = (x > y) || (x < y);//f || t
		System.out.println(result);//true
		result = (x > y) || (x > y);// f || f
		System.out.println(result);//false
		
		System.out.println("exor : ");
		result = (x > y) ^ (x < y);// f ^ t
		System.out.println(result);//true
		result = (x > y) ^ (x > y);// f ^ f
		System.out.println(result);//false
		

	}

}
