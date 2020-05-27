package condition;

import java.util.Scanner;

/*
 * 다음과 같이 주민등록번호가 존재합니다.
 * "123456-1234567"
 * 이 주민을 가지고 남성인지, 여성인지 판별하여 출력합니다.
 * Hint> 1900년대 : 1(남), 2(여)  2000년대 : 3,4
 * 1) if문
 * 2) switch-case문
 * */

public class condSample8_idnumber {

	public static void main(String[] args) {
		// 01234567
		// String ID = "123456-1234567";
//		String dd = "";
		// char gubun = ID.charAt(7);//"1"
		// if(gubun == '1'){
		// System.out.println("1900년대 남성입니다.");
		// }
		// else if(gubun == '3'){
		// System.out.println("2000년대 남성입니다.");
		// }
		// else if(gubun == '2'){
		// System.out.println("1900년대 여성입니다.");
		// }
		// else if(gubun == '4'){
		// System.out.println("2000년대 여성입니다.");
		// }
		//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("주민번호 입력(-포함) : ");
//
//		dd = sc.next();
//
//		char ID = dd.charAt(7);
//
//		if (ID == '1') {
//			System.out.println("1900년대 남성입니다.");
//		} else if (ID == '3') {
//			System.out.println("2000년대 남성입니다.");
//		} else if (ID == '2') {
//			System.out.println("1900년대 여성입니다.");
//		} else if (ID == '4') {
//			System.out.println("2000년대 여성입니다.");
//		}
//
//	}
//
//}

//문제 > 다음과 같은 문장에서 문자 o의 위치를 찾아서 출력하세요.
// "Character Position in sentence."

//		        String s = "Character Position in sentence.";
//		        char alpa[] = new char[26];
//		        int count[] = new int[26];
//		 
//		        for (int i = 0; i < alpa.length; i++) {
//		            alpa[i] = (char) (i + 97);  // 알파벳소문자 생성 
//		        }
//		 
//		        for (int i = 0; i < alpa.length; i++) {
//		            for (int j = 0; j < s.length(); j++) {
//		                if (alpa[i] == s.charAt(j)) {
//		                    count[i]++;
//		                }
//		            }
//		        }
//		        for (int i = 0; i < count.length; i++) {
//		            System.out.println(alpa[i] + "의 개수 : " + count[i]);
//		        }
//		    }
//		}
		String s = "Character Position in sentence.";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char o = s.charAt(i);

			if (o == 'o') {
				count++;
				System.out.println("position = " + i);
			}
		}
		System.out.println("position count = " + count);
	}
}