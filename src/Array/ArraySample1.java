package Array;

/*
 * 배열(Array)이란 ?
 * 1. 같은 데이터형의 집합
 * 2. 한번 크기가 선언되면 변하지 않는 정적데이터
 * 3. 많은 양의 데이터를 처리하기 위하여 사용
 * 4. 1차원 [] : 점의 세계, ...........바이러스 및 세균, 간단하고 단순한 데이터 취급(성격이하나)
 * 5. 2차원 [][] : 선의 세계, 동물, 곤충, 복잡한 형태의 데이터(다양한 성격형태의 데이터)
 * 6. 3차원 [][][] : 면의 세계, 사람, 더복잡한 형태의 데이터
 * 7. 하나의 이름으로 하나의 데이터 형식을 가지고 여러개의 데이터를 저장할 수 있는 기억공간.
 * 
 * 1차원 배열 : 행과 열이 같습니다. , 수평적으로 처리
 * 2차원 배열 : 
 */

public class ArraySample1 {

	public static void main(String[] args) {
		try {

			// 정수형 1차원 배열 선언

			int arr[] = new int[5];// n-1 : 자바는 0부터 카운트

			arr[0] = 10;// arr 배열의 첫번째 구성요소
			arr[1] = 20;// arr 배열의 두번째 구성요소
			arr[2] = 30;// arr 배열의 세번째 구성요소
			arr[3] = 40;// arr 배열의 네번째 구성요소
			arr[4] = 50;// arr 배열의 다섯번째 구성요소

			// 1. 데이터 출력
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);
			System.out.println("-----------------------------------");
			// 2. 데이터 출력 i < 5
			for (int i = 0; i < arr.length; i++) {
				System.out.println(i + 1 + " : " + arr[i]);
			}
			System.out.println("-----------------------------------");
			// 3. 데이터 출력 : 가변 for문이나 확장 for문

			int sum = 0;

			for (int s : arr) {
				sum += s;
			}
			System.out.println(sum);
		} catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("배열 인덱스오 ㅏ관련된 오류가 발생하였습니다.");
		}

	}
}
