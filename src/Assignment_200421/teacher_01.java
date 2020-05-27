package Assignment_200421;

/*
 * 1. 숫자가 1씩 늘어난다.
 * 2. 모래시계 형태를 지닌다
 * 3. 3행을 중심으로 이분화 되었다.
 * 4. 윗부분은 행증가, 열감소 / 아랫부분은 행증가 열증가
 */
public class teacher_01 {

	public static void main(String[] args) {

		int Exam1[][] = new int[5][5];
		int num = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = i; j < 5 - i; j++) {

				num += 1;
				Exam1[i][j] = num;
			}
		}

		for (int i = 3; i < 5; i++) {

			for (int j = 4 - i; j < i + 1; j++) {
				num += 1;

				Exam1[i][j] = num;
			}
		}

		for (int i = 0; i < Exam1.length; i++) {

			for (int j = 0; j < Exam1.length; j++) {

				System.out.printf("%5d", Exam1[i][j]);
			}
			System.out.println();
		}
	}
}