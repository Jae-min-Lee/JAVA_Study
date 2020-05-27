package Exam1;

//소문자 a에서 z까지 출력하는 프로그램을 do while을 이용하여 프로그램 하세요.
//생각> 반복문, 아스키코드, char, System.out.println();

public class Exam1_9 {

	public static void main(String[] args) {
		char str = 'a';

		do {

			System.out.println("dowhile 문 : " + str + " ");

			str = (char) (str + 1);

		} while (str <= 'z');

		char str2 = 'a';
		for (int i = 0; i <= 25; i++) {

			System.out.println("for 문 : " + str2 + " ");
			str2 = (char) (str2 + 1);

		}

		char str3 = 'a';
		while (str3 <= 'z') {

			System.out.println("while 문 : " + str3 + " ");

			str3 = (char) (str3 + 1);

		}

	}

}
