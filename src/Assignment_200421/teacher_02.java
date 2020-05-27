package Assignment_200421;

public class teacher_02 {

	public static void main(String[] args) {
		int Exam2[][] = new int[5][5];
		int num2 = 0;
		for (int i = 0; i < Exam2.length; i++) {

			for (int j = i; j >= 0; j--) {

				num2++;
				Exam2[i][j] = num2;
			}
		}
		for (int i = 0; i < Exam2.length; i++) {

			for (int j = 0; j < Exam2.length; j++) {
				System.out.printf("%5d", Exam2[i][j]);
			}
			System.out.println();
		}
	}
}
