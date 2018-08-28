package konto_app;


import java.util.Date;

public class Kreditkonto {
	private int iban;
	private String eigentuemer;
	private double kontostand;
	private double zinsen;
	private int laufzeit;
	private double rate;
	private double kreditsumme;
	private Date erstelldatum;
	
	
	public Kreditkonto( int iban, String eigentuemer, double kontostand, double zinsen, int laufzeit, double rate, double kreditsumme)
	{
		this.set_depotnr(iban);
		this.set_eigentuemer(eigentuemer);
		this.set_kontostand(kontostand);
		this.set_zinsen(zinsen);
		this.set_laufzeit(laufzeit);
		this.set_rate(rate);
		this.set_kreditsumme(kreditsumme);
		this.set_erstelldatum(new Date());
	}
	/**
	 * @return the iban
	 */
	public int get_depotnr() 
	{
		return iban;
	}
	/**
	 * @param iban the iban to set
	 */
	public void set_depotnr(int iban) 
	{
		this.iban = iban;
	}
	/**
	 * @return the eigentuemer
	 */
	public String get_eigentuemer() 
	{
		return eigentuemer;
	}
	/**
	 * @param eigentuemer the eigentuemer to set
	 */
	public void set_eigentuemer(String eigentuemer) 
	{
		this.eigentuemer = eigentuemer;
	}
	/**
	 * @return the kontostand
	 */
	public double get_kontostand() 
	{
		return kontostand;
	}
	/**
	 * @param kontostand the kontostand to set
	 */
	public void set_kontostand(double kontostand) 
	{
		this.kontostand = kontostand;
	}
	/**
	 * @return the zinsen
	 */
	public double get_zinsen() 
	{
		return zinsen;
	}
	/**
	 * @param zinsen the zinsen to set
	 */
	public void set_zinsen(double zinsen) 
	{
		this.zinsen = zinsen;
	}
	/**
	 * @return the laufzeit
	 */
	public int get_laufzeit() 
	{
		return laufzeit;
	}
	/**
	 * @param laufzeit the laufzeit to set
	 */
	public void set_laufzeit(int laufzeit) 
	{
		this.laufzeit = laufzeit;
	}
	/**
	 * @return the rate
	 */
	public double get_rate() 
	{
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void set_rate(double rate) 
	{
		this.rate = rate;
	}
	/**
	 * @return the kreditsumme
	 */
	public double get_kreditsumme() 
	{
		return kreditsumme;
	}
	/**
	 * @param kreditsumme the kreditsumme to set
	 */
	public void set_kreditsumme(double kreditsumme) 
	{
		this.kreditsumme = kreditsumme;
	}
	/**
	 * @return the erstelldatum
	 */
	public Date get_erstelldatum() 
	{
		return erstelldatum;
	}
	/**
	 * @param erstelldatum the erstelldatum to set
	 */
	public void set_erstelldatum(Date erstelldatum) 
	{
		this.erstelldatum = erstelldatum;
	}

	
}
