package JDBC2_200507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Oracle_CRUD2 extends JDBC_Select01{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// 이미 정해진 라이브러리 클래스들
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	String msg1 = "데이터 입력이 잘못되었습니다. 다시 입력해 주시기 바랍니다.";
	String msg2 = "데이터 저장이 잘못되었습니다. 다시 확인해 주시기 바랍니다.";
	static String msg3 = "데이터 입력 형태(Ex, int)가 잘못되었습니다. 다시 입력해 주시기 바랍니다.";
	String msg4 = "SQL(SQLException)구문이 잘못되었습니다. 다시 확인해 주시기 바랍니다.";
	String msg5 = "데이터 수정이 잘못되었습니다. 다시 입력해 주시기 바랍니다.";
	String msg6 = "해당객체를 닫는데 문제가 발생하였습니다. 확인 해주시기 바랍니다.";

	// 클래스변수
	private int no;
	private String name;
	private String email;
	private String tel;

	protected Connection DBconnection() {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "min";
		String password = "ezen1234";

		// 1. driver loading
		try {
			Class.forName(driver);
			System.out.println("드라이버의 연결이 성공했습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버의 연결이 실패했습니다.");
		}
		try {
			con = DriverManager.getConnection(url, id, password);
			System.out.println("DB연결이 성공했습니다.");
		} catch (SQLException e) {
			System.out.println("DB연결이 실패했습니다.");
		}
		return con;
	}
}