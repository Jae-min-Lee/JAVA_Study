/*
 * 과제2. http://www.bitcamp.co.kr 이라는 문자열이 존재합니다.
 * startsWith, endsWith 명령을 사용하여 참인지, 거짓인지를 판별하세요.
 *
 * */
package String_test;

public class J2 {

	public static void main(String[] args) {
		String web = "http://www.bitcamp.co.kr";
		System.out.println(web.startsWith("kr"));
		System.out.println(web.startsWith("http"));
		System.out.println(web.endsWith("http"));
		System.out.println(web.endsWith("kr"));

	}

}