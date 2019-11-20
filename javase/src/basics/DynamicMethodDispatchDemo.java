package basics;

class Person {
	
	String name,email;
	
	Person(String name,String email){
		this.name= name;
		this.email=email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void display() {
		System.out.println("Name="+name);
		System.out.println("Email="+email);
	}
}

class Student extends Person{
	
	String courses;
	
	Student(String name,String email,String courses){
		super(name,email);
		this.courses=courses;
	}
	
	public String getCourses() {
		return courses;
	}
	
	@Override
	public void display() {
		System.out.println("Courses="+courses);
	}
}

class Faculty extends Person{
	
	String subjects;
	
	Faculty(String name,String email,String subjects){
		super(name,email);
		this.subjects=subjects;
	}
	
	public String getSubjects() {
		return subjects;
	}
	
//	@Override
//	public void display() {
//		System.out.println("Subjects= "+subjects);
//	}
}
	
	



public class DynamicMethodDispatchDemo {

	public static void main(String[] args) {
	
		Person p;
		
		Student s= new Student("sam","sam@gmail.com","c");
		
		Faculty f = new Faculty("Ram","ram@gmail.com","Java AdvJava");
		
		p=s;
		p.display();
		
		p=f;
		p.display();	
		
	}

}
