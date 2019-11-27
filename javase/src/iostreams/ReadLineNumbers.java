package iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ReadLineNumbers {

	public static void main(String[] args)throws FileNotFoundException,IOException {
		FileReader fr= new FileReader("C:\\Users\\91998\\git\\corejava\\corejava\\src\\iostreams\\Test");
		BufferedReader br= new BufferedReader(fr);
		LineNumberReader lnr= new LineNumberReader(br);
		
		String line = null;
		while( (line =lnr.readLine())!=null) {
			System.out.println(lnr.getLineNumber()+" "+line);
		}
		lnr.close();
		br.close();
		fr.close();
	}

}
