package source30;

/* PreparedStatement 인터페이스
1. Statement의  자식 인터페이스 (Statement 클래스의 기능 향상)
2. SQL문을 미리 만들어 두고 사용할 수 있기 때문에 효율성이나 유지 보수 면에서 유리함.
3. 인자와 관련된 작업이 특화(매개변수)
4. 코드 안정성 높음. 가독성 높음
5. 코드량이 증가 -> 매개변수를 set 해줘야 하기 때문임. */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

class MyStudentDB8{
	Connection con = null;
	PreparedStatement pstmt = null;
	
	public MyStudentDB8() throws SQLException {
		try { 
			// 1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl"; 
			// 2.db접속
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("db 접속 성공!!!!");
			// PreparedStatement prepareStatement(String sql)
			// throws SQLException
			// PreparedStatement 객체에 저장될 sql구문은 변수가 들어갈 위치에 ?를 넣는다
			String sql = "delete from student where num=?";
			// 3.sql명령을 실행하기 위한 객체 얻어오기
			pstmt = con.prepareStatement(sql);			
			// 4. 원하는 작업하기
			// 1번째 ?표의 num 2를 삭제함
			pstmt.setInt(1,  2);
			int n = pstmt.executeUpdate();
			System.out.println(n + "개 데이터가 삭제 되었습니다.");
		} catch(ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally { // 5. db접속해제
				try {					
					if(pstmt != null)
						pstmt.close();
					if(con != null)
						con.close();
				} catch(SQLException se) {
					System.out.println(se.getMessage());
				}
		}
	}
}
public class Test05 {
	public static void main(String[] args) throws SQLException {
					new MyStudentDB8();
	}
}

/* 결과 확인 : 지금 소스를 실행하고, 앞서 Test02 소스 실행해서 DB select문 적용 결과를 확인함. 또는 cmd창 - sqlplus scott/Test1234 - select * from student; 확인함.
db 접속 성공!!!!
1개 데이터가 삭제 되었습니다.
*/