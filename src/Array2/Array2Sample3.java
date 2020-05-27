package Array2;

/*
 * 1   -1    1   -1    1
 * 0   -1    1   -1    1
 * 0    0   -1    1   -1
 * 0    0    0    1   -1
 * 0    0    0    0    1
 * 0은 값이없어서 채워지는 수
 * 문자였으면 null값으로 채워짐.    
 */
public class Array2Sample3 {

	public static void main(String[] args) {
		int sum = 1;
		int arr[][] = new int[5][5];
//                     0,1  <  5
		for (int i = 0; i < arr.length; i++) {
//                    0=0    0 < 5
//                    1=1	 1 < 5 		
			for (int j = i; j < arr.length; j++) {
//                  [0][0] = 1
//                  [0][1] = -1	
//                  [0][2] = 1.....
				
//                  [1][1]				
				arr[i][j] = sum;
//                  -1 = 1 * (-1)
//                  1 = -1 * (-1)
//                  -1 = 1 * (-1)				
				sum *= (-1);
			}
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				//C언어 제공 자바 사용기능
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
	}
}


