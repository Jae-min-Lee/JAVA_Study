package Exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1) 이름과 나이를 입력하여 그대로 출력하는 프로그램을 작성하되, 
       나이와 이름을 메소드를 만들어 서 코드의 재 사용성이 돋보이도록 작성하세요.      
       예시] 입력 : 홍길동 300     출력 : 홍길동님의 나이는 300세입니다. 
 
2) 일반적인 가감승제산을 하는 프로그램을 작성하세요. 
 
3) 2)번을 메소드를 이용하여 가감승제산을 하는 프로그램을 작성하세요.    
       메소드 규칙 4가지 중에서 전달인자는 없고, 리턴값도 없는 형태로 코딩해주세요.  
 
4) 3)번을 전달인자는 있고, 리턴값은 없는 형태로 코딩해주세요.  
 
5) 4)번을 생성자 개념을 도입하여 프로그램 하세요. 
*/
public class Exam1_11_1 {

	public static void main(String[] args) {
		
		String name = null;
		int age = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		try {
			name = br.readLine();//한줄 (80컬럼)을 모두 문자열로 처리해서 읽으세요.
			age = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(name);	
		System.out.println(age);
	}
}
