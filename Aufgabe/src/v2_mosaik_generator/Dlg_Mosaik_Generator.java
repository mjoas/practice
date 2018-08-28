package v2_mosaik_generator;

import java.util.Scanner;

public class Dlg_Mosaik_Generator {
	
	private static Mosaik_Generator mg;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anzahl;
		int typ;
		int farbe;
		int menueauswahl;
		boolean is_ende = false;
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
		
		while(!is_ende)
		{
			System.out.println("Hauptmenü:");
			System.out.println("Was wollen Sie tun?");
			System.out.println("1: Anzahl eines bestimmten Steintyps anzeigen");
			System.out.println("2: Anzahl je Steintyp anzeigen");
			System.out.println("3: Anzahl einer bestimmten Steinfarbe anzeigen");
			System.out.println("4: Anzahl je Steinfarbe anzeigen");
			System.out.println("5: Gesamtanzahl Steine");
			System.out.println("6: Gesamtfläche Mosaik");
			System.out.println("7: Zufälligen Stein hinzufügen");
			System.out.println("8: Ende");
			menueauswahl = sc.nextInt();
			switch(menueauswahl)
			{
			case 1:	/*Benutzer definierte Ausgabe des Typs*/
					System.out.println("Nach welchem Typ wollen Sie suchen?");
					System.out.println("0=Rechteck, 1=Quadrat, 2=Dreieck, 3=Kreis");
					typ = sc.nextInt();
					switch(typ)
					{
					case 0:	/*Ausgabe der Anzahl von Rechtecken*/
							System.out.println("Anzahl von Rechtecken: \t"+mg.getAnzahl_Steine_eines_Typs("R")); 
					break;
					case 1:	/*Ausgabe der Anzahl von Quadraten*/
							System.out.println("Anzahl von Quadraten: \t"+mg.getAnzahl_Steine_eines_Typs("Q"));
					break;
					case 2:	/*Ausgabe der Anzahl von Dreiecken*/
							System.out.println("Anzahl von Dreiecken: \t"+mg.getAnzahl_Steine_eines_Typs("D"));
					break;
					case 3:	/*Ausgabe der Anzahl von Kreisen*/
							System.out.println("Anzahl von Kreisen: \t"+mg.getAnzahl_Steine_eines_Typs("K"));
					break;
					}
					System.out.println("--------------------------");
			break;
			case 2:	/*Ausgabe Anzahl von Steinen je Art*/
					System.out.println("Anzahl von Rechtecken: \t"+mg.getAnzahl_Steine_eines_Typs("R"));
					System.out.println("Anzahl von Quadraten: \t"+mg.getAnzahl_Steine_eines_Typs("Q"));
					System.out.println("Anzahl von Dreiecken: \t"+mg.getAnzahl_Steine_eines_Typs("D"));
					System.out.println("Anzahl von Kreisen: \t"+mg.getAnzahl_Steine_eines_Typs("K"));
					System.out.println("--------------------------");
			break;
			case 3:	/*Benutzer definierte Ausgabe der Farbe*/
					System.out.println("Nach welcher Farbe wollen Sie suchen?");
					System.out.println("0=rot, 1=blau, 2=grün, 3=gelb");
					farbe = sc.nextInt();
					switch(farbe)
					{
					case 0:	/*Ausgabe der Anzahl von roten Steinen*/
							System.out.println("Anzahl roter Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("rot"));
					break;
					case 1:	/*Ausgabe der Anzahl von blauen Steinen*/
							System.out.println("Anzahl blauer Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("blau"));
					break;
					case 2:	/*Ausgabe der Anzahl von grünen Steinen*/
							System.out.println("Anzahl grüner Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("grün"));
					break;
					case 3:	/*Ausgabe der Anzahl von gelben Steinen*/
							System.out.println("Anzahl gelber Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("gelb"));
					break;
					}
					System.out.println("--------------------------");
			break;
			case 4:	/*Ausgabe Anzahl Steine je Farbe*/
					System.out.println("Anzahl roter Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("rot"));
					System.out.println("Anzahl blauer Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("blau"));
					System.out.println("Anzahl grüner Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("grün"));
					System.out.println("Anzahl gelber Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("gelb"));
					System.out.println("--------------------------");
			break;
			case 5: /*Ausgabe der Anzahl von Steinen im Mosaik*/
					System.out.println("Anzahl Steine gesamt: "+mg.anzahlSteine());
					System.out.println("--------------------------");
			break;
			case 6: /*Ausgabe der Fläche des gesamten Mosaik*/
					System.out.println("Das Mosaik hat eine Fläche von "+mg.getFlaecheMosaik());
					System.out.println("--------------------------");
			break;
			case 7: /*Hinzufügen eines zufälligen Steines*/;
					mg.hinzufuegen_zufaelligen_Stein();
			break;
			case 8: /*Programmende*/
					is_ende = true;
			break;
			}
		}
		System.out.println("--------------------------");
		System.out.println("Programmende!!!!!!!!!!!!!!");
	}
}
