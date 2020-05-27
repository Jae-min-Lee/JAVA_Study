package FileIo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 파일에서 읽어온 내용을 화면에 출력하기
 * file : me.txt
 */
public class FileSample3 {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader rd = null;

		int x = 0;
		rd = new FileReader("d://FileIO//me.txt");

		while (true) {
			try {
				x = rd.read();// 파일에서 2바이트 읽기
				if (x == -1)
					break;
				System.out.print((char) x);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (rd == null)
					try {
						rd.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}
	}
}