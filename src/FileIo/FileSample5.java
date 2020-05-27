package FileIo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 키보드로부터 파일에 데이터를 입력하고, stop이라는 문자를 만나면 중지합니다.
 * 입력한 내용의 글자수를 카운트하여 출력하세요.
 * 파일명 : FileWriter.txt
 * 
 */
public class FileSample5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		FileWriter fw = new FileWriter("D://FileIO//FileWriter.txt");
		
		System.out.println("문장을 입력 하세요. 만약에 stop을 만나면 중지합니다.");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		int str;
		
		int count = 0;
		
		while((str = br.read())!= -1){
			if(str == 'X' || str == 'x')
				break;
			else{
			count++;
			bw.write(str);//파일에 쓰기
			bw.newLine();
			bw.flush();
			}
		}
		System.out.println("글자수 : " + + count);
	}
}