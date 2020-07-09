package source30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class MyStudentDB3{
	Connection con = null;
	Statement stmt = null;
	Scanner scan = new Scanner(System.in);
	
	public MyStudentDB3() throws SQLException {
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
			find();						
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
	 public void find() throws SQLException {
		 System.out.println("조회할 번호를 입력해 주세요.");
		 int sn = scan.nextInt();
		 String sql = "select * from student where num = " + sn;
		 
		 ResultSet rs = stmt.executeQuery(sql);
		 if(rs.next()) {
			 System.out.println("----------" + sn + "번 학생의 데이터 ----------");
			 int num = rs.getInt("num");
			 String name = rs.getString("name");
			 String phone = rs.getString("phone");
			 String addr = rs.getString("addr");
			 System.out.println("번호 = " + num + ", 이름 = " + name + ", 전화번호 = " + phone
					 + ", 주소 = " + addr);
		 } else {
			 System.out.println("검색된 데이터가 없습니다.");
		 }
		 rs.close();
	 }
}
public class Test03_01 {
	public static void main(String[] args) throws SQLException {
					new MyStudentDB3();
	}
}

/* 결과 확인 : 지금 소스를 실행하고, 앞서 Test02 소스 실행해서 DB select문 적용 결과를 확인함. 또는 cmd창 - sqlplus scott/Test1234 - select * from student; 확인함.
db 접속 성공!!!!
조회할 번호를 입력해 주세요.
2
----------2번 학생의 데이터 ----------
번호 = 2, 이름 = 김다미, 전화번호 = 010-222-2222, 주소 = 이태원
*/