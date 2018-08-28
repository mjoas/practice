package v3_mosaik_generator;

import java.util.ArrayList;

public class Mosaik_Generator 
{
	private ArrayList<Mosaik> al_Mosaik;
	private Mosaik mosaik;
	
	public Mosaik_Generator()
	{
		al_Mosaik = new ArrayList<Mosaik>();
	}
	/*Methode zum erstellen eines Mosaiks*/
	public void hinzufuegen_Mosaik(int anzahlSteine)
	{
		al_Mosaik.add(new Mosaik(anzahlSteine));
	}
	/*Methode f�r die Ausgabe der gesamten Fl�che des Mosaiks*/
	public double getFlaecheMosaik(int nummer)
	{
		mosaik = al_Mosaik.get(nummer);
		return mosaik.getMosaikFlaeche();
	}
	/*Methode f�r Ausgabe aller Farben des Mosaiks*/
	public String getFarbenMosaik(int nummer)
	{
		mosaik = al_Mosaik.get(nummer);
		return mosaik.getMosaikFarben();
	}
	/*Alle vorhandene Arten werden ausgew�hlt*/
	public String getSteinTypen(int nummer)
	{
		mosaik = al_Mosaik.get(nummer);
		return mosaik.getTypallerSteine();
	}
	/*Methode f�r Ausgabe der Anzahl aller Steine des Mosaiks*/
	public int anzahlSteine(int nummer)
	{
		mosaik = al_Mosaik.get(nummer);
		return mosaik.get_al_Stein().size();
	}
	/*Methode zur bestimmung der Anzahl einer bestimmten Steinart*/
	public int getAnzahl_Steine_eines_Typs(String gewaehlterTyp, int nummer)
	{
		mosaik = al_Mosaik.get(nummer);
		return mosaik.get_Anzahl_Typ(gewaehlterTyp);
	}
	/*Methode zur bestimmung der Anzahl einer bestimmten Steinfarbe*/
	public int getAnzahl_Steine_einer_Farbe(String gewaehlteFarbe, int nummer)
	{
		mosaik = al_Mosaik.get(nummer);
		return mosaik.get_Anzahl_Farbe(gewaehlteFarbe);
	}
	/*Methode zum hinzuf�gen eines neuen zuf�lligen Steines*/
	public void hinzufuegen_zufaelligen_Stein(int nummer)
	{
		mosaik = al_Mosaik.get(nummer);
		mosaik.stein_hinzufuegen();
	}
	/*Methode zum l�schen eines Mosaiks*/
	public void loesche_Mosaik(int nummer)
	{
		al_Mosaik.remove(nummer);
	}
	/*Methode zur bestimmung der Anzahl von Mosaiken*/
	public int anzahl_Mosaike()
	{
		return al_Mosaik.size();
	}
	/*Methode zum l�schen eines bestimmten Steines*/
	public void loesche_bestimmten_Stein(int mosaiknr, int steinnr )
	{
		al_Mosaik.get(mosaiknr).loesche_Stein(steinnr);
	}
	
}
