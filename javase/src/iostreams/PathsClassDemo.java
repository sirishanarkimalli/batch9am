package iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathsClassDemo {

	public static void main(String[] args) throws IOException {

		Path src = Paths.get("C:\\test\\Test1.txt");
		BufferedReader br = Files.newBufferedReader(src);

		Path trg = Paths.get("C:\\test\\pathTrg.txt");
		BufferedWriter bw = Files.newBufferedWriter(trg, StandardOpenOption.CREATE);

		String line = "";
		while ((line = br.readLine()) != null) {
			if (line.length() > 0)
				bw.write(line + "\n");
		}
		br.close();
		bw.close();

	}

}
