package Assignment_200421;

public class another_01_01 {

	private static void arr1() {

		int arr[][] = new int[5][5];

		int a = 0;
		int b = 0;
		int c = 4;
//                      0 < 5
//                      1 < 5
//                      2 < 5
//                      3 < 5		
		for (int i = 0; i < arr.length; i++) {
//   		    0 <= 2
//              1 <= 2
//              2 <= 2
//              3 <= 2			
			if (i <= 2) {
//              b = 0
//              b = 1
//              b = 2				
				b = i;
//              4 = 4 - 0
//              3 = 4 - 1
//              2 = 4 - 2				
				c = 4 - i;
			} else {
//              1 = 4 - 3			
				b = 4 - i;
//              3 = 3				
				c = i;
			}
//                   0 = 0  0 <= 4
//                          1 <= 4
//                          2 <= 4
//                          3 <= 4
//                          4 <= 4
//                          5 <= 4
//                   1 = 1  1 <= 3
//                          2 <= 3
//                          3 <= 3
//			         2 = 2  2 <= 2
//                   1 = 1  1 <= 3			
			for (int j = b; j <= c; j++) {
//              1				
//              2
//              3
//              4
//				5
//              6
//              7
//              8
//              9
//              10				
				a++;
//                  0  0    1
//                  0  1    2
//                  0  2    3
//                  0  3    4
//                  0  4	5	
//                  1  1    6
//                  1  2    7
//                  1  3    8
//                  2  2    9	
//                  3  1    10				
				arr[i][j] = a;
			}
		}
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	private static void arr2() {

		int arr[][] = new int[5][5];

		int a = 1;
		int b = 1;
//                      0 < 5
		for (int i = 0; i < arr.length; i++) {
//                          0 < 0			
			for (int j = 0; j < arr[0].length; j++) {
//				    0    0 
				if (j == 0) {
//					    0  0    1
					arr[i][j] = a;
//                  3 = (1 + 0)+2               					
					a += i + 2;
//                  3으로 저장					
				} else if (j > i) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = arr[i][j - 1] - b;
				}
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		arr1();
		arr2();
	}
}