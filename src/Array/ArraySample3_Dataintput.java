package Array;

/*
 * 다음과 같은 데이터가 존재합니다.
 * 5,3,7,1,4,-2,9,15
 * 이 데이터를 저장하고, 음수가 나오면 프로그램을 종료. 
 */
public class ArraySample3_Dataintput {

	public static void main(String[] args) {
		int[] data = { 5, 3, 7, 1, 4, -2, 9, 15 };

		for (int i = 0; i < data.length; i++) {
			if (data[i] < 0) { // 음수이면
				continue;//break;
			}
			System.out.println(data[i]);// 양수출력
		}

	}

}
