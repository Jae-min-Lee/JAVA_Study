package FileIo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.crypto.Data;

/*
 * 성적을 입력 받아서 총점과 평균을 구하고 출력 합니다.
 * 
 */
public class FileSample8 {

	private static String data;
	private static int total;
	private static double aver;

	public static void main(String[] args) throws IOException {

		int score[] = new int[5];
		int count = 0;

		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			System.out.println((count + 1) + ". " + "시험 점수를 입력하세요.");

			data = br.readLine();// "100"
			score[count] = Integer.parseInt(data);
			count++;
		} while (count < 5);

		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		aver = total / count;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + aver);
	}
}