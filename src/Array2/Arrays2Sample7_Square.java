package Array2;

/*
 * 제곱승 : 2x2=4, 2x2x2=8
 *
 *   1   4    9   16   25
 *   0  36   49   64   81
 *   0   0  100  121  144
 *   0   0    0  169  196
 *   0   0    0    0  225
 * 
 */
public class Arrays2Sample7_Square {

	public static void main(String[] args) {

		int i,j;
		
		int num = 0;

		int arr[][] = new int[5][5];
//                  0 < 5
//                  1 < 5		
		for (i = 0; i < 5; i++) {
//               0 = 0  0 < 5
//                      1 < 5	
//                      2 < 5
//                      3 < 5
//                      4 < 5
//               1 = 1  1 < 5			
			for (j = i; j < 5; j++) {
//               0+1=1		
//               1+1=2
//               2+1=3
//               3+1=4
//				 4+1=5
//               5+1=6				
				num+=1;
//				arr[0][0] = 1*1
//              arr[0][1] = 2*2
//              arr[0][2] = 3*3
//				arr[0][3] = 4*4
//              arr[0][4] = 5*5
//				arr[1][0] = 0
//				arr[1][1] = 6*6						
				arr[i][j] = num*num;
			}
		}		
		for (i = 0; i < arr.length; i++) {

			for (j = 0; j < arr.length; j++) {

				//C언어 제공 자바 사용기능
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}

	}

}
