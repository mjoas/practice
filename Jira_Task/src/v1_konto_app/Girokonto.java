package v1_konto_app;

public class Girokonto implements Konto{
	
	private int iban;
	private String eigentuemer;
	private double kontostand;
	private double gebuehr;
	
	
	public Girokonto(int iban, String eigentuemer, double kontostand)
	{
		this.set_depotnr(iban);
		this.set_eigentuemer(eigentuemer);
		this.set_kontostand(kontostand);
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
	 * @return the gebuehr
	 */
	public double get_gebuehr() 
	{
		return gebuehr;
	}

	/**
	 * @param gebuehr the gebuehr to set
	 */
	public void set_gebuehr(double gebuehr) 
	{
		this.gebuehr = gebuehr;
	}
	
}
