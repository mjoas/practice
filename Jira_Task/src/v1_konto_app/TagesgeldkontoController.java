package v1_konto_app;

import java.util.ArrayList;

public class TagesgeldkontoController extends GirokontoController{
	
	private ArrayList<Tagesgeldkonto> al_Tagesgeldkonto;
	
	public TagesgeldkontoController()
	{
		this.set_al_Tagesgeldkonto(new ArrayList<Tagesgeldkonto>());
		this.set_al_Buchung(new ArrayList<Buchung>());
	}
	
	/*Methode um Tagesgeldkonto zu erstellen*/
	public Tagesgeldkonto erstellenTagesgeldkonto(int iban, String eigentuemer, double kontostand, double zinsen, double mindestguthaben ) 
	{
		return new Tagesgeldkonto(iban, eigentuemer, kontostand, zinsen, mindestguthaben );
	}
	/*Methode um Tagesgeldkonto hizuzufuegen*/
	public void hinzufuegenTagesgeldkonto(int iban, String eigentuemer, double kontostand, double zinsen, double mindestguthaben )
	{
		this.get_al_Tagesgeldkonto().add(this.erstellenTagesgeldkonto(iban, eigentuemer, kontostand, zinsen, mindestguthaben));
	}
	/*Methode um ein bestimmtes Tagesgeldkonto zu bekommen*/
	public Tagesgeldkonto get_Tagesgeldkonto(int iban)
	{
		/*Hilfsvariable zum Durchlaufen der Liste*/
		int i = this.get_al_Tagesgeldkonto().size()-1;
		/*Durchlaufen der Liste
		 * Solange, bis gefunden
		 * oder i kleiner als 0*/
		while( i > 0 || this.get_al_Tagesgeldkonto().get(i).get_depotnr() != iban)
		{
			/*i dekrementieren*/
			i = i-1;	
		}
		/*Rueckgabe des Kontos*/
		return this.get_al_Tagesgeldkonto().get(i);
	}
	
	/*Methode zur aenderung des Zins*/
	public void aendernZins(int iban, double zinssat)
	{
		this.get_Tagesgeldkonto(iban).set_zinsen(zinssat);
	}
	/*Methode um Zins zu bekommen*/
	public double get_Zins(int iban)
	{
		return this.get_Tagesgeldkonto(iban).get_zinsen();
	}
	/*Methode um Kontostand die Zinsen hinzuzufuegen*/
	public void hinzufuegenZinsen(int iban)
	{
		/*Fuer Zinssatz muss bei Zinsen die Kommastellen um 2 nach links verschieben und 1 addieren
		 * (damit z.B. aus 0,5% Zinsen 1,005 wird)*/
		double zinssatz = (this.get_Tagesgeldkonto(iban).get_zinsen()*1E-2)+1;
		/*Neuer Kontostand ergibt sich aus Kontostand multipliziert mit Zinssatz*/
		this.get_Tagesgeldkonto(iban).set_kontostand(this.kontostandabfragen(iban)*zinssatz);
	}
	
	/*Methode um Mindestguthaben zu aendern*/
	public void aendernMindestguthaben(int iban, double mindestguthaben)
	{
		this.get_Tagesgeldkonto(iban).set_mindestguthaben(mindestguthaben);
	}
	/*Methode um Mindestguthaben abzufragen*/
	public double abfragenMindestguthaben(int iban)
	{
		return this.get_Tagesgeldkonto(iban).get_mindestguthaben();
	}
	
	/*Methode zum Einzahlen auf ein Konto*/
	public void einzahlen(int iban, double betrag)
	{
		/*Nach dem Konto suchen und dort den Kontostand um betrag erhoehen*/
		this.get_Tagesgeldkonto(iban).set_kontostand(this.kontostandabfragen(iban)+betrag);
	}
	
	/*Methode zum Auszahlen von einem Konto*/
	public double auszahlen(int iban,double betrag)
	{
		/*Ueberpruefen, ob Transaktion mindestguthaben unterschreitet*/
		if(this.kontostandabfragen(iban)-betrag >= this.get_Tagesgeldkonto(iban).get_mindestguthaben())
		{
			/*Wenn keine unterschreidung, Kontostand um betrag reduzieren*/
			this.get_Tagesgeldkonto(iban).set_kontostand(this.kontostandabfragen(iban)-betrag);
		}
		else
		{
			/*Bei unterschreiten, keine Transaktion und auszuzahlender Betrag = 0*/
			betrag = 0;
		}
		return betrag;
	}
	
	/*Methode um Kontostand abzufragen*/
	public double kontostandabfragen(int iban)
	{
		return this.get_Tagesgeldkonto(iban).get_kontostand();
	}
	
	/**
	 * @return the al_Tagesgeld
	 */
	public ArrayList<Tagesgeldkonto> get_al_Tagesgeldkonto() 
	{
		return al_Tagesgeldkonto;
	}
	/**
	 * @param al_Tagesgeld the al_Tagesgeld to set
	 */
	public void set_al_Tagesgeldkonto(ArrayList<Tagesgeldkonto> al_Tagesgeldkonto) 
	{
		this.al_Tagesgeldkonto = al_Tagesgeldkonto;
	}

}
