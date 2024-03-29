package iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteUsingBW {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		try (FileReader fr = new FileReader("C:\\test\\Test.txt");
				BufferedReader br = new BufferedReader(fr);

				FileWriter fw = new FileWriter("C:\\test\\new1.txt");
				BufferedWriter bw = new BufferedWriter(fw);) {
			String line="";
			while ((line = br.readLine()) != null) {
				bw.write(line+"\n");
			}
		};
	}
}
