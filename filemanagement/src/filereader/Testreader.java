package filereader;

import java.io.FileReader;
import java.io.IOException;

public class Testreader {

	public static void main(String[] args) throws IOException {
		
		FileReader datei = new FileReader("test.txt");
		
		char[] read = new char[1024];
		
		int i = 0;
		
		while((i = datei.read(read))>= 0)	{
			
			System.out.print(read);
		}

	}

}
