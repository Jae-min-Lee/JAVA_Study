package methodtest;

import java.util.Scanner;

/*
 * 메소드 오버로딩을 이용하여 정사각형과 직사각형의 넓이를 구하여 출력하세요. 
 * AreaWidth()
 */
public class methodOverLoding4 {

	private static double heigh;
	private static double base;
	private static int num;

	private static void AreaWidth(double heigh, double base) {
		double Width = heigh * base;
		System.out.println("정사각형의 넓이 : " + Width);

	}

	private static void AreaWidth() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변 : ");
		base = sc.nextDouble();
		System.out.println("높이 : ");
		heigh = sc.nextDouble();
		double Width = base * heigh;
		System.out.println("직사각형의 넓이 : " + Width);

	}

	public static void main(String[] args) {
		try {
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("1. 정사각형, 2. 직사각형, 3. 종료 중 선택하세요.");
				num = sc.nextInt();
				switch (num) {
				case 1:
					try {
						System.out.println("밑변 : ");
						base = sc.nextDouble();
						System.out.println("높이 : ");
						heigh = sc.nextDouble();
						AreaWidth(heigh, base);
					} catch (java.util.InputMismatchException e) {
						// e.printStackTrace();
						System.out.println("입력데이터의 자료형이 다릅니다.");
					}
					break;
				case 2:
					try {
						AreaWidth();
					} catch (java.util.InputMismatchException e) {
						// e.printStackTrace();
						System.out.println("입력데이터의 자료형이 다릅니다.");
					}
					break;

				case 3:
					System.out.println("프로그램이 정상적으로 종료되었습니다.");
					System.exit(0);

				}
			}
		} catch (java.util.InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("입력데이터의 자료형이 다릅니다.");
		}
	}
}