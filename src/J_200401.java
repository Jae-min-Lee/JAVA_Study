public class J_200401 {

	public static void main(String[] args) {
		
		int aa=100, bb=200, cc=10, dd=20, xx, yy, sumsum, hap;

		aa++; // 100(101)
		System.out.println("aa++ : " + aa);

		--cc; // 10(9)
		System.out.println("--cc : " + cc);

		xx = (aa++) + cc; // 101(102) + 9 = 110
		System.out.println("xx : " + xx);

		dd++; // 20(21)
		System.out.println("dd++ : " + dd);

		sumsum = cc + aa++; // 9 + 102(103) = 111
		System.out.println("sumsum : " + sumsum);

		hap = bb++ - aa + cc; // 200(201) - 103 + 9 = 106
		System.out.println("hap : " + hap);

		yy = sumsum + hap; // 111 + 106 = 217
		System.out.println("yy : " + yy);
	}
}
