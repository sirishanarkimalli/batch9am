package iostreams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args)throws IOException {
		File f= new File("D:\\GitRepo\\javase\\src\\iostreams\\Test.txt");
		FileReader fr= new FileReader(f);
		
		int ch=0;
		while( (ch=fr.read())!=-1) {
			System.out.print((char)ch);
		}
		fr.close();
		}
}
