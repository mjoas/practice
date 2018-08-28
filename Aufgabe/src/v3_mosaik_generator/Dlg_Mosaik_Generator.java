package v3_mosaik_generator;

import java.util.Scanner;

public class Dlg_Mosaik_Generator 
{
	
	private static Mosaik_Generator mg;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int anzahl;
		int typ;
		int farbe;
		int steinnr;
		int mosaiknr = 0;
		int haupt_menue_auswahl;
		int mosaik_menue_auswahl;
		boolean is_hauptmenue_ende = false;
		boolean is_mosaikmenue_ende = false;
		mg = new Mosaik_Generator();
		System.out.println("Mit wie vielen Steinen soll das Mosaik erstellt werden?");
		anzahl = sc.nextInt();
		mg.hinzufuegen_Mosaik(anzahl);;
		/*Ausgabe der Fläche des gesamten Mosaiks*/
		System.out.println("Das Mosaik hat eine Fläche von "+mg.getFlaecheMosaik(mosaiknr));
		System.out.println("--------------------------");
		/*Ausgabe der Anzahl von Steinen im Mosaik*/
		System.out.println("Anzahl Steine gesamt: "+mg.anzahlSteine(mosaiknr));
		System.out.println("--------------------------");
		/*Ausgabe der Farben aller Steine im Mosaik(zum Testen)*/
		System.out.println(mg.getFarbenMosaik(mosaiknr));
		System.out.println("--------------------------");
		
		/*Ausgabe der Art jedes Steines(zum Testen)*/
		System.out.println(mg.getSteinTypen(mosaiknr));
		System.out.println("--------------------------");
		
		while(!is_hauptmenue_ende)
		{
			System.out.println("Hauptmenü:");
			System.out.println("1: Mosaik hinzufügen");
			System.out.println("2: Mosaik löschen");
			System.out.println("3: Anzahl Mosaike");
			System.out.println("4: Mosaikmenü");
			System.out.println("5: Ende");
			haupt_menue_auswahl = sc.nextInt();
			switch(haupt_menue_auswahl)
			{
			case 1:	/*Neues Mosaik hinzufügen*/
					System.out.println("Mit wie vielen Steinen soll das Mosaik erstellt werden?");
					anzahl = sc.nextInt();
					mg.hinzufuegen_Mosaik(anzahl);
					System.out.println("--------------------------");
					System.out.println("Neue Anzahl Mosaike: "+mg.anzahl_Mosaike());
					System.out.println("--------------------------");
			break;
			case 2:	/*Ein Mosaik löschen*/
					System.out.println("Welches Mosaik wollen Sie löschen");
					mosaiknr = sc.nextInt();
					if(mosaiknr>=mg.anzahl_Mosaike()||mosaiknr<0) 
					{
						System.out.println("Dieses Mosaik existiert nicht!");
					}else {
					mg.loesche_Mosaik(mosaiknr);
					System.out.println("--------------------------");
					System.out.println("Neue Anzahl Mosaike: "+mg.anzahl_Mosaike());
					System.out.println("--------------------------");
					}
			break;
			case 3:	/*Anzahl Mosaike*/
					System.out.println("Anzahl Mosaike: "+mg.anzahl_Mosaike());
					System.out.println("--------------------------");
			break;
			case 4:	/*Mosaikmenü*/
					System.out.println("Welches Mosaik wollen Sie bearbeiten?");
					mosaiknr = sc.nextInt();
					while(!is_mosaikmenue_ende)
					{
						System.out.println("Mosaikmenü:");
						System.out.println("Was wollen Sie tun?");
						System.out.println("1: Anzahl eines bestimmten Steintyps anzeigen");
						System.out.println("2: Anzahl je Steintyp anzeigen");
						System.out.println("3: Anzahl einer bestimmten Steinfarbe anzeigen");
						System.out.println("4: Anzahl je Steinfarbe anzeigen");
						System.out.println("5: Gesamtanzahl Steine");
						System.out.println("6: Gesamtfläche Mosaik");
						System.out.println("7: Zufälligen Stein hinzufügen");
						System.out.println("8: Einen Stein löschen");
						System.out.println("9: Ende");
						mosaik_menue_auswahl = sc.nextInt();
						switch(mosaik_menue_auswahl)
						{
						case 1:	/*Benutzer definierte Ausgabe des Typs*/
								System.out.println("Nach welchem Typ wollen Sie suchen?");
								System.out.println("0=Rechteck, 1=Quadrat, 2=Dreieck, 3=Kreis");
								typ = sc.nextInt();
								switch(typ)
								{
								case 0:	/*Ausgabe der Anzahl von Rechtecken*/
										System.out.println("Anzahl von Rechtecken: \t"+mg.getAnzahl_Steine_eines_Typs("R", mosaiknr)); 
								break;
								case 1:	/*Ausgabe der Anzahl von Quadraten*/
										System.out.println("Anzahl von Quadraten: \t"+mg.getAnzahl_Steine_eines_Typs("Q", mosaiknr));
								break;
								case 2:	/*Ausgabe der Anzahl von Dreiecken*/
										System.out.println("Anzahl von Dreiecken: \t"+mg.getAnzahl_Steine_eines_Typs("D", mosaiknr));
								break;
								case 3:	/*Ausgabe der Anzahl von Kreisen*/
										System.out.println("Anzahl von Kreisen: \t"+mg.getAnzahl_Steine_eines_Typs("K", mosaiknr));
								break;
								}
								System.out.println("--------------------------");
						break;
						case 2:	/*Ausgabe Anzahl von Steinen je Art*/
								System.out.println("Anzahl von Rechtecken: \t"+mg.getAnzahl_Steine_eines_Typs("R", mosaiknr));
								System.out.println("Anzahl von Quadraten: \t"+mg.getAnzahl_Steine_eines_Typs("Q", mosaiknr));
								System.out.println("Anzahl von Dreiecken: \t"+mg.getAnzahl_Steine_eines_Typs("D", mosaiknr));
								System.out.println("Anzahl von Kreisen: \t"+mg.getAnzahl_Steine_eines_Typs("K", mosaiknr));
								System.out.println("--------------------------");
						break;
						case 3:	/*Benutzer definierte Ausgabe der Farbe*/
								System.out.println("Nach welcher Farbe wollen Sie suchen?");
								System.out.println("0=rot, 1=blau, 2=grün, 3=gelb");
								farbe = sc.nextInt();
								switch(farbe)
								{
								case 0:	/*Ausgabe der Anzahl von roten Steinen*/
										System.out.println("Anzahl roter Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("rot", mosaiknr));
								break;
								case 1:	/*Ausgabe der Anzahl von blauen Steinen*/
										System.out.println("Anzahl blauer Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("blau", mosaiknr));
								break;
								case 2:	/*Ausgabe der Anzahl von grünen Steinen*/
										System.out.println("Anzahl grüner Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("grün", mosaiknr));
								break;
								case 3:	/*Ausgabe der Anzahl von gelben Steinen*/
										System.out.println("Anzahl gelber Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("gelb", mosaiknr));
								break;
								}
								System.out.println("--------------------------");
						break;
						case 4:	/*Ausgabe Anzahl Steine je Farbe*/
								System.out.println("Anzahl roter Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("rot", mosaiknr));
								System.out.println("Anzahl blauer Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("blau", mosaiknr));
								System.out.println("Anzahl grüner Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("grün", mosaiknr));
								System.out.println("Anzahl gelber Steine: \t"+mg.getAnzahl_Steine_einer_Farbe("gelb", mosaiknr));
								System.out.println("--------------------------");
						break;
						case 5: /*Ausgabe der Anzahl von Steinen im Mosaik*/
								System.out.println("Anzahl Steine gesamt: "+mg.anzahlSteine(mosaiknr));
								System.out.println("--------------------------");
						break;
						case 6: /*Ausgabe der Fläche des gesamten Mosaik*/
								System.out.println("Das Mosaik hat eine Fläche von "+mg.getFlaecheMosaik(mosaiknr));
								System.out.println("--------------------------");
						break;
						case 7: /*Hinzufügen eines zufälligen Steines*/;
								mg.hinzufuegen_zufaelligen_Stein( mosaiknr);
								System.out.println("--------------------------");
						break;
						case 8: /*Einen Stein löschen*/
								System.out.println("Welchen Stein wollen Sie löschen");
								steinnr = sc.nextInt();
								mg.loesche_bestimmten_Stein(mosaiknr, steinnr);
								System.out.println("Neue Anzahl Steine: "+mg.anzahlSteine(mosaiknr));
								
						break;
						case 9: /*Mosaikmenüende*/
								is_mosaikmenue_ende = true;
						break;
						}
					}
			break;
			case 5:	/*Programmende*/
					is_hauptmenue_ende = true;
			break;
			}
			
			
			}
		System.out.println("--------------------------");
		System.out.println("Programmende!!!!!!!!!!!!!!");
		}	
		
	
}
