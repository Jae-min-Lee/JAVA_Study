/*
 * 3.byte부터 double 자료형까지 최대값과 최소값의 범위를 출력하세요.
 */
public class Assignment_200401_03 {

	public static void main(String[] args) {
// byte 가장 작은 정수형 최소/최대값 상수
System.out.println("byte 가장 작은 정수형 최소/최대값 상수 : ");
System.out.println("최소값 : " + Byte.MIN_VALUE);
// -128

System.out.println("최대값 : " + Byte.MAX_VALUE);
// 127


// short 조금 작은 정수형 최소/최대값 상수
System.out.println("short 조금 작은 정수형 최소/최대값 상수 : ");
System.out.println("최소값 : " + Short.MIN_VALUE);
// -32768

System.out.println("최대값 : " + Short.MAX_VALUE);
// 32767


//int 보통 정수형 최소/최대값 상수
System.out.println("int 보통 정수형 최소/최대값 상수 : ");
System.out.println("최소값 : " + Integer.MIN_VALUE);
//-2147483648

System.out.println("최대값 : " + Integer.MAX_VALUE);
//2147483647


//long 긴 정수형 최소/최대값 상수
System.out.println("long 긴 정수형 최소/최대값 상수 : ");
System.out.println("최소값 : " + Long.MIN_VALUE);
//-9223372036854775808

System.out.println("최대값 : " + Long.MAX_VALUE);
//9223372036854775807


//float 작은 실수형 최소/최대값 상수
System.out.println("float 작은 실수형 최소/최대값 상수 : ");
System.out.println("최소값 : " + Float.MIN_VALUE);
//1.4E-45
System.out.println("최대값 : " + Float.MAX_VALUE);
//3.4028235E38


//dauble 큰 실수형 최소/최대값 상수
System.out.println("double 작은 실수형 최소/최대값 상수 : ");
System.out.println("최소값 : " + Double.MIN_VALUE);
//4.9E-324
System.out.println("최대값 : " + Double.MAX_VALUE);
//1.7976931348623157E308


//char 문자형 최소/최대값 상수
System.out.println("char 문자형 최소/최대값 상수 : ");
System.out.println("최소값 : " + (int) Character.MIN_VALUE );
// 0

System.out.println("최대값 : " + (int) Character.MAX_VALUE );
// 65535

	}

}
