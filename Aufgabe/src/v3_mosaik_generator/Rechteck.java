package v3_mosaik_generator;

public class Rechteck implements Stein{
	
	protected int a, b;
	protected String farbe, typ;
	
	public Rechteck(int a, int b, String farbe, String typ)
	{
		this.a = a;
		this.b = b;
		this.farbe = farbe;
		this.typ = typ;
	}
	public String getFarbe() 
	{
		return farbe;
	}
	public double getFlaeche()
	{
		return a*b;
	}
	
	public String getTyp() {
		return typ;
	}

}
