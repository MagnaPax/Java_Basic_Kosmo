package source30;

/* 결과집합(ResultSet) 의 처리
ResultSet은 SQL질의문의 결과물을 추상화한 인터페이스 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

class MyStudentDB10{
	Connection con;
	Statement stmt = null;
	ResultSet rs = null;
	ResultSetMetaData  rsmd = null;
	
	public MyStudentDB10() throws SQLException {
		try { 
			// 1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl"; 
			// 2.db접속
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("db 접속 성공!!!!");
			
			stmt = con.createStatement();
			String sql = "select * from student";
			
			rs = stmt.executeQuery(sql);
			rsmd = rs.getMetaData();
			// 컬럼 갯수 얻어오기
			int count = rsmd.getColumnCount();
			for(int i = 1; i <= count; i++) {
				// 컬럼명 얻어오기
				String colName = rsmd.getColumnName(i);
				System.out.println(colName + "\t");
			}
			System.out.println("");
			for(int i = 1; i <= count; i++) {
				String typeName = rsmd.getColumnTypeName(i);
				System.out.println(typeName + "\t");
			}
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
}
public class Test07 {
	public static void main(String[] args) throws SQLException {
		new MyStudentDB10();
	}
}

/* 결과 확인 : 지금 소스를 실행하고, cmd창 - sqlplus scott/Test1234 - desc student; 확인함.
db 접속 성공!!!!
NUM	
NAME	
PHONE	
ADDR	

NUMBER	
VARCHAR2	
VARCHAR2	
VARCHAR2
*/