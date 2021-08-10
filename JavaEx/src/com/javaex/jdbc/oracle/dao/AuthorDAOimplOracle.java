package com.javaex.jdbc.oracle.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOimplOracle implements AuthorDAO {
	//	접속 코드(커넥션 확보) - 모든 메서드가 동일하게 수행할 내용
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl1, "C##BITUSER", "bituser");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} 
		return conn;
	}
	@Override
	public List<AuthorVO> getList() {
		//	전체 목록
		List<AuthorVO> list = new ArrayList<>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT author_id, author_name, author_desc " + 
						" FROM author ORDER BY author_id";
			rs = stmt.executeQuery(sql);
			
			//	루프: 객체화
			while(rs.next()) {
				Long id = rs.getLong(1);
				String name = rs.getString(2);
				String desc = rs.getString(3);
				
				AuthorVO vo = new AuthorVO(id, name, desc);
				
				list.add(vo);
			}
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
		return list;
	}

	@Override
	public List<AuthorVO> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorVO get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(AuthorVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = get.Connection();
			//	실행 계획
			String sql = "INSERT INTO author " +
						" VALUES(seq_author_id.NEXTVAL, ?, ?)";
			pstmt = conn.prepareStatement(sql);	//	준비
			pstmt.setString(1, vo.getAuthorName());
			pstmt.setString(2, vo.getAuthorDesc());
			
			insertedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 1 == insertedCount;
	}

	@Override
	public boolean update(AuthorVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
