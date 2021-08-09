package com.javaex.jdbc.oracle;

import java.sql.*;
import java.util.Scanner;

public class HRSearchEmployee {

	public static void main(String[] args) {
		String dburl1 = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색어를 입력하세요: ");
		String word = sc.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl1, "hr", "hr");
			String sql = "SELECT first_name||' '||last_name name, " + " email, " + 
						" phone_number, hire_date FROM employees " +
							" WHERE lower(first_name) LIKE '%" + word.toLowerCase() + "%' OR" +
							" lower(last_name) LIKE '%" + word.toLowerCase() + "%'";

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String pNum = rs.getString("phone_number");
				String hDate = rs.getString("hire_date");
				
				System.out.printf("이름: %s, Email: %s, 전화번호: %s, 입사일: %s%n",
									name, email, pNum, hDate);
				}
			} catch (ClassNotFoundException e) {
				System.err.println("드라이버 로드 실패!");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		sc.close();
		}
	}