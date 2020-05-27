/*
 * 1.다음 증감 연산자의 결과를 예측해보고, 결과를 출력하세요.
int a=100, b=200, c=10, d=20, x, y, sum, hap;

aa++; // 100(101)

--cc;

xx = (aa++) + cc;

dd++;

sumsum = cc + aa++;

hap = bb++ - aa + cc;

yy = sumsum + hap;
 */
public class Assignment_200401 {

	public static void main(String[] args) {
		
		int aa=100, bb=200, cc=10, dd=20, xx, yy, sumsum, hap;

		aa++; // 100(101)
		System.out.println(aa++); //101(102)

		--cc; // 10(9)
		System.out.println(cc--); //9(8)

		xx = (aa++) + cc; // ((aa++) = 102(103)) + (cc = 8)
		                  // 102 + 8 = 110
		                  // xx = 110
		System.out.println(xx);

		dd++; // 20(21)
		System.out.println(dd);

		sumsum = cc + aa++; // (cc = 8) + (aa++ = 103(104))
		                    // 8 + 103 = 111
		                    // sum = 111
		System.out.println(sumsum);

		hap = bb++ - aa + cc; // (bb++ = 200(201)) - (aa = 104) + (cc = 8)
		                      // 200-104+8 = 104
		                      // hap = 104
		System.out.println(hap);

		yy = sumsum + hap; //(sumsum = 111) + (hap = 104)
		                   // 111 + 104 = 215
		                   // yy = 215
		System.out.println(yy);
	}
}