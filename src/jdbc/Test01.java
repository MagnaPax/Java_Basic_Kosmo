package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC 연동 
 * 1. 자바와 DBMS와 연동하여 작업을 하는 클래스들을 JDBC라 함
 * 2. JDBC의 동작 단계
 * 1)드라이버로딩
 * 	 Class.forName("oracle.jdbc.driver.OracleDriver");
 * 2)드라이버매니저를 이용하여 DB에 접속하고 Connection객체 얻어오기
 * 3)SQL명령어를 실행시키기위한 객체 생성(Statement,PreparedStatement,...)
 * 	Statement stmt=con.createStatement();
 * 
 * 4)원하는 작업하기(조회,추가,수정,삭제,...)
 * 	String aa="delete from student where num=6";
 * 	int n=stmt.executeUpdate(aa);
 * 5)DB접속해제하기 
 * stmt.close();
 * con.close();
 */
class MyStudentDB1 {
	public MyStudentDB1() throws SQLException {
		Connection con = null;
		Statement stmt = null;
		try {
			// 1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩성공");
			// public static Connection getConnection(String url,
			// String user,
			// String password)
			// throws SQLException
			// 2.드라이버매니저를 이용하여 db접속하고 Connection 객체 얻어오기
			// url="jdbc:oracle:thin:@서버주소:port번호:SID";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
			// getConnection("DB서버주소","사용자계정","비밀번호");
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("DB 접속성공!");
			// 3. SQL명령어를 실행시키기 위한 객체 생성
			stmt = con.createStatement();
			String aa = "insert into student values(101,'홍길동','010','서울')";
			// String aa = "delete from student where num=7";
			// 4.원하는 작업하기(조회,추가,수정,삭제,...)
			// sql명령어 실행 n에는 갱생된 행의 갯수가 저장
			int n = stmt.executeUpdate(aa);
			System.out.println(n + "개의 데이터가 추가되었습니다.");
			System.out.println("sql 명령어가 성공적으로 실행되었습니다.");

		} catch (ClassNotFoundException ce) {
			System.out.println("해당 클래스를 찾지 못했습니다.");
			System.out.println(ce.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally { // 5. DB접속 해제하기			
			try {
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

public class Test01 {
	public static void main(String[] args) throws SQLException {
		new MyStudentDB1();
	}
}