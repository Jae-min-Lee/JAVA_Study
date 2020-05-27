package String_test;

import java.util.StringTokenizer;

public class StringSample1_STokenizer {

	public static void main(String[] args) {
		// StringTokenizer() : 문자열 구분해 사용

		String str1 = "사과 배 복숭아 밤 대추 귤 바나나 파인애플";
		String str2 = "사과	배	복숭아	밤	대추	귤	바나나	파인애플";
		String str3 = "사과,배,복숭아,밤,대추,.귤,바나나,파인애플";
		String str4 = "사과=,배=,복숭아=,밤=,대추=,.귤=,바나나=,파인애플=";
		StringTokenizer st1 = new StringTokenizer(str1);
		StringTokenizer st2 = new StringTokenizer(str2);
		StringTokenizer st3 = new StringTokenizer(str3,",.");
		StringTokenizer st4 = new StringTokenizer(str3,",=.");
		
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());// space 경우에는 이것을 사용.
		}
		
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken()); //space, tab 경우에는 이것을 사용.
		}
		
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());//, . 의 경우
		}
		while (st4.hasMoreTokens()) {
			System.out.println(st4.nextToken());//, . 의 경우
		}


//print : 출력 후 정지
//println : 출력 후 줄바꿈
//printf : 출력 후 정지 (데이터에 따라서 출력 부호가 달라진다.)

String msg = "바보바보바보야";
char msg2 = 'a';
System.out.println("출력합니다2");
int a = 93, b = 88;
float sum = 0.0f;
sum = a + b;
System.out.printf("%5.3f \n", sum);
System.out.print("출력합니다1");

System.out.printf("%s \n",msg);

System.out.printf("%c \n", msg2);
	}

}
/*
 * 과제1. Hello.java라는 문자열이 존재합니다. 해당 파일의 이름이 Hello이고, 확장자는 java입니다. 라는
 * 내용을 화면에 출력하세요. 단, 문자열의 내용을 추출하여 실행하세요.
 * 
 * 과제2. http://www.bitcamp.co.kr 이라는 문자열이 존재합니다.
 * startWith, endWith 명령을 사용하여 참인지, 거짓인지를 판별하세요.
 * 
 * 과제3. 전도연, 김혜수, 전지현, 김태희, 서현진, 김수현 등의 데이터가 존재합니다.
 * 특수문자 하나를 데이터에 임의로 삽입하고, 저장합니다.
 * 그리고, 파싱을 하여 모두 몇개의 문자열인지 카운트하여 갯수를 출력하세요.
 * 그리고, 문자열을 차례대로 보여주세요.
 * 그리고, 우편번호 5자리(100-12)가 있습니다.
 * 우편번호 앞자리의 뒷자리를 구분하여 출력해주세요.
 * 
 * */
