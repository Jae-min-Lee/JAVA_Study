package AbstractSample;

public class SUM {

	static int sum = 0;

	public static void operation1() {

		for (int i = 0; i <= 100; i++) {

			sum += i;

		}
		System.out.println("1 ~ 100까지의 합 : " + sum);
	}
}
