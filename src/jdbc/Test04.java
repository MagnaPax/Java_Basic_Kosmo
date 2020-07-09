package source30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class MyStudentDB7{
	Connection con = null;
	Statement stmt = null;
	Scanner scan = new Scanner(System.in);
	
	public MyStudentDB7() throws SQLException {
		try { 
			// 1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl"; 
			// 2.db접속
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("===== DataBase Connected =====");
			System.out.println("===== Loading Console Module =====");
			System.out.println("===== Interface Loading =====");
			System.out.println("\n");
			System.out.println("===== Initializing Done =====");
			System.out.println("");			
			// 3.sql명령을 실행하기 위한 객체 얻어오기
			stmt = con.createStatement();			
		} catch(ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} 
	}
	
	public void find() throws SQLException {
		 System.out.println("===== DB 데이터 조회 콘솔 =====");
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
	
	public void update() throws SQLException {
		 System.out.println("===== DB 데이터 수정 콘솔 =====");
		 System.out.println("수정할 번호를 입력해 주세요.");
		 int sn = scan.nextInt();
		 System.out.println(sn + "번 학생의 수정할 주소를 입력해 주세요.");
		 String adr = scan.next();
		 String sql = "update student set addr = '" + adr + "' where num = " + sn;
		 int n1 = stmt.executeUpdate(sql);
		 System.out.println(n1 + "개의 데이터가 수정 되었습니다.");
	 }
	
	 public void delete() throws SQLException {
		 System.out.println("===== DB 데이터 삭제 콘솔 =====");
		// 삭제할 번호를 입력을 받아서 삭제해 보시기 바랍니다.
		 System.out.println("삭제할 번호를 입력해 주세요.");
		 int dn = scan.nextInt();
		 String sql = "delete from student where num = " + dn;
		 int n1 = stmt.executeUpdate(sql);
		 System.out.println(n1 + "개의 데이터가 삭제 되었습니다.");
	 }
	 
	 public void insert() throws SQLException {
		 System.out.println("===== DB 데이터 삽입 콘솔 =====");
		 int n = 300;
		 String name = "김과장";
		 String phone = "010-3333-2222";
		 String addr = "강원도";		 
		 String sql = "insert into student values(" + n + ", '" + name + "', '" + phone
				 + "', '" + addr + "')";
		 int n1 = stmt.executeUpdate(sql);
		 System.out.println(n1 + "개의 데이터가 추가 되었습니다.");
	 }
	 
	 public void dbClose() { // 5. db접속해제
		 try {					
					if(stmt != null)
						stmt.close();
					if(con != null)
						con.close();
				} catch(SQLException se) {
					System.out.println(se.getMessage());
				} scan.close();
		   }
	 }
public class Test04 {
	public static void main(String[] args) throws SQLException {
		MyStudentDB7 db7 = new MyStudentDB7();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("============== [환영 합니다] ==============");
			System.out.println("=== 1.추가, 2.삭제, 3.검색, 4,수정, 5.종료 ===");
			System.out.println("========================================");
			int n = scan.nextInt();
			switch(n) {
			case 1:
				db7.insert();
				break;
			case 2:
				db7.delete();
				break;
			case 3:
				db7.find();
				break;
			case 4:
				db7.update();
				break;
			case 5:
				System.out.println("==== [서비스를 이용해 주셔서 감사합니다.] =====");
				db7.dbClose();
				System.exit(0);
				scan.close();
			}			
		}
	}
}

/* 결과 확인
===== DataBase Connected =====
===== Loading Console Module =====
===== Interface Loading =====


===== Initializing Done =====

============== [환영 합니다] ===============
=== 1.추가, 2.삭제, 3.검색, 4,수정, 5.종료 ===
=========================================
(이 자리에 번호를 입력해서 확인함)
*/