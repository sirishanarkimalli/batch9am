package iostreams;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

public class PushbackReaderDemo {

	public static void main(String[] args) throws IOException {
		StringReader sr = new StringReader("Hello Java");
		PushbackReader pr = new PushbackReader(sr);

		int ch=pr.read();
		System.out.println(ch);
		ch=pr.read();
		System.out.println(ch);
		pr.unread(ch);
		System.out.println("\n"+pr.read());

	}

}
