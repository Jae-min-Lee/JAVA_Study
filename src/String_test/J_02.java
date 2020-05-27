/*
 * 과제1. Hello.java라는 문자열이 존재합니다. 해당 파일의 이름이 Hello이고, 확장자는 java입니다. 라는
 * 내용을 화면에 출력하세요. 단, 문자열의 내용을 추출하여 실행하세요.
 *
 */

package String_test;

public class J_02 {

	public static void main(String[] args) {
		String file = "Hello.java";

		String name = file.substring(0, 5);
		String type = file.substring(6, 10);
		System.out.println("해당 파일의 이름이 " + name + " 이고 확장자는 " + type + " 입니다.");

	}

}