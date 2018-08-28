package v1_konto_app;

public class Tagesgeldkonto implements Konto{
	private int iban;
	private String eigentuemer;
	private double kontostand;
	private double zinsen;
	private double mindestguthaben;
	
	public Tagesgeldkonto(int iban, String eigentuemer, double kontostand, double zinsen, double mindestguthaben )
	{
		this.set_depotnr(iban);
		this.set_eigentuemer(eigentuemer);
		this.set_kontostand(kontostand);
		this.set_zinsen(zinsen);
		this.set_mindestguthaben(mindestguthaben);
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
	 * @return the mindestguthaben
	 */
	public double get_mindestguthaben() 
	{
		return mindestguthaben;
	}
	/**
	 * @param mindestguthaben the mindestguthaben to set
	 */
	public void set_mindestguthaben(double mindestguthaben) 
	{
		this.mindestguthaben = mindestguthaben;
	}
	


}
