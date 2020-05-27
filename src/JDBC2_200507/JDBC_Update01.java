package JDBC2_200507;

import java.sql.*;
import java.io.*;

public class JDBC_Update01 extends JDBC_Delete01{
	
	protected void update(Connection conn) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;
		PreparedStatement pstmt = null;

		String sql;
		String name, email, tel;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "min", "ezen1234");

			// ---JDBC_Insert 추가된 내용-------
			// 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println(" customer3 테이블에 값 갱신하기 .....");
			System.out.print("어떤 분의 내용을 갱신할지 그분의 이름을 입력하세요: ");
			name = br.readLine(); // 테이블에 추가할 name 필드 값을 입력 받음
			System.out.print("변경할 이메일 입력: ");
			email = br.readLine(); // 테이블에 추가할 email 필드 값을 입력 받음
			System.out.print("변경할 전화번호 입력: ");
			tel = br.readLine(); // 테이블에 추가할 tel 필드 값을 입력 받음

			sql = "UPDATE customer SET email = ?, tel = ? where name = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, tel);
			pstmt.setString(3, name);
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