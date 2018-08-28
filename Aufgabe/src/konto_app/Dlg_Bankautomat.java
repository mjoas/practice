package konto_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dlg_Bankautomat {

	public static void main(String[] args) 
	{
		final double ZINS = 3.99;
		int kontoart = 0;
		String name = null, iban = null;
		double kontostand = 0, limit = 0;
		
		Kontoverwalter kv = new Kontoverwalter();
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Was für ein Konto wollen Sie anlegen?");
		try 
		{
			kontoart = tastatur.read()-48;
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.print("Name?");
		try 
		{
			name = tastatur.readLine();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.print("Guthaben?");
		try 
		{
			kontostand = (double)tastatur.read();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		kv.neuesKontoanlegen(kontoart, kontostand, ZINS, limit, name, iban);
		
	}

}
