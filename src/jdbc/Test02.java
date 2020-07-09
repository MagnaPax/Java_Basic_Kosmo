package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class MyStudentDB2 {
	public MyStudentDB2() throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
			// 2.db접속
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("db 접속 성공!!!!");
			// 3.sql명령을 실행하기 위한 객체 얻어오기
			stmt = con.createStatement();
			// 4. 원하는 작업하기
			String sql = "select num, name, phone, addr from student";
			rs = stmt.executeQuery(sql);
			// rs.next(); ==> 다음행으로 이동 다음행이 없으면 false 리턴
			while (rs.next()) {
				// 현재행의 num컬럼값 얻어오기
				int num = rs.getInt("num");
				// 현재행의 name컬럼값 얻어오기
				String name = rs.getString("name");
				// 현재행의 phone컬럼값 얻어오기
				String phone = rs.getNString("phone");
				// 현재행의 addr컬럼값 얻어오기
				String addr = rs.getNString("addr");
				System.out.println("번호 = " + num + ", 이름 = " + name + ", 전화번호 = " + phone + ", 주소 = " + addr);
			}
		} catch (ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally { // 5. db접속해제
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
	}
}

public class Test02 {
	public static void main(String[] args) throws SQLException {
		new MyStudentDB2();
	}
}