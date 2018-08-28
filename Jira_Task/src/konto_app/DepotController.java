package konto_app;

import java.util.ArrayList;

public class DepotController extends GirokontoController{
	
	private ArrayList<Depot> al_Depot;
	
	public DepotController()
	{
		this.set_al_Depot(new ArrayList<Depot>());
	}
	
	
	/*Methode zum Depot erstellen*/
	public Depot erstellenDepot(int depotnr, String eigentuemer, double kontostand, double gebuehr)
	{
		return new Depot(depotnr, eigentuemer, kontostand, gebuehr);
	}
	/*Methode zum Depot hinzufuegen*/
	public void hinzufuegenDepot(int depotnr, String eigentuemer, double kontostand, double gebuehr)
	{
		this.get_al_Depot().add(this.erstellenDepot(depotnr, eigentuemer, kontostand, gebuehr));
	}
	/*Methode um ein bestimmtes Depot zu bekommen*/
	public Depot get_Depot(int depotnr)
	{
		
		/*Hilfsvariable zum Durchlaufen der Liste*/
		int i = this.get_al_Depot().size();
		/*Durchlaufen der Liste
		 * Solange, bis gefunden
		 * oder i kleiner als 0*/
		while( i > 0|| this.get_al_Depot().get(i).get_depotnr() != depotnr)
		{
			/*i dekrementieren*/
			i = i-1;
		}
		/*Rueckgabe des Kontos*/
		return this.get_al_Depot().get(i);
	}
	
	/*Methode zum Einzahlen auf ein Konto*/
	public void einzahlen(int depotnr, double betrag)
	{
		/*Nach dem Konto suchen und dort den Kontostand um betrag erhoehen*/
		this.get_Depot(depotnr).set_kontostand(this.kontostandabfragen(depotnr)+betrag);
	}
	/*Methode zum Auszahlen von einem Konto*/
	public double auszahlen(int depotnr,double betrag)
	{
		/*Nach Konto suchen und Kontostand um betrag reduzieren*/
		this.get_Depot(depotnr).set_kontostand(this.kontostandabfragen(depotnr)-betrag);
		return betrag;
	}
	/*Methode um Kontostand abzufragen*/
	public double kontostandabfragen(int depotnr)
	{
		return this.get_Depot(depotnr).get_kontostand();
	}
	/*Methode zum abfragen der Gebuehr*/
	public double abfragenGebuehr(int depotnr)
	{
		return this.get_Depot(depotnr).get_gebuehr();
	}
	/*Methode um Gebuehr zu aendern*/
	public void aendernGebuehr(int depotnr, double gebuehr)
	{
		this.get_Depot(depotnr).set_gebuehr(gebuehr);
	}
	
	
	
	
	/*Methode zum Wertpapier erstellen*/
	private Wertpapier erstellenWertpapier(int nr, String name, double wert) 
	{
		return new Wertpapier(nr, name, wert);
	}
	/*Methode um ein bestimmtes Wertpapier zu bekommen*/
	public Wertpapier get_Wertpapier(int depotnr, int nr)
	{
		
		/*Hilfsvariable zum Durchlaufen der Liste*/
		int i = this.get_Depot(depotnr).get_al_Wertpapier().size()-1;
		/*Durchlaufen der Wertpapierliste
		 * Solange, bis gefunden
		 * oder i kleiner als 0*/
		while( i > 0|| this.get_Depot(depotnr).get_al_Wertpapier().get(i).get_nr() != nr)
		{
			
			/*i dekrementieren*/
			i = i-1;
			
		}
		/*Rueckgabe des Wertpapier*/
		return this.get_Depot(depotnr).get_al_Wertpapier().get(i);
	}
	/*Methode um Wert des Wertpapiers abzufragen*/
	public double abfragenWertWertpapier(int depotnr, int nr)
	{
		return this.get_Wertpapier(depotnr, nr).get_wert();
	}
	/*Methode zum entfernen von Wertpapier*/
	public void entfernenWertpapier(int depotnr, int nr)
	{
		this.get_Depot(depotnr).get_al_Wertpapier().remove(this.get_Wertpapier(depotnr, nr));
	}
	
	/*Methode zum hinzufuegen von Wertpapier*/
	public void kaufenWertpapier(int depotnr, int nr, String name, double wert)
	{
		this.get_Depot(depotnr).get_al_Wertpapier().add(this.erstellenWertpapier(nr, name, wert));
		/*Kontostand um Wert des Wertpapier erhoehen*/
		this.get_Depot(depotnr).set_kontostand(this.kontostandabfragen(depotnr)+wert);
	}
	
	/*Methode zum verkaufen von Wertpapier*/
	public void verkaufenWertpapier(int depotnr, int nr)
	{
		/*Kontostand um Wert des Wertpapier verringern*/
		this.get_Depot(depotnr).set_kontostand(this.kontostandabfragen(depotnr)-this.abfragenWertWertpapier(depotnr, nr));
		/*Wertpapier aus Depot entfernen*/
		this.entfernenWertpapier(depotnr, nr);
		
	}
	
	
	
	/**
	 * @return the al_Depot
	 */
	public ArrayList<Depot> get_al_Depot() 
	{
		return al_Depot;
	}
	/**
	 * @param al_Depot the al_Depot to set
	 */
	public void set_al_Depot(ArrayList<Depot> al_Depot) 
	{
		this.al_Depot = al_Depot;
	}

}
