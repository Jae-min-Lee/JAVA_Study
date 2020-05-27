public class JavaSample8_Exp {

	public static void main(String[] args) {

		// 지수승 : 정밀도는 높지만, 오차가 발생하는 단점.

		double x = 12.34e-1;
		double y = -1234.0e+3;
		double z = 333.14567e-3;
		double z2 = 333.14567e+3;

		System.out.println(x); // 1.234
		System.out.println(y); // -1234000.0
		System.out.println(z); // 0.33314567
		System.out.println(z2); // 333145.67

		// 10진수, 8진수, 16진수의 표현

		int x2 = 100; // 10진수
		int y2 = 0100; // 8진수
		int z3 = 0x100;// 16진수

		// 숫자 앞에 0가 붙으면 8진수, 0x 가붙으면 16진수

		System.out.println(x2);
		System.out.println(y2);
		System.out.println(z3);

		// 논리적 표현법
		/*
		 * x y and or not EXOR 
		 * ---------------------------------- 
		 * 0 0  0  0  0->1  0
		 * 0 1  0  1  1->0  1 
		 * 1 0  0  1        1   
		 * 1 1  1  1        0 
		 * ----------------------------------
		 */
		// 관계연산자
		int x5 = 100, y5 = 50;
		boolean result = false;
		// and

		//           f            f
		result = (x5 < y) && (y5 >= x);
		System.out.println(result);// false

		//           f           t
		result = (x5 < y) && (y5 < 300);
		System.out.println(result);// false

		//           t              f
		result = (x5 > y5) && (++y5 > 200);
		System.out.println(result);// false

		// or         t             f
		result = (x5 > y5) || (++y5 > 200);
		System.out.println(result);// true

		// or        f             t
		result = (x5 < y5) || (y5 < 300);
		System.out.println(result);// true

		// or         f           f
		result = (x5 < y5) || (y5 >= x5);
		System.out.println(result);// false
		
		// exor      t            t 
		result = (x5 > y5) ^ (y5 <= x5);
		System.out.println(result);// false
		
		//and(&&) : 두 개 항이 서로 참인 경우에만 참이 됩니다.
		//or(||) : 두 개 항이 서로 거짓인 경우에만 거짓이 됩니다.
		//not : 참은 거짓으로, 거짓은 참으로.
		//exor(^) : 두개 항이 서로 다른 경우에만 참이 됩니다.
		
		
		//복합대입 연산자 : +=, -=, *=, /=, %=
		//ex) int x = 200, y = 30, sum = 0;
		//=> sum += x;
		//=> sum += y;
		
		 int x6 = 200, y6 = 30, sum = 0, sum2 = 0;
		 sum += x6;
		 //sum = sum + x6;
		 System.out.println("X의 합 : " + sum);
		
		 sum = 0;
		 sum += y6;
		 //sum = sum + y6
		 System.out.println("Y의 합 : " + sum);
		 
		 sum=0;
		 sum *= x6;
		 System.out.println("곱셈의 값 : " + sum);
		 
		 sum = 0;
		 sum -= x6;
		 System.out.println("뺄셈의 값 : " + sum);
		 
		 sum = 0;
		 sum /= x6;
		 System.out.println("나눗셈의 값 : " + sum);
		 
		 sum = 10;
		 sum %= x6;
		 System.out.println("나눗셈의 값2 : " +sum);
		 
		 sum /= y6;
		 System.out.println("나눗셈의 합 : " + sum);// 2000/30
		 
		 //증감 연산자 : 1증가(++), 1감소(--)
		 //공식) 연산 후 대입 : 연산자(++)가 먼저 나오고 변수가 나왔을때, 
		      //대입 후 연산 : 변수가 먼저나오고 연산자(--)가 나왔을때.
		 
		 int x7 = 0, y7 = 10, z7 = 50, sum1, sum3;
		 
		 x7++;//대입 후 연산 x7 + 1 = 1
		 System.out.println(x7);// 1
		 
		 x7--;//대입 후 연산 x7 - 1 = 1 - 1 = 0
		 System.out.println(x7);//0
		 
		 ++x7;//연산 후 대입 
		 System.out.println(x7); //1
		 
		 sum1 = x7 + ++y7 - z7--;// (x7 = 1) + (y7 = 11) - z7(연산값은 50이고 49로 기억)
		 System.out.println(sum1);//-38
		 
		 sum3 = sum1++ - y7;//(sum1 = -38)=>(-37을기억) - (y7 = 11)
		 System.out.println(sum3);// -49
		 
		 z7--;//49(48로 기억)
		 System.out.println(z7);//48
		 
		 
		 //bitwise (bit연산자)
		 //전기, 전자공학 분야에서 활용
		 
		 int x8 = 20, y8 = 30;
		 int z8 = x8 & y8;
		 System.out.println("bit & : " + z8);//
		 
		 //   20          30
		 //00010100    00011100
		 //00011100
		 //---------------------
		 //00010100(20) -> and
		 //00011100(30) -> or
				 
		 int x9 = 20, y9 = 30;
		 int z9 = x9 | y9;//or
		 System.out.println("bit | : " + z9);//30
		 
		// left shift : *2
		// 20x2 = 40x2 = 80
		// left shift : *3
		// 20x2 = 40x2 = 80x2 = 160
		 
		 int x10 = 20 << 3; //160
		 System.out.println(x10);

		// right shift : /2
		// 40/2 = 20/2 = 10
		// right shift : /3
		// 40/2 = 20/2 = 10/2 = 5
		 
		 int y10 = 40 >> 3;
		 System.out.println(y10);//5
		 
		 //음수와 양수의 변환
		 //보수 : 부호화 절대값, 1의 보수, 2의 보수
		 //              20         -20       =     0
		 //부호와 절대값 : 00010100    00010100
		 //1의 보수 : (1->0, 0->0)   11101011
		 //2의 보수 : (1의보수 + 1)           +1
		 //                      ------------
		 //                       11101100 (-20)
		 //                       00010100 (+20)
		 //                      ----------------
		 //        1(캐리는 버려짐)   000000000 (0)
		 // ~연산
		 // ~(100) => 양수가 음수로 변하고 +1이 됨 => -101
		 // ~(-101) => 하나빼고 음수에서 양수로 바뀌면서 그냥 100이 됨
		 
		 int x11 = 100;
		 System.out.println(~x11);//-101
		 
		// char
		char abc = '가';
		String value = "가나다라";
		System.out.println(abc);
		System.out.println(value);

	}

}
