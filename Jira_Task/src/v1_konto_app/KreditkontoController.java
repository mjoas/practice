package v1_konto_app;

import java.util.ArrayList;
import java.util.Date;

public class KreditkontoController extends GirokontoController{

	private ArrayList<Kreditkonto> al_Kreditkonto;
	
	public KreditkontoController()
	{
		this.set_al_Kreditkonto(new ArrayList<Kreditkonto>());
		this.set_al_Buchung(new ArrayList<Buchung>());
	}
	
	/*Methode um ein Kreditkonto zu erstellen*/
	public Kreditkonto erstellenKreditkonto( int iban, String eigentuemer, double kontostand, double zinsen, int laufzeit, double rate, double kreditsumme)
	{
		return new Kreditkonto( iban, eigentuemer, kontostand, zinsen, laufzeit, rate, kreditsumme);
	}
	/*Methode um ein Kreditkonto hinzuzufuegen*/
	public void hinzufuegenKreditkonto( int iban, String eigentuemer, double kontostand, double zinsen, int laufzeit, double rate, double kreditsumme)
	{
		/*der Liste ein neues Kreditkonto hinzufuegen*/
		this.get_al_Kreditkonto().add(this.erstellenKreditkonto(iban, eigentuemer, kontostand, zinsen, laufzeit, rate, kreditsumme));
	}
	/*Methode um ein bestimmtes Kreditkonto zu bekommen*/
	public Kreditkonto get_Kreditkonto(int iban)
	{
		
		/*Hilfsvariable zum Durchlaufen der Liste*/
		int i = this.get_al_Kreditkonto().size();
		/*Durchlaufen der Liste
		 * Solange, bis gefunden
		 * oder i kleiner als 0*/
		while( i > 0|| this.get_al_Kreditkonto().get(i).get_depotnr() != iban)
		{
			/*sonst i dekrementieren*/
			i = i-1;
		}
		/*Rueckgabe des Kontos*/
		return this.get_al_Kreditkonto().get(i);
		
	}
	
	/*Methode zum einzahlen auf bestimmtes Kreditkonto*/
	public void einzahlen(int iban, double betrag)
	{
		this.get_Kreditkonto(iban).set_kontostand(this.kontostandabfragen(iban)+betrag);
	}
	
	/*Methode um die Laufzeit zu veraendern*/
	public void aendernLaufzeit(int iban, int laufzeit)
	{
		this.get_Kreditkonto(iban).set_laufzeit(laufzeit);
	}
	/*Methode um Laufzeit abzufragen*/
	public int abfrageLaufzeit(int iban)
	{
		return this.get_Kreditkonto(iban).get_laufzeit();
	}
	
	
	/*Methode um die Rate zu veraendern*/
	public void aendernRate(int iban, double rate)
	{
		this.get_Kreditkonto(iban).set_rate(rate);
	}
	/*Methode um Rate abzufragen*/
	public double abfragenRate(int iban)
	{
		return this.get_Kreditkonto(iban).get_rate();
	}
	
	/*Methode um Zins abzufragen*/
 	public double abfrageZins(int iban)
	{
		return this.get_Kreditkonto(iban).get_zinsen();
	}
	/*Methode um die Zinsen zu veraender*/
	public void aendernZinsen(int iban, double zinsen)
	{
		this.get_Kreditkonto(iban).set_zinsen(zinsen);
	}
	/*Methode um Kreditsumme abzufragen*/
	public double abfrageKreditsumme(int iban)
	{
		return this.get_Kreditkonto(iban).get_kreditsumme();
	}
	/*Methode um erstelldatum abzufragen*/
	public Date abfragenErstelldatum(int iban)
	{
		return this.get_Kreditkonto(iban).get_erstelldatum();
	}
	
	
	/*Methode um Kontostand abzufragen*/
	public double kontostandabfragen(int iban)
	{
		return this.get_Kreditkonto(iban).get_kontostand();
	}
	
	/*Methode zur Ueberpruefung, ob Gesamtekreditsumme zurueck gezahlt ist*/
	public boolean is_zurueckgezahlt(int iban)
	{
		/*Kreditsumme mit Kontostand abgleichen*/
		return this.abfrageKreditsumme(iban)==this.kontostandabfragen(iban);
	}
	
	

	/**
	 * @return the al_Kreditkonto
	 */
	public ArrayList<Kreditkonto> get_al_Kreditkonto() 
	{
		return al_Kreditkonto;
	}

	/**
	 * @param al_Kreditkonto the al_Kreditkonto to set
	 */
	public void set_al_Kreditkonto(ArrayList<Kreditkonto> al_Kreditkonto) 
	{
		this.al_Kreditkonto = al_Kreditkonto;
	}
}
