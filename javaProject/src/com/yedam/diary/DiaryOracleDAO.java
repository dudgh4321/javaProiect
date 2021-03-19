package com.yedam.diary;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import boardPkg.common.DBCon;

public class DiaryOracleDAO implements DAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;

	public void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

// 입력	
	@Override
	public int insert(DiaryVO vo) {
		conn = DBCon.getConnection();
		sql = "insert into diary values('" + vo.getWdate() + "', '" + vo.getContents() + "')";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("잘못된 정보입니다.");
		} finally {
			close();
		}
		return 1;
	}

//수정
	@Override
	public void update(DiaryVO vo) {
		conn = DBCon.getConnection();
		sql = "update diary set d_contents = '" + vo.getContents() + "' where 'write_date' = " + vo.getWdate();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);
			System.out.println(a + "행이 업데이트되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();

		}
	}

// 삭제
	@Override
	public int delete(String date) {
		conn = DBCon.getConnection();
		sql = "delete from diary where write_date = " + date;
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "행이 삭제되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("일치하는 데이터가 없습니다.");
		} finally {
			close();

		}
		return 1;
	}

// 날짜로 검색	
	@Override
	public DiaryVO selectDate(String date) {
		sql = "select * from diary where write_date = " + date;
		conn = DBCon.getConnection();
		DiaryVO vo = null;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				vo = new DiaryVO(rs.getString("write_date"), rs.getString("d_contents"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("입력하신 날짜 데이터 오류입니다.");
		} finally {
			close();
		}
		return vo;
	}

// 내용으로 검색	
	@Override
	public List<DiaryVO> selectContent(String contents) {
		conn = DBCon.getConnection();
		sql = "select write_date, d_contents " 
				+ "from diary " 
				+ "where D_contents " 
				+ "like '%"+ contents+ "%' "
				+ "order BY write_date desc;";
		List<DiaryVO> findlist = new ArrayList<>();
		DiaryVO vo = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				vo = new DiaryVO(rs.getString("write_date"), rs.getString("d_contents"));
				findlist.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("일치하는 내용의 데이터가 없습니다.");
		} finally {
			close();

		}
		return findlist;
	}
	
//전체 리스트
	@Override
	public List<DiaryVO> selectAll() {
		sql = "select * from diary order by write_date desc";
		conn = DBCon.getConnection();
		List<DiaryVO> list = new ArrayList<DiaryVO>();

		try {
			stmt = conn.createStatement(); 
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DiaryVO vo = new DiaryVO();
				vo.setWdate(rs.getString("write_date"));
				vo.setContents(rs.getString("d_contents"));
				list.add(vo);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("조회처리중에 에러가 발생했습니다.");
		} finally {
			close();
		}
		return list;
	}
}