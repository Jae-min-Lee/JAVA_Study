package FileIo;

import java.io.IOException;

/*
 * 입력 데이터가 9를 만나면 출력을 중지합니다.
 */
public class FileSample4 {

	public static void main(String[] args) {
		
		int x;
		
		
		try {
			System.out.println("출력할 데이터를 입력해 주세요.");
			while((x = System.in.read()-48)!= 9){//48은 아스키코드에서 0을 의미함.
				System.out.print((double)x);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
