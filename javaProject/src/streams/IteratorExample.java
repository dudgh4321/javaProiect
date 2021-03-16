package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import hr.EmpDAO;
import hr.Employee;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("홍");
		list.add("김");
		list.add("신");
		
		list = Arrays.asList("홍", "김","신");
		for(String str : list) {
			System.out.println(str);
		}
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String val	= iter.next();
			System.out.println(val);
		}
		
		Stream<String> stream = list.stream();
		stream.forEach(new Consumer<String>(){
			@Override
			public void accept(String t) {
		System.out.println(t);
		
		
		EmpDAO dao = new EmpDAO();
		List<Employee> empList = dao.getEmpList();
		Stream<Employee> eStream =empList.stream();
		
		eStream.filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return false;
			}
			
		}).mapToInt(new ToIntFunction<Employee>() {
			).sum();
		}
		
		
		
		
		

			
			List<Integer> intlist = Arrays.asList(new Integer(10));
		}
		
		
		
	}

}
