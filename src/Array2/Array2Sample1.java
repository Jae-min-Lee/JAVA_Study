package Array2;
/*
 * 2차원 배열 : [][] : 1차원보다 좀 더 복잡한 형태의 데이터 구조를 지닌다.
 * 행(row) 과 열(column)로 구성
 * 
 */
public class Array2Sample1 {

	public static void main(String[] args) {
//		int arr2[][]; //배열선언
//		arr2 = new int [2][3]; //행과열 지정
//		   배열 선언                    행과열 지정
		int arr2[][] = new int [5][6];
		
		int len = arr2.length;
		
		System.out.println(len);//2, 행의수(행만 나타남) [0],[1]
		
		//행과 열을 출력
		int len2 = arr2[0].length;
		int len3 = arr2[1].length;
		int len4 = arr2[2].length;
		int len5 = len2 + len3 + len4;
		
		System.out.println(len5);//6
		System.out.println();
		
		
		//Sample 예제
		/*
		 * 2 2 2 2 2 
		 * 2 2 2 2 1
		 * 2 2 2 1 1 
		 * 2 2 1 1 1
		 * 2 1 1 1 1
		 * 
		 * 
		 * */
		
		int arr[][] = new int [5][5];
//           0,1,2,3,4,5 >    5		
		for(int i = 0; i < arr.length; i++){//2. row : 행증가
//               0,1,2,3,4,5    5			
			for(int j = 0; j < arr.length; j++){//1. column : 열증가 
//         0,1,2,3,4,5  <  5				
				if(i+j < 5){
					arr[i][j] = 2; 
		//arr[0][0] = 2 , //arr[0][1] = 2, //arr[0][2] = 2, //arr[0][3] = 2, //arr[0][4] = 2
		//arr[1][0] = 2 , //arr[1][1] = 2, //arr[1][2] = 2, //arr[1][3] = 2
	    //arr[2][0] = 2 , //arr[2][1] = 2, //arr[2][2] = 2
		//arr[3][0] = 2 , //arr[3][1] = 2
		//arr[4][0] = 2			
				}
				else{
					arr[i][j] = 1; 
					//arr[1][4] = 1
					//arr[2][3] = 1
					//arr[3][2] = 1
					//arr[4][1] = 1
				}
			}
		}
		//data output
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr.length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}