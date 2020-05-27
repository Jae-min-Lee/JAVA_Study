public class test_01 {
	/*
	 * <과제1>
	 *    1   2   3   4   5
	 *        6   7   8
	 *            9
	 *      10   11  12
	 * 13   14   15   16   17
	 */

	public static void main(String[] args) {

		int i, j;

		int num = 1;

		int arr[][] = new int[5][5];
//               0 0 < 5
		for (i = 0; i < 5; i++) {
			//   0 = 0 0 < 5
			//         1 < 5
			for (j = 0; j < 5; j++) {

			// arr[0][0] = 1
	       	// arr[0][1] = 1
				arr[i][j] = num+j;
			}
			for (i = 1; i < 5; i++) {
				//   1 = 1  2 < 5
				for (j = i; j < 4; j++) {

				// arr[0][0] = 1
		       	// arr[1][1] = 6
			    // arr[1][2] = 7
				// arr[1][3] = 8
				// arr[1][4] = 0	
					arr[i][j] = 5+j;
				}
				for (i = 2; i < 5; i++) {
					//   0 = 0 0 < 5
					//         1 < 5
					for (j = i; j < 3; j++) {

					// arr[0][0] = 1
			       	// arr[0][1] = 1
						arr[i][j] = 7+j;
					}
			}
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
