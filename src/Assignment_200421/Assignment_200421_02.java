package Assignment_200421;

/* <과제2>
 *   1    0    0    0    0
 *   3    2    0    0    0
 *   6    5    4    0    0
 *  10    9    8    7    0
 *  15   14   13   12   11*/
public class Assignment_200421_02 {

	public static void main(String[] args) {

		int i,j;
		int arr[][] = new int[5][5];
		int num = 1;
//           0 = 0  0 < 5
//           1 = 1  1 < 5		
		for (i = 0; i < arr.length; i++) {
//			     0 = 0  0 >= 0
//                     -1 >= 0
//               1 = 1  1 >= 0
//                      0 >= 0			
			for (j = i; j >= 0; j--) {
//                  0  0     1
//                  1  1  =  2
//                  1  0  =  3				
				arr[i][j] = num;
//				 2
//               3				
				num++;

			}
		}
		
		for (i = 0; i < arr.length; i++) {

			for (j = 0; j < arr.length; j++) {

				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
	}
}