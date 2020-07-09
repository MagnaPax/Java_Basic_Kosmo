package source30;

/* <<트랜잭션>>
 * -분리되어서는 안되는 일련의 작업단위
 * -예)여행패키지 저장(항공권 예약,호텔예약,렌트카예약이 연속적으로 수행되어야할때)
 *    예금인출
 * -트랜잭션 처리는 Connection을 통해서 진행됨.
 * 	con.setAutoCommit(false);
 *  ....
 *  con.commit();
 *  con.rollback();
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

class MyStudentDB11{
	Connection con = null;
	Statement stmt = null;
	
	public MyStudentDB11() throws SQLException {
		try { 
			// 1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl"; 
			// 2. DB접속(Connection 획득)
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("db 접속 성공!!!!");
			
			con.setAutoCommit(false); // 연결에 자동 커밋 모드를 사용하려면 true, 사용하지 않으려면 false
			stmt = con.createStatement();

			String sql1 = "insert into student values(205, '이하늬', '010-4321-5643', '대구시')";
			String sql2 = "insert into student values(206, '김진영', '010-3231-6543', '서울시')";
			String sql3 = "insert into student values(207, '함상훈', '010-4231-5353', '서울시')";
			
			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);
			stmt.executeUpdate(sql3);
			
			con.commit();
				System.out.println("데이터 추가 성공!!!");
		} catch(ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
			try {
				con.rollback();
			} catch(SQLException see) {
				System.out.println(see.getMessage());
			}
		}
	}
}
public class Test08 {
	public static void main(String[] args) throws SQLException {
					new MyStudentDB11();
	}
}

/* 결과 확인 : 지금 소스를 실행하고, 앞서 Test02 소스 실행해서 DB select문 적용 결과를 확인함. 또는 cmd창 - sqlplus scott/Test1234 - select * from student; 확인함.
db 접속 성공!!!!
데이터 추가 성공!!!
*/