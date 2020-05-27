package Assignment_200421;

public class Assignment_200421_01 {

	/*
	 * <과제1> 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
	 */

	public static void main(String[] args) {
		
		int i, j;
		
		int num1 = 0, num2 = 0, num3 = 0;
		
		int arr[][] = new int[5][5];
		
		for (i = 0; i < arr.length; i++) {
			
			if (i < 3) {
				
				num2 = i;
				num3 = 4 - i;
				
			} else {
				num2 = 4 - i;
				num3 = i;
				
			}
			
			for (j = num2; j <= num3; j++) {
				
				num1++;
				arr[i][j] = num1;
				
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