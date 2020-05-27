package Exam1;

//import java.lang.*; <=생략됬지만 항상 있다는걸 기억!

import java.text.DecimalFormat;

public class Exercise1_1 {

	public static void main(String[] args) {
		java.lang.String su = "2000000";
		
		int su2 = 2500;
		//문자 > 숫자
		//byte < short < int < long < float < double < char < String
		String sum = su + su2; //문자 + 숫자 = 문자
		
		System.out.println(sum);
		
		float isu = Float.parseFloat(su);// parsing : 문자열를 숫자형태로 변환한다.
		java.lang.System.out.println(isu);

		DecimalFormat df = new DecimalFormat("#,##0");//빈자리는 0으로 채워줘라.
		String str = df.format(isu);
		System.out.println("\\ " + str);
	}
}