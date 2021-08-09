package com.javaex.jdbc.oracle;

import java.sql.*;	//	JDBC API

public class ConnectionTest {

	public static void main(String[] args) {
		//	DB 접속 URL
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";	//	jdbc, 오라클, thin:기본 드라이버 @서버주소 포트 서비스식별자
		String dbuser = "C##BITUSER";
		String dbpass = "bituser";
		
		//	접속
		Connection conn = null;
		try {
			//	드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");	//	드라이버 못 찾는 경우 예외처리
			conn = DriverManager.getConnection(dburl,			//	SQL 예외 처리
					dbuser,	dbpass);
			System.out.println(conn);			//	실행 시 찍히는 @7c729a55 <- hashcode
			System.out.println("접속 성공!");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//	자원 정리
			try {
				conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
