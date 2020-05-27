package Exam1;

public class Exam1_7 {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i += 4) {// 시작 : 2단, 증가값에 의해 6단 부터 재시작
			System.out.println("\n" + i + " 단\t\t" + (i + 1) + " 단\t\t" + (i + 2)
					+ " 단\t\t" + (i + 3) + " 단\t\t" + "\n");
			for (int j = 1; j < 10; j++) {

				for (int k = i; k < i + 4; k++) {// k : 2,3,4,5 단
													// k : 6,7,8,9 단
					System.out.print(k + " x " + j + " = " + k * j + "	");

				}
				System.out.println();
			}
		}
	}
}
