package FileIo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/*
 * URL클래스를 이용하여 홈페이지의 내용을 출력하는 프로그램을 작성합니다.
 * 예> www.naver.com
 * 
 */
public class FileSample7 {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://www.daum.com");
		
		try {
			Scanner sc = new Scanner(url.openStream());
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch (IOException e) {
			System.out.println("URL이 잘못되었습니다.");
		}

	}

}
