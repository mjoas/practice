package v3_mosaik_generator;

public class Kreis implements Stein{
	private int r;
	private final double PI = 3.15;
	private String farbe, typ;

	public Kreis(int r, String farbe, String typ) 
	{
		this.r = r;
		this.farbe = farbe;
		this.typ = typ;
		
	}
	
	public String getFarbe() 
	{
		return farbe;
	}

	
	public double getFlaeche() 
	{
		return PI*r*r;
	}

	
	public String getTyp() {
		return typ;
	}
	
	

}
