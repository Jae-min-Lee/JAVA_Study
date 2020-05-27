package Exam1;

//32차이
//toUpperCase()
//toLowerCase()
//더 짧고 간단하게 만들어보자.
//read메소드를 이용해서!
import java.util.Scanner;

public class Exam1_12_3 {

	public static void main(String[] args) {
		String input = "";
		String output = "";
		int code;
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요. : ");
		input = sc.next();

		for (int i = 0; i < input.length(); i++) {
			code = (int) input.charAt(i);
			if ((65 <= code) && (90 >= code)) {
				output += (char) (code + 32);
			} else if ((97 <= code) && (122 >= code)) {
				output += (char) (code - 32);
			} else
				output += (char) code;
		}
		System.out.println("변환된 문자 : " + output);
	}

}
