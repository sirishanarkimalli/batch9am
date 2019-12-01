package iostreams;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import basics.SavingsAccount;

public class SerializingObjects {

	public static void main(String[] args) throws IOException{
		SavingsAccount sa1= new SavingsAccount(1, "George","george@gmail.com");
		SavingsAccount sa2= new SavingsAccount(2, "Alen","alen@gmail.com");
		SavingsAccount sa3= new SavingsAccount(3, "Smith","smith@gmail.com");
				
		ObjectOutputStream out= new ObjectOutputStream(System.out);
		
		out.writeObject(sa1);
		out.writeObject(sa2);
		out.writeObject(sa3);
	
		out.close();
		
		
	}

}
