package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSearchEmployeeSalaryPstmt {

	public static void main(String[] args) {
		String dburl1 = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("최소 급여를 입력해 주세요: ");
		int sMin = sc.nextInt();
		System.out.print("최대 급여를 입력해 주세요: ");
		int sMax = sc.nextInt();
		
		if (sMin > sMax) {
            //    값을 바꾼다
            int temp = sMin;
            sMin = sMax;
            sMax = temp;
        }
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl1, "hr", "hr");
			String sql = "SELECT first_name||' '||last_name name, " +
						 " salary FROM employees" + 
						 " WHERE salary BETWEEN ? AND ? " +
						 " ORDER BY salary ASC";
			
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, sMin);
			pstmt.setInt(2, sMax);
			
			rs = pstmt.executeQuery();
			
			System.out.println("====================================");
			while(rs.next()) {
				String name = rs.getString("name");
				int salary = rs.getInt("salary");
				
				System.out.printf("이름: %-20s 급여: %d%n", name, salary);
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
				e.printStackTrace();
			}
		}
		sc.close();
	}
}
