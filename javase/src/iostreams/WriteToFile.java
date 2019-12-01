package iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String args[]) throws FileNotFoundException,IOException{
		FileReader fr= new FileReader("C:\\test\\Test.txt");
		FileWriter fw= new FileWriter("C:\\test\\newtest.txt");
		int ch=0;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		fw.close();
		fr.close();
		
	}
}
