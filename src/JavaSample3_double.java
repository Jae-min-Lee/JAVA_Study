public class JavaSample3_double {

	public static void main(String[] args) {
		// 실수형 데이터 처리 : float(4), double(8)

		int x = 100;
		double y = 312.456;

		double sum = x + y;// int + double = double => 묵시적 형변환 (자동 형변환)
		System.out.println(sum);

		// byte < short < int < long < float < double

		// casting 변환 (강제적인 변환)

		int x2 = 123;
		double y2 = 456.123;

		int z = (int) (x2 + y2);// 123 + 456.123 => 123 + 456 = 579
		System.out.println(z);

	}

}
