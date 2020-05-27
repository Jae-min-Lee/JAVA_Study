//split : 문자열을 구분하는 구분자를 사용하여 구별하는 역할을 하는 것.

package String_test;

public class StringSample1_split {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박수홍&박연수-김자바&이자바~최수종&이수종,김수종";

		String[] names = text.split("&|,|-|~");// names라는 1차원 배열

		for (String name : names) { // 가변적인 for문
			System.out.println(name);
		}
		// substring : 부분추출, (index, element : String 글자 하나하나(구성요소 ex]s e o u l
		// k o r e a))

		String text2 = "seoul korea";
		String text3 = "seoul korea";
		String text4 = "Seoul Korea";
		String txt5 = new String();
		System.out.println(text2);
		String txt = text2.substring(6, 9);// kor, / (인덱스, 인덱스-1) //변수저장 " 다른용도를
											// 의미.
		System.out.println(txt);// kor
		System.out.println(text2.substring(6, 9));// 출력확인 용도
		System.out.println(text2.substring(6));
		
		//주소(번지) = 포인터 주소 값을 비교해서 같은주소인지 아닌지를 확인하는것.

		System.out.println(text2.equals("seoul korea"));// true
		
		//비교
		System.out.println(text2.equals(text3));// true
		
		//비교
		System.out.println(text2.equals(text4));// false
		
		//객체의 주소 (포인터) : 클래스 또는 인터페이스
		System.out.println(txt5);
		
		StringSample1_split vvv = new StringSample1_split();
		System.out.println(vvv);
		
		//기본자료형 : int ~ byte, double........ 내용비교
		int a = 100;
		int b = 500;
		
		if (a == b){
			System.out.println("두 수는 같습니다.");
		}
		else if (a > b){
			System.out.println(a + "가 큽니다.");
		}
		else {
			System.out.println(b + "가 큽니다.");
		}
		
		//서로 다른 포인터의 번지를 가지게 됩니다.
		
		System.out.println(text2.equals("Seoul korea"));//false
		
		System.out.println(text2.length());//11
		
		text2.indexOf("kor");//6
		System.out.println(text2.indexOf("kor"));//6
		
		
		//문자열의 크기비교 : 사전식 배열 비교, 같으면 0이 출력됩니다.
		System.out.println(text2.compareTo("seoul Korea"));//32
		System.out.println(text2.compareTo("seoul korea"));//0
		
		//문자열 대체 or 교체
		text2 = "우 리 나 라 대 한 민 국";
		System.out.println(text2);//우 리 나 라 대 한 민 국
		text2 = text2.replaceAll("대 한 민 국", "大 韓 民 國");
		System.out.println(text2);//우 리 나 라 大 韓 民 國
		System.out.println(text2.replaceAll(" ", ""));
		
		//text2 = 30; //error
		text2 = "" + 300; //"300"
		System.out.println(text2);
		//int x = x + text2;//error
		int x = Integer.parseInt(text2); // parsing : 문자열을 숫자로 변환해줍니다.
		System.out.println(x);
		int y = 500;
		int sum = y + x;
		System.out.println(sum);
		
	}
}
