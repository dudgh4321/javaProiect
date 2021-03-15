package hr;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainExe2 {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Set<Employee>set = dao.getEmps();//전체리스트 저장
		
		TreeSet<Employee> tset = new TreeSet<Employee>(); // salary 정렬.
		Iterator<Employee> iter = tset.iterator();
		while(iter.hasNext()) {
			tset.add(iter.next()); // salary 정렬 되면서 저장.
			
		} 
		iter = tset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()); // salary 출력.
		}
		
	}

}
