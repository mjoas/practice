package datei_lesen_schreiben;

import java.io.*;

public class Datei {

	public static void main(String[] args) throws IOException {
		
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter ("hallo.txt");
		FileReader fr = new FileReader("hallo.txt");
		BufferedWriter bw = new BufferedWriter (fw);
		BufferedReader br = new BufferedReader (fr);
		String hallo;
		
		System.out.print("Text?");
		hallo = keyboard.readLine();
		bw.write(hallo);	
		bw.close();
		
		System.out.println(br.readLine());
		
		FileWriter copy = new FileWriter("hallo2.txt");
		BufferedWriter kopieren = new BufferedWriter(copy);
		kopieren.write(hallo);
		kopieren.close();
		br.close();
	}

}
