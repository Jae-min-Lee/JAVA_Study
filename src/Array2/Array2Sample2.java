package Array2;

/*
 * 2   2   2   20
 * 2   2  15    2
 * 2  10   2    2
 * 5   2   2    2
 * 
 */
public class Array2Sample2 {

	public static void main(String[] args) {

		int arr[][] = new int[4][4];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (i + j == 3) {
					arr[i][j] = 5*(4-i);
					//arr[0][0] = 2 , //arr[0][1] = 2, //arr[0][2] = 2, //arr[0][3] = 20
					//arr[1][0] = 2 , //arr[1][1] = 2, //arr[1][2] = 15,//arr[1][3] = 2
				    //arr[2][0] = 2 , //arr[2][1] = 10,//arr[2][2] = 2  //arr[3][1] = 2
					//arr[3][0] = 5 , //arr[3][1] = 2  //arr[3][1] = 2	//arr[3][1] = 2
				} 
				else {
					arr[i][j] = 2;
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
