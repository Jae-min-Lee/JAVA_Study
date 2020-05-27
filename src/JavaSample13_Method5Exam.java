public class JavaSample13_Method5Exam {

	private static void sum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10의 합" + sum);
	}

	public static void main(String[] args) {
		// "Hello" 문자열을 출력하도록 메소드를 추출하세요.

		// i = 0, 1, 2, 3, 4
		// for (int i = 0; i < 5; i++) {
		// string();// 메소드 호출
		// 문제> 1 부터 10 까지의 합을 구하여 출력하세요.
		sum();
	}

}

//문제> 전달인자값을 사용하여 1부터 10까지의 숫자를 출력해보세요.
