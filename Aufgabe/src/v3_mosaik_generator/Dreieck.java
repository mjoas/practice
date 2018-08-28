package v3_mosaik_generator;

public class Dreieck implements Stein{
	
	protected int a, b, c;
	protected String farbe, typ;
	
	public Dreieck(int a, int b, int c, String farbe, String typ)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.farbe = farbe;
		this.typ = typ;
	}
	
	public String getFarbe() {
		return farbe;
	}

	
	public double getFlaeche() {
		return Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c))/4;
	}

	
	public String getTyp() {
		return typ;
	}

}
