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
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class MyStudentDB9{
	Connection con = null;
	PreparedStatement pstmt1 = null;
	PreparedStatement pstmt2 = null;
	PreparedStatement pstmt3 = null;
	Scanner scan = new Scanner(System.in);
	
	public MyStudentDB9() throws SQLException {
		try { 
			// 1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl"; 
			// 2.db접속
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("db 접속 성공!!!!");
			
			String sql3 = "select * from student";
			pstmt3 = con.prepareStatement(sql3);
			ResultSet rs = pstmt3.executeQuery();
			
			// 전체 데이터 출력
			System.out.println("번호\t이름\t전화번호\t주소");
			System.out.println("============================");
			while(rs.next()) {
					int number = rs.getInt("num");
					String name = rs.getString("name");
					String phone = rs.getString("phone");
					String address = rs.getString("addr");
				
					System.out.println(number + "\t" + name + "\t" + phone + "\t" + address);
			}
		} catch(ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally { // 5. db접속해제
				try {					
					if(pstmt3 != null)
						pstmt3.close();
					if(pstmt2 != null)
						pstmt2.close();
					if(pstmt1 != null)
						pstmt1.close();
					if(con != null)
						con.close();
				} catch(SQLException se) {
					System.out.println(se.getMessage());
				}
		}
	}
}
public class Test06 {
	public static void main(String[] args) throws SQLException {
		new MyStudentDB9();
	}
}
/* 결과 확인
db 접속 성공!!!!
번호	이름	전화번호	주소
============================
7	송가인	010-111-5555	울릉도
107	김과장	010-3333-2222	강원도
102	김과장	010-3333-2222	강원도
105	김과장	010-3333-2222	강원도
109	김과장	010-3333-2222	강원도
110	김과장	010-3333-2222	강원도
103	김과장	010-3333-2222	강원도
6	김국진	010-333-5555	서울
101	김과장	010-3333-2222	강원도
*/