package mosaik_generator;

import java.util.Scanner;

public class Dlg_Mosaik_Generator {
	
	private static Mosaik_Generator mg;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anzahl;
		mg = new Mosaik_Generator();
		System.out.println("Mit wie vielen Steinen soll das Mosaik erstellt werden?");
		anzahl = sc.nextInt();
		mg.erstelleMosaik(anzahl);
		/*Ausgabe der Fläche des gesamten Mosaiks*/
		System.out.println("Das Mosaik hat eine Fläche von "+mg.getFlaecheMosaik());
		System.out.println("--------------------------");
		/*Ausgabe der Anzahl von Steinen im Mosaik*/
		System.out.println("Anzahl Steine gesamt: "+mg.anzahlSteine());
		System.out.println("--------------------------");
		/*Ausgabe der Farben aller Steine im Mosaik(zum Testen)*/
		System.out.println(mg.getFarbenMosaik());
		System.out.println("--------------------------");
		
		/*Ausgabe der Art jedes Steines(zum Testen)*/
		System.out.println(mg.getSteinTypen());
		System.out.println("--------------------------");
		/*Ausgabe Anzahl von Steinen einer Art*/
		System.out.println("Anzahl von Rechtecken: \t"+mg.getAnzahl_Steine_eines_Typs("R"));
		System.out.println("Anzahl von Quadraten: \t"+mg.getAnzahl_Steine_eines_Typs("Q"));
		System.out.println("Anzahl von Dreiecken: \t"+mg.getAnzahl_Steine_eines_Typs("D"));
		System.out.println("Anzahl von Kreisen: \t"+mg.getAnzahl_Steine_eines_Typs("K"));
		System.out.println("--------------------------");
		/*Ausgabe Anzahl Steine einer Farbe*/
		System.out.println("Anzahl roter Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("rot"));
		System.out.println("Anzahl blauer Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("blau"));
		System.out.println("Anzahl grüner Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("grün"));
		System.out.println("Anzahl gelber Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("gelb"));
		

	}

}
