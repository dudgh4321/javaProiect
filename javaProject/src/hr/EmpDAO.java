package hr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class EmpDAO {
	Connection conn = null;

	public EmpDAO() {
		String path = "config/database.properties";
		FileReader fr = null;
		Properties prop = new Properties();

		try {
			fr = new FileReader(path);
			prop.load(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String passwd = prop.getProperty("pass");
		conn = DBUtil.getConnection(url, user, passwd);
	}

	public Map<String, String> getJobList() {
		String sql = "select * from jobs";
		Statement stmt = null;
		ResultSet rs = null;
		Map<String, String> map = new HashMap<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				map.put(rs.getString("job_id"), rs.getString("job_title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		return map;
	}

}

public Set<Employee> getEmps(){
	String sql = "select * from emp_java";
	Statement stmt =null;
	ResultSet rs = null;
	Set<Employee> set =new HashSet<>();
	try {
	 stmt = conn.createStatement(); 
	 rs = stmt.executeQuery(sql);
	while(rs.next()) {
		Employee emp = new Employee();
		emp.setFirstName(rs.getString("first_name"));
		emp.setFirstName(rs.getString("last_name"));
		emp.setFirstName(rs.getString("employee_name"));
		emp.setFirstName(rs.getString("salary"));
		set.add(emp);
	catch (SQLException e) {
		e.printStackTrace();
	} finally {
		DBUtil.close(rs, stmt, conn);
	}
	System.out.println("메소드 호출 완료");
}
	}
}

//	public void empList1() {
//		PreparedStatement psmt = null;
//		ResultSet rs = null;
//		String sql = "select * from emp_java";
//		try {
//			psmt = conn.prepareStatement(sql); // 쿼리실행문
//			rs = psmt.executeQuery(); // 쿼리를 실행해서 실행한 결과를 받아오는 와서 담는 메소드
//			
//	Set<Employee> empset = new HashSet<>();
//	Iterator<Employee> empitor = empset.iterator();
//	Employee emp = new Employee();
//	empitor.next().getEmployeeID();
//	System.out.println(	empitor.next().getEmployeeID();
//);
//	while(rs.next()) {
//		empset.add(rs.getString("email"));
//	}
//
//	public void empList() {
//
//		PreparedStatement psmt = null;
//		ResultSet rs = null;
//		String sql = "select * from emp_java";
//		try {
//			psmt = conn.prepareStatement(sql); // 쿼리실행문
//			rs = psmt.executeQuery(); // 쿼리를 실행해서 실행한 결과를 받아오는 와서 담는 메소드
//
//			while (rs.next()) {
//				Employee emp = new Employee();
//				emp.setEmail(rs.getString("email"));
//				emp.setEmployeeID(rs.getInt("employee_id"));
//				emp.setFirstName(rs.getString("first_name"));
//				emp.setHireDate(rs.getString("hire_date"));
//				emp.setLastName(rs.getString("last_name"));
//				emp.setSalary(rs.getString("salary"));
//
//				System.out.println(rs.getString("employee_id"));
//				System.out.println(rs.getString("first_name"));
//				System.out.println(rs.getString("last_name"));
//				System.out.println("----------------------------");
//
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.close(rs, psmt, conn);
//		}
//		System.out.println("메소드 호출 완료");
//	}
//
//}
