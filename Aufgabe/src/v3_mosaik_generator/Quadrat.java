package v3_mosaik_generator;

public class Quadrat extends Rechteck{

	public Quadrat(int a, int b, String farbe, String typ) {
		super(a, b, farbe, typ);
		
	}
	
	public double getFlaeche()
	{
		return a*a;
	}
	
	

}
