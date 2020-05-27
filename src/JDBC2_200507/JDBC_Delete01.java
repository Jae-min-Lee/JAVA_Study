package JDBC2_200507;

import java.sql.*;
import java.io.*; // 도스 콘솔 창에서 사용자 입력을 받아들이기 위해 BufferedReader 

public class JDBC_Delete01 {

	protected void delete(Connection conn) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;
		PreparedStatement pstmt = null;
		String sql;
		String name, email, tel;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "min", "ezen1234");

			// ---JDBC_Delete 변경된 내용-------
			// 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println(" customer 테이블에서 레코드 삭제하기 .....");
			System.out.print("어떤 분의 내용을 삭제할지 그분의 이름을 입력하세요: ");
			name = br.readLine(); // 테이블에서 삭제할 name 필드 값을 입력 받음

			// DELETE 쿼리문을 작성
			sql = "DELETE FROM customer WHERE name = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}