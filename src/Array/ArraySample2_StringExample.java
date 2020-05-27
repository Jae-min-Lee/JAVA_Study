package Array;

/*
 * 문자 배열 처리
 *  
 */
public class ArraySample2_StringExample {

	public static void main(String[] args) {
		try {

			String str[] = new String[5];
			str[0] = "홍길동";
			str[1] = "전우치";
			str[2] = "이순신";
			str[3] = "고선지";
			str[4] = "흑치상지";

			// 문자형 1차원 배열 선언

			// 1. 데이터 출력
			System.out.println(str[0]);
			System.out.println(str[1]);
			System.out.println(str[2]);
			System.out.println(str[3]);
			System.out.println(str[4]);
			System.out.println("1. -----------------------------------");

			// 1.5 데이터 출력
			int datalength = str.length;
			System.out.println("datalength 는 : " + datalength);
			System.out.println("2. -----------------------------------");

			// 2. 데이터 출력 i < 5
			for (int i = 0; i < str.length; i++) {
				System.out.println(i + 1 + " : " + str[i]);
			}
			System.out.println("3. -----------------------------------");
			// 3. 데이터 출력 : 가변 for문이나 확장 for문

			String sum = "";

			for (String s : str) {
				sum += s;
			}
			System.out.println("합계 : " + sum);
			System.out.println("4. -----------------------------------");

			// 4. 배열복사
			String data[] = new String[5];
			 data[0] = str[0];
			 data[1] = str[1];
			 data[2] = str[2];
			 data[3] = str[3];
			 data[4] = str[4];

			for (int i = 0; i < data.length; i++) {
				data[i] = str[i];
			}
			for (int i = 0; i < data.length; i++) {
				System.out.println("배열복사 : " + data[i]);
			}
			

			for (int i = 0; i < data.length; i++) {
				data[i] = str[i];
			}
			for (int i = 0; i < data.length; i++) {
				System.out.println("배열복사 : " + data[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println("배열 인덱스와 관련된 오류가 발생하였습니다.");
		}

	}

}