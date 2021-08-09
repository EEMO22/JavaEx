package com.javaex.jdbc.oracle;

import java.sql.*;

public class SelectTest {

	public static void main(String[] args) {
		
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//	1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 	2. Connection
			conn = DriverManager.getConnection(dburl, "HR", "hr");
			//	3. 질의 객체(Statement)
			stmt = conn.createStatement();
			//	4. SQL 설정
			String sql = "SELECT department_id, department_name " + 
						" FROM departments ORDER BY department_id";
			//	5. 실행
			rs = stmt.executeQuery(sql);
			
			System.out.println(rs);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			System.err.println("SQL ERROR!");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
