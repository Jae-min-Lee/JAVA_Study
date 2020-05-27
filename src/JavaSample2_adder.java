public class JavaSample2_adder {

	public static void main(String[] args) {
		int addsum = 0, subsum = 0, multsum = 0, divsum = 0, divsumremain = 0;
		int i = 200, j = 12;
		
		//산술연산

		addsum = i + j;
		subsum = i - j;
		multsum = i * j;
		divsum = i / j;
		divsumremain = i % j;

		System.out.println("덧셈의 합은 : " + addsum);// 212
		System.out.println("뺄셈의 합은 : " + subsum);
		System.out.println("곱셈의 합은 : " + multsum);
		System.out.println("나눗셈의 합(mok) 은 : " + divsum);
		System.out.println("나눗셈의 합(remainder) 은 : " + divsumremain);

	}

}
/*
 * int(4) : datatype(자료형) => 정수형 데이터
 * byte(1) , short(2), long(8) => 정수형 데이터
 * 
 * 실수형 : float(4), double(8)
 * 
 * data -> variable -> memory -> pointer
 * 
 */