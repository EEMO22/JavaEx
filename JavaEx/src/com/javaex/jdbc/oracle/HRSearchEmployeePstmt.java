package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSearchEmployeePstmt {

	public static void main(String[] args) {
		String dburl1 = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("검색어를 입력해주세요: ");
		String keyword = scanner.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl1, "hr", "hr");
			
			//	실행 계획
			String sql =  "SELECT first_name || ' ' || last_name as name, " +
					" email, phone_number, hire_date " +
					" FROM employees " +
					" WHERE lower(first_name) LIKE ? OR " +
					" lower(last_name) LIKE ?";
			
			//	준비
			pstmt = conn.prepareStatement(sql);
			//	파라미터 세팅
			pstmt.setString(1, "%" + keyword.toLowerCase() + "%");
			pstmt.setString(2, "%" + keyword.toLowerCase() + "%");
			
			//	실행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString(1);
				String email = rs.getString(2);
				String phoneNumber = rs.getString(3);
				String hireDate = rs.getString(4);
				
				System.out.printf("%s: %s, %s, %s%n", 
						name, email, phoneNumber, hireDate);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}
		
		scanner.close();
		
	}

}
