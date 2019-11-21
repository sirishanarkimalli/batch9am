package basics;

interface DisplayStack{
	public void paint();
}


interface Stack{
	//abstract methods
	void push(int val);
	int pop();
	int length();

	// default method
	default int getTop() {
		return 0;
	}
	
	// static method
	static void print() {
		System.out.println("In Stack Implementation");
	}
}

  class MyStack implements Stack,DisplayStack{
	int stack[]=new int[10];
	int top;
		
	public void push(int value) {
			stack[top]=value;
			top++;
	}
	
	public int pop() {
		top--;
		return (stack[top]);
	}
	
	public int length() {
		return top+1;
	}
	
	public void paint() {
		System.out.println();
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		MyStack s1= new MyStack();
		s1.push(10);
		s1.push(29);
		s1.push(38);
		s1.push(72);
		
		System.out.println(s1.pop());
		System.out.println(s1.length());
		
		//default method call
		s1.getTop();
		
		//static method call of interface
		Stack.print();		
	}
}

