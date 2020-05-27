package JDBC2_200507;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Oracle_Customer extends Oracle_CRUD2 {

	public static void main(String[] args) {

		while (true) {

			System.out.println("--- 회원관리 프로그램 메뉴(V0.7) ---");// (제목
			// 붙여줌)
			System.out.println("--- 1. 데이터 베이스 조회 ---");
			System.out.println("--- 2. 데이터 베이스 입력 ---");
			System.out.println("--- 3. 데이터 베이스 조정 ---");
			System.out.println("--- 4. 데이터 베이스 삭제 ---");
			System.out.println("--- 5. 프로그램 종료 ---");
			System.out.println("-----------------------------");

			Scanner sc = new Scanner(System.in);

			try {

				int menu = sc.nextInt();// menu input : 메뉴를 입력 받음

				Oracle_Customer oc = new Oracle_Customer();

				Connection con = oc.DBconnection();

				try {

					switch (menu) {

					case (1):
						oc.select(con);
						break;
					case (2):
						oc.insert(con);
						break;
					case (3):
						oc.update(con);
						break;
					case (4):
						oc.delete(con);
						break;
					case (5):
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
					default:
						System.out.println("메뉴를 다시 입력 해주세요.");
					}
				} catch (Exception e) {
					System.out.println("예기치 못한 오류가 발생하였습니다.");
				}

			} catch (InputMismatchException e) {
				System.out.println();
			}
		}
	}
}