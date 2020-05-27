package Array2;

/*
 * printf() :
 * decimal point : 십진수 (숫자) (ex - %5d)
 * System.out.printf("%5d",arr[i][j]);
 * %c : 영문자(대/소) 한글자출력
 * %s : 문자열 출력
 * %f : 부동 소수점출력, 단정도 실수형
 * %lf : 배정도 실수형 출력
 * %e : 지수승 출력
 */
public class Array2Sample3_printf {
	
	public static void main(String[] args) {
		
		char a = 's';
		String b = "abcdefg";
		float c = 34.56789f;
		int f = 12300;
		double d = 123456789456123456789456.123456789456123456789456123;
		System.out.printf("%c \n", a);
		System.out.printf("%s \n", b);
		System.out.printf("%d \n", f);
		System.out.printf("%f \n", c);
		System.out.printf("%e", d);

	}
}
