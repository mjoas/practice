package mosaik_generator;

public class Mosaik_Generator 
{
	

	private Mosaik mosaik;
	
	public Mosaik_Generator()
	{
		//mosaik = new Mosaik();
	}
	/*Methode zum erstellen eines Mosaiks*/
	public void erstelleMosaik(int anzahlSteine)
	{
		mosaik = new Mosaik(anzahlSteine);
	}
	/*Methode für die Ausgabe der gesamten Fläche des Mosaiks*/
	public double getFlaecheMosaik()
	{
		return mosaik.getMosaikFlaeche();
	}
	/*Methode für Ausgabe aller Farben des Mosaiks*/
	public String getFarbenMosaik()
	{
		return mosaik.getMosaikFarben();
	}
	/*Alle vorhandene Arten werden ausgewählt*/
	public String getSteinTypen()
	{
		return mosaik.getTypallerSteine();
	}
	/*Methode für Ausgabe der Anzahl aller Steine des Mosaiks*/
	public int anzahlSteine()
	{
		return mosaik.get_al_Stein().size();
	}
	/*Methode zur bestimmung der Anzahl einer bestimmten Steinart*/
	public int getAnzahl_Steine_eines_Typs(String gewaehlterTyp)
	{
		return mosaik.get_Anzahl_Typ(gewaehlterTyp);
	}
	/*Methode zur bestimmung der Anzahl einer bestimmten Steinfarbe*/
	public int getAnzahl_Steine_einer_Farbe(String gewaehlteFarbe)
	{
		return mosaik.get_Anzahl_Farbe(gewaehlteFarbe);
	}
	
}
