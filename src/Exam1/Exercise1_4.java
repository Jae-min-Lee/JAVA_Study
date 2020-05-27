package Exam1;

//반복문의 동작원리 : 중첩(nested) 반복문

public class Exercise1_4 {

	public static void main(String[] args) {
//1.                    0 <=2
//15.                   1 <= 2
		for (int i = 0; i <= 7; i++) {

			
//2.                         0 <= 2
//6.                         1 <= 2
//10.                        2 <= 2	
//14.                        3 <= 2
//16.   2.~14.
			for (int j = 0; j <= 7; j++) {//5.  j => 0 => 1 9. => 2 13. => 3

				
//3.                0 == 0
//7.                0 == 1			
//11.				0 == 2
				if (i == j) {

					System.out.println(" i ==" + i + " j==" + j);//4. skip, nextdata, 다음데이터를 읽으세요.
				}
//8.
//12.				
				
			}
//j가 2보다 클때 빠져나와서 처음 반복문 for i문으로 돌아감.
		}
//i가 2보다 클 때 빠져나오는 곳
	}

}