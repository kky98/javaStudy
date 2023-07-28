package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.IllegalFormatCodePointException;

public class JdbcDelete {
	
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null; 
		// 1.드라이버 로딩 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("등록 실패");
			System.exit(0); // 프로그램 종료 
		}
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 
		String db_id = "java";
		String db_pw = "oracle";
		try {
			connection = DriverManager.getConnection(url, db_id, db_pw);
			System.out.println("커넥션 성공");
			
			StringBuffer query = new StringBuffer();
			query.append(" DELETE tb_user");
			query.append(" WHERE user_id=?");
			ps = connection.prepareStatement(query.toString());
			int idx = 1;
			ps.setString(idx++, "lee001");
			int cnt = ps.executeUpdate(); // 쿼리문실행 cnt <--insert 건수리턴
			if(cnt > 0) {
				System.out.println(cnt + "삭제 되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("커넥션 오류 계정정보를 확인하세요");
		} finally {
			// connection객체를 꼭 닫아야함.
			// 안닫으면 계속 쌓여서 에러 발생
			if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {e.printStackTrace();}}
			if(connection != null) {try {connection.close();} catch (SQLException e) {e.printStackTrace();}}
		}
 	}
}
