package collection;

import java.util.TreeSet;

import hr.Employee;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<Employee> ts= new TreeSet<Employee>();
		Employee e1= new Employee(1,"Rob",50000);
		Employee e2= new Employee(2,"Louis",55000);
		Employee e3= new Employee(3,"Smith",35000);
		
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		for(Employee emp: ts)
			System.out.println(emp);
	}

}
