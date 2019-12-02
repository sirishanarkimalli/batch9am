package hr;

public class Employee implements Comparable<Employee> {
	int empno;
	String ename;
	double salary;
	
	public Employee() {
	
	}
	
	public Employee(int empno,String ename,double salary) {
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
	}

	public int getEmpNo() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp=(Employee) obj;
		if(  ( 
				(this.ename.equals(emp.ename))& 
				(this.empno==emp.empno)
			 )	&
				(this.salary==emp.salary) ){
			return true;

		}
					else return false;
	}

	@Override
	public int hashCode() {
		return empno;
	}
	
	@Override
	public String toString() {
		return empno+" "+ename;
	}
	
	@Override
	public int compareTo(Employee e) {
		if(this.ename.equals(e.ename))
				return (this.empno-e.empno);
	else  return this.ename.compareTo(e.ename);
	}
}