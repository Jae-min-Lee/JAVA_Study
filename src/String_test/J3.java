/*
 * 과제3. 전도연, 김혜수, 전지현, 김태희, 서현진, 김수현 등의 데이터가 존재합니다.
 * 특수문자 하나를 데이터에 임의로 삽입하고, 저장합니다.
 * 그리고, 모두 몇개의 문자열인지 카운트하여 갯수를 출력하세요.
 * 그리고, 문자열을 차례대로 보여주세요.
 * 그리고, 우편번호 5자리(100-12)가 있습니다.
 * 우편번호 앞자리의 뒷자리를 구분하여 출력해주세요.
 * 
 * */

package String_test;

import java.util.StringTokenizer;

public class J3 {

	public static void main(String[] args) {

		String names = "전도연,김혜수,전지현,-김태희,=서현진,/김수현?";

		StringTokenizer names1 = new StringTokenizer(names, ",=/?-");

		System.out.println("갯수 : " + names.length());

		System.out.print("문자열 : ");

		while (names1.hasMoreTokens()) {

			System.out.print(names1.nextToken());

		}

		String post = "100-12";

		String front = post.substring(0, 3);

		String back = post.substring(4, 6);

		System.out.println("\n" + "우편번호 앞자리는 : " + front + " 우편번호 뒷자리는 : "

		+ back);

	}

}
