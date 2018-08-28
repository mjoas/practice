package konto_app;

import java.util.ArrayList;

public class GirokontoController {
	
	private ArrayList<Girokonto> al_Girokonto;
	
	
	public GirokontoController()
	{
		this.set_al_Girokonto(new ArrayList<Girokonto>());
	}
	
	
	/*Methode um das Konto mit gewuenschter iban zu bekommen*/
	public Girokonto get_Girokonto(int iban)
	{
		/*Hilfsvariable zum Durchlaufen der Liste*/
		int i = this.get_al_Girokonto().size()-1;
		/*Durchlaufen der Liste
		 * Solange, bis gefunden
		 * oder i kleiner als 0*/
		while(this.get_al_Girokonto().get(i).get_depotnr() != iban || i > 0)
		{
				/*i dekrementieren*/
				i = i-1;
		}
		/*Rueckgabe des Kontos*/
		return this.get_al_Girokonto().get(i);
	}
	/*Methode um neues Girokonto hinzuzufuegen*/
	public void hinzufuegenGirokonto(int iban, String eigentuemer, double kontostand)
	{
		this.get_al_Girokonto().add(this.erstellenGirokonto(iban, eigentuemer, kontostand));
	}
	/*Methode um ein Girokonto zu erstellen*/
	public Girokonto erstellenGirokonto(int iban, String eigentuemer, double kontostand)
	{
		return new Girokonto(iban, eigentuemer,kontostand);
	}
	
	/*Methode zum Einzahlen auf ein Konto*/
	public void einzahlen(int iban, double betrag)
	{
		/*Nach dem Konto suchen und dort den Kontostand um betrag erhoehen*/
		this.get_Girokonto(iban).set_kontostand(this.kontostandabfragen(iban)+betrag);
	}
	/*Methode zum Auszahlen von einem Konto*/
	public double auszahlen(int iban,double betrag)
	{
		/*Nach Konto suchen und Kontostand um betrag reduzieren*/
		this.get_Girokonto(iban).set_kontostand(this.kontostandabfragen(iban)-betrag);
		return betrag;
	}
	/*Methode um Kontostand abzufragen*/
	public double kontostandabfragen(int iban)
	{
		return this.get_Girokonto(iban).get_kontostand();
	}
	/*Methode zum abfragen der Gebuehr*/
	public double abfragenGebuehr(int iban)
	{
		return this.get_Girokonto(iban).get_gebuehr();
	}
	/*Methode um Gebuehr zu aendern*/
	public void aendernGebuehr(int iban, double gebuehr)
	{
		this.get_Girokonto(iban).set_gebuehr(gebuehr);
	}
	/*Methode um Gebuehr von Konto abzuiehen*/
	public void abrechnenGebuehr(int iban)
	{
		/*Vom Kontostand die Gebuehr abziehen*/
		this.get_Girokonto(iban).set_kontostand(this.kontostandabfragen(iban)-this.abfragenGebuehr(iban));
	}
	
	/**
	 * @return the al_Konto
	 */
	public ArrayList<Girokonto> get_al_Girokonto() 
	{
		return al_Girokonto;
	}
	/**
	 * @param al_Konto the al_Konto to set
	 */
	public void set_al_Girokonto(ArrayList<Girokonto> al_Girokonto) 
	{
		this.al_Girokonto = al_Girokonto;
	}

}
