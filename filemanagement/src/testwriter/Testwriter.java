package testwriter;

import java.io.FileWriter;
import java.io.IOException;

public class Testwriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter write = new FileWriter("test2.txt");
		write.write("Ich mag es, wenn das Programm auf anhieb funktioniert.");
		write.close();

	}

}
