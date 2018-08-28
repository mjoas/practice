package konto_app;

public interface Konto  {
	
	

	public double get_Kontostand();
	public String get_IBAN();
	public String get_Eigentuemer();
	public void einzahlen(double betrag);
	public double auszahlen(double aus);
	public double get_Zinsen();
	public double get_Limit();
	
}
