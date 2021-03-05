package hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	Connection conn = null;

	EmpDAO() {
		String url = "jdbc:oracle:thin:@lacolhost:1521xe";
		String user = "hr";
		String passwd = "hr";
		conn = DBUtil.getConnection(url, user, passwd);
	}

	public void empList() {

		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from emp_java";
		try {
			psmt = conn.prepareStatement(sql); // 쿼리실행문
			rs = psmt.executeQuery(); // 쿼리를 실행해서 실행한 결과를 받아오는 와서 담는 메소드

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeID(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getString("salary"));
				
				System.out.println(rs.getString("employee_id"));
				System.out.println(rs.getString("first_name"));
				System.out.println(rs.getString("last_name"));
				System.out.println("----------------------------");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료");
	}

}
