package JDBCSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Oracle_CRUD {
//Field Area : 클래스변수, 클래스 메소드, 생성자, 클래스 오브젝트 등등.....
	//처음부터 전체영역이 필드영역 이기 때문에 static을 안붙여도 상관이없음
	//msg3는 다른클래스로 넘어가기때문에 필요함
	BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	// 이미 정해진 라이브러리 클래스들
	Connection conn = null;
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
	private String address;//여기까지 전부 클래스 변수들

	// 데이터 베이스 연결 정보 준비 작업
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
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("DB연결이 성공했습니다.");
		} catch (SQLException e) {
			System.out.println("DB연결이 실패했습니다.");
		}
		return conn;
	}

	// 2. 데이터 조회
	protected void select(Connection conn) throws SQLException {
		String sql = "select * from member";
		try {
			pstmt = conn.prepareStatement(sql);
			System.out.println("데이터 조회를 성공했습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 조회를 실패했습니다.");
		}
		try {
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 실제적인 조회하에 데이터 출력
		System.out
				.println("======================================================");
		System.out.println("번호\t이름\t\t전자우편\t\t전화번호\t주소");
		System.out
				.println("======================================================");
		;
		while (rs.next()) {
			no = rs.getInt("no");// (1)
			name = rs.getString("name");
			email = rs.getString("email");
			tel = rs.getString("tel");
			address = rs.getString("address");

			System.out.println(no + "\t" + name + "\t" + email + "\t" + tel
					+ "\t" + address);
		}
		System.out
				.println("======================================================");
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			System.out.println(msg6.toString());
		}
	}

	// 3. 데이터 입력
	protected void insert(Connection conn) {

		// 입력화면 설계 구현
		try {

			System.out
					.println("================ member 테이블 데이터 입력하기 ===============");
			System.out
					.println("======================================================");
			System.out
					.println("==================== 번호를 입력해 주세요. ==================");
			no = Integer.parseInt(br.readLine());// 박싱 언박싱 : int => 정수형 데이터
			System.out
					.println("==================== 이름을 입력해 주세요. ==================");
			name = br.readLine();
			System.out
					.println("==================== 메일를 입력해 주세요. ==================");
			email = br.readLine();
			System.out
					.println("================== 전화 번호를 입력해 주세요. =================");
			tel = br.readLine();
			System.out
					.println("==================== 주소를 입력해 주세요. ==================");
			address = br.readLine();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(msg1.toString());// 매우 중요함
		}

		// 입력 설계 구현(DB에 데이터 넣기)
		String sql = "insert into member(seq, no, name, email, tel, address)"
				+ "values(member_seq.nextVal, ?, ?, ?, ?, ?)";// 프리페어드 방식

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, tel);
			pstmt.setString(5, address);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(msg2.toString());
		}
		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(msg6.toString());
		}
	}

	// 4. 데이터 수정
	protected void update(Connection conn) {

		// 수정화면 설계 구현
		try {

			System.out
					.println("============= member 테이블 번호를 이용한 수정하기 =============");
			System.out
					.println("======================================================");
			System.out
					.println("================ 수정할 번호를 입력해 주세요. =================");
			no = Integer.parseInt(br.readLine());
			System.out
			.println("================ 수정할 메일을 입력해 주세요. =================");
			email = br.readLine();
			System.out
			.println("=============== 수정할 전화번호를 입력해 주세요. ================");
			tel = br.readLine();
			System.out
			.println("================ 수정할 주소을 입력해 주세요. =================");
			address = br.readLine();
		} catch (Exception e) {
			System.out.println(msg1.toString());
		}
		String sql = "update member set email = ?, tel = ?, address = ?"
				+ "where no = ?";// 업데이트 해라, 네임,이메일,텔, 어드레스를, no 기준으로.

		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, email);			
			pstmt.setString(2, tel);			
			pstmt.setString(3, address);
			pstmt.setInt(4, no);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(msg5.toString());
		}
		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(msg6.toString());
		}
	}

	// 5. 데이터 삭제
	protected void delete(Connection conn) {

		// 삭제화면 설계 구현
		try {

			System.out
					.println("============= member 테이블 번호를 이용한 삭제하기 =============");
			System.out
					.println("======================================================");
			System.out
					.println("================ 삭제할 번호를 입력해 주세요. =================");
			no = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println(msg1.toString());
		}
		String sql = "delete from member where no = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			System.out
					.println("==================== 삭제되었습니다. =====================");
		} catch (SQLException e) {
			System.out.println(msg4.toString());
		}
		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(msg6.toString());
		}
	}
}