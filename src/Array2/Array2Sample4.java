package Array2;
/*
 * <과제1>
 *    1   2   3   4   5
 *        6   7   8
 *            9
 *      10   11  12
 * 13   14   15   16   17
 * 
 * <과제2>
 *   1    0    0    0    0
 *   3    2    0    0    0
 *   6    5    4    0    0
 *  10    9    8    7    0
 *  15   14   13   12   11*/
public class Array2Sample4 {

	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (i + j < 5) {
					arr[i][j] = 2;
				} else {
					arr[i][j] = 1;

				}
			}
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
