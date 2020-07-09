package source30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class MyStudentDB6{
	Connection con = null;
	Statement stmt = null;
	Scanner scan = new Scanner(System.in);
	
	public MyStudentDB6() throws SQLException {
		try { 
			// 1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl"; 
			// 2.db접속
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("db 접속 성공!!!!");
			// 3.sql명령을 실행하기 위한 객체 얻어오기
			stmt = con.createStatement();			
			// 4. 원하는 작업하기
			delete();						
		} catch(ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally { // 5. db접속해제
				try {					
					if(stmt != null)
						stmt.close();
					if(con != null)
						con.close();
				} catch(SQLException se) {
					System.out.println(se.getMessage());
				}
		}
	}
	 public void delete() throws SQLException {
		// 삭제할 번호를 입력을 받아서 삭제해 보시기 바랍니다.
		 System.out.println("삭제할 번호를 입력해 주세요.");
		 int dn = scan.nextInt();
		 String sql = "delete from student where num = " + dn;
		 int n1 = stmt.executeUpdate(sql);
		 System.out.println(n1 + "개의 데이터가 삭제 되었습니다.");
	 }
}
public class Test03_04 {
	public static void main(String[] args) throws SQLException {
		new MyStudentDB6();
	}
}

/* 결과 확인 : 지금 소스를 실행하고, 앞서 Test02 소스 실행해서 DB select문 적용 결과를 확인함. 또는 cmd창 - sqlplus scott/Test1234 - select * from student; 확인함.
db 접속 성공!!!!
삭제할 번호를 입력해 주세요.
100
1개의 데이터가 삭제 되었습니다.
*/