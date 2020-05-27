package FileIo;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * 화면으로 데이터를 문자로 출력하기 (2바이트)
 * 
 */
public class FileSample2 {

	public static void main(String[] args) throws IOException {

		Writer wr = new OutputStreamWriter(System.out);
		char ch[] = {'a', 'b', 'c', 'd'};
		
		wr.write(ch);
		String str = "안녕하세요.";
		wr.write(str);
		wr.close();
	}
}
