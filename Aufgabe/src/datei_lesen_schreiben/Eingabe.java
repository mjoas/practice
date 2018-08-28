package datei_lesen_schreiben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eingabe {

	public static void main(String[] args) throws IOException {
		String eingabe;
		int zahl;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Gib was ein:");
		eingabe = br.readLine();
		System.out.println("Du hast "+eingabe+" eingegeben");
		System.out.print("Gib was ein:");
		zahl = br.read()-48;
		System.out.println("Du hast "+zahl+" eingegeben");

	}

}
