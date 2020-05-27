package Exam1;

public class Exercise1_5 {

	public static void main(String[] args) {
		int i, j;
		
//1.                       1 <= 10
//8.                       2 <= 10	
//14.                      3 <= 10		
		for (j = 0, i = 1; i <= 10; i++) {
			
			
			j += i; //2. j= j+i
			//3. 1 => 9. 3 => 15. 6
			
			System.out.print(i); //4. 1 => 10. 2 => 16. 3
			
			
//5.    	    1 == 10 (x)
//11.           2 == 10 (x)			
//17.           3 == 10 (x)			
			if (i == 10) {
			
				System.out.print("=");
				
				System.out.print(j);
			} 
			
			else
				
//6.             
//12.		
//18.				
				System.out.print("+");
		}
//7. 1+	13. 2 + 19. 3
	}
	
}
