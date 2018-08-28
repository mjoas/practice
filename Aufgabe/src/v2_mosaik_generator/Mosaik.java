package v2_mosaik_generator;

import java.util.ArrayList;

public class Mosaik 
{
	private Stein stein;
	private double flaeche = 0;
	private ArrayList<Stein> al_Stein = new ArrayList<Stein>();
	
	public Mosaik(int anzahlSteine)
	{
		/*Erstellen der einzelnen Steine*/
		for(int i = 0; i < anzahlSteine; i++)
		{
			/*Der ArrayList ein neuen Stein anhängen*/
			al_Stein.add(getzufaellingenStein());
		}
		
	}
	/*Methode für das hinzufügen eines Steines*/
	public void stein_hinzufuegen()
	{
		al_Stein.add(getzufaellingenStein());
	}
	/*Methode zur Erstellung eines beliebigen Steines*/
	public Stein getzufaellingenStein()
	{
		/*Zufällige Zahlenwerte erzeugen*/
		int a = (int)((Math.random()*6)+1);
		int b = (int)((Math.random()*6)+1);
		int c = (int)((Math.random()*6)+1);
		/*Zufällige Auswahl des zu erstellenden Steintyps*/
		int steintyp = (int)(Math.random()*4);
		switch(steintyp)
		{
		/*Rechteck erstellen*/
		case 0: stein = new Rechteck(a,b,zufaelligeFarbe(),"R");
		break;
		/*Quadrat erstellen*/
		case 1: stein = new Quadrat(a,b,zufaelligeFarbe(),"Q");
		break;
		/*Kreis erstellen
		 * a entspricht dem Radius*/
		case 2: stein = new Kreis(a,zufaelligeFarbe(),"K");
		break;
		/*Dreieck ersstellen*/
		case 3: /*Abfrage, ob eine Seite größer ist als die anderen
		 		beiden zusammen. Da sonst kein Dreieck*/
				if(a+b<c||a+c<b||b+c<a)
				{
					a=4;
					b=2;
					c=3;
				}
				stein = new Dreieck(a,b,c,zufaelligeFarbe(),"D");
		break;
		}
		return stein;
	}
	/*Methode zur Ermittlung der gesamten Fläche des Mosaik*/
	public double getMosaikFlaeche()
	{
		flaeche = 0;
		/*Durchlauf um alle Flächen zusammen zu rechnen*/
		for(int l = 0; l < al_Stein.size(); l++)
		{
			flaeche += al_Stein.get(l).getFlaeche();
		}
		return flaeche;
	}
	
	/*Methode zur ermittlung einer zufälligen Farbe*/
	public String zufaelligeFarbe()
	{
		int zahl = (int)(Math.random()*4);
		String zufallsfarbe = null;
		switch(zahl)
		{
		case 0: zufallsfarbe = "rot";break;
		case 1: zufallsfarbe = "blau";break;
		case 2: zufallsfarbe = "gelb";break;
		case 3: zufallsfarbe = "grün";break;
		}
		return zufallsfarbe;
	}
	
	public ArrayList<Stein> get_al_Stein()
	{
		return al_Stein;
	}
	/*Methode um alle Farben des Mosaiks zu bekommen */
	public String getMosaikFarben()
	{
		String farbe = "Farben: ";
		for(int i = 0; i < al_Stein.size(); i++)
		{
			farbe+= al_Stein.get(i).getFarbe();
			if(i < al_Stein.size()-1) farbe+=", ";
		}
		return farbe;
	}
	/*Methode um alle Typen der Steine zu bekommen*/
	public String getTypallerSteine()
	{
		String typ = "Typ: ";
		for(int i = 0; i < al_Stein.size(); i++)
		{
			typ+= al_Stein.get(i).getTyp();
			if(i < al_Stein.size()-1) typ+=", ";
		}
		return typ;
	}
	/*Methode für Anzahl Steine einer Art*/
	public int get_Anzahl_Typ(String gewaehlterTyp)
	{
		int anzahl = 0;
		/*Durchsuchen der ArrayList nach bestimmten Typ*/
		for(int i=0; i<al_Stein.size(); i++)
		{
			if(al_Stein.get(i).getTyp() == gewaehlterTyp) {anzahl++;}
		}
		return anzahl;
	}
	/*Methode für Anzahl Steine einer Farbe*/
	public int get_Anzahl_Farbe(String gewaehlteFarbe)
	{
		int anzahl = 0;
		for(int i=0; i<al_Stein.size(); i++)
		{
			if(al_Stein.get(i).getFarbe() == gewaehlteFarbe) {anzahl++;}
		}
		return anzahl;
	}

}
