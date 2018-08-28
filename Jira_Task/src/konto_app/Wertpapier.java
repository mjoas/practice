package konto_app;

public class Wertpapier {
	
	private int nr;
	private String name;
	private double wert;
	
	public Wertpapier(int nr, String name, double wert)
	{
		this.set_nr(nr);
		this.set_name(name);
		this.set_wert(wert);
	}
	/**
	 * @return the nr
	 */
	public int get_nr() 
	{
		return nr;
	}
	/**
	 * @param nr the nr to set
	 */
	public void set_nr(int nr) 
	{
		this.nr = nr;
	}
	/**
	 * @return the name
	 */
	public String get_name() 
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void set_name(String name) 
	{
		this.name = name;
	}
	/**
	 * @return the wert
	 */
	public double get_wert() 
	{
		return wert;
	}
	/**
	 * @param wert the wert to set
	 */
	public void set_wert(double wert) 
	{
		this.wert = wert;
	}
	
	

}
