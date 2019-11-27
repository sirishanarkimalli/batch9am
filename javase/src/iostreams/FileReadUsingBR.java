package iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadUsingBR {
	public static void main(String[] args)throws FileNotFoundException,IOException {
		FileReader fr= new FileReader("D:\\GitRepo\\javase\\src\\iostreams\\Test.txt");
		BufferedReader br= new BufferedReader(fr);
		String line = null;
		while( (line =br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}
}

