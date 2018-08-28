package v1_konto_app;

import java.util.ArrayList;

public class Depot implements Konto{
	private int depotnr;
	private String eigentuemer;
	private double kontostand;
	private double gebuehr;
	private ArrayList<Wertpapier> al_Wertpapier;
	
	public Depot(int depotnr, String eigentuemer, double kontostand, double gebuehr)
	{
		this.set_depotnr(depotnr);
		this.set_eigentuemer(eigentuemer);
		this.set_kontostand(kontostand);
		this.set_gebuehr(gebuehr);
		this.set_al_Wertpapier(new ArrayList<Wertpapier>());
	}
	/**
	 * @return the iban
	 */
	public int get_depotnr() 
	{
		return depotnr;
	}
	/**
	 * @param depotnr the depotnr to set
	 */
	public void set_depotnr(int depotnr) 
	{
		this.depotnr = depotnr;
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
	 * @return the al_Wertpapier
	 */
	public ArrayList<Wertpapier> get_al_Wertpapier() 
	{
		return al_Wertpapier;
	}
	/**
	 * @param al_Wertpapier the al_Wertpapier to set
	 */
	public void set_al_Wertpapier(ArrayList<Wertpapier> al_Wertpapier) 
	{
		this.al_Wertpapier = al_Wertpapier;
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
