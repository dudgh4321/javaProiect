package hr;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainExe {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Map<String, String> map = dao.getJobList();
		Set<String>set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String JobId = iter.next();
			System.out.println(JobId);
			
		}

//		EmpDAO dao = new EmpDAO();
//		Map<String, String> map = dao.getJobList();
//		Set<Entry<String, String>> set = map.entrySet();
//		Iterator<Entry<String, String>> iter = set.iterator();
//		while (iter.hasNext()) {
//			Entry<String, String> ent = iter.next();
//			System.out.println("jobId: " + ent.getKey() + "jobTitle: " + ent.getValue());
//		}
	}

}
