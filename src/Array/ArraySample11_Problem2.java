package Array;

import java.util.Scanner;

/* 
 * 2. 배열 복사 : A배열에 있는 데이터를 배열복사를 이용하여, B배열에 데이터를 넣어주세요.
 * A = {10, 20, 30, 40, 50}
 * B = {10, 20, 30, 40, 50}
 */
public class ArraySample11_Problem2 {

	public static void main(String[] args) {
		
//		    int A[] = new int[];
//		    int B[] = new int[];	
		    int i = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A 배열에 저장 할 데이터의 갯수를 입력해 주세요.");
		int count2 = sc.nextInt();// 
		int A[] = new int[count2];
		int B[] = new int[count2]; 
		
		System.out.println("정수형 데이터를" + count2 + "개 입력해 주세요.");
		
		for ( i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.println();

		B = A;//배열 복사
		
		for( i=0; i < B.length; i++){
			System.out.print("복사된 B 배열 : "+ B[i] + " "); 
		}
		System.out.println(B[i]);
		
		/* side effect(부작용)
		 * 하나의 메모리를 공유할 때, 예상치 못한 일이 벌어지는 경우나 현상.
		 */
		
		for( i=0; i < B.length; i++){
			B[i] +=100;//
			System.out.println("복사된 B 배열 : "+ B[i]); 
		}
		
		for( i=0; i < A.length; i++){
			System.out.println(A[i]);//원래 A 배열의 값이 없어지고 B배열의 값이 남음. 
		}
	}

}
