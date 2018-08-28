package konto_app;

public class Girokonto implements Konto{
	double kontostand = 0;
	String iban = null;
	String eigentuemer = null;
	double zinsen = 0;
	double limit = 0;
	
	public Girokonto(double kontostand, double zinsen, double limit, String eigentuemer, String iban)
	{
		this.kontostand = kontostand;
		this.zinsen = zinsen;
		this.limit = limit;
		this.eigentuemer = eigentuemer;
		this.iban = iban;
	}

	
	public double get_Kontostand() 
	{
		return kontostand;
	}

	
	public String get_IBAN() 
	{
		return iban;
	}

	
	public String get_Eigentuemer() 
	{
		return eigentuemer;
	}

	
	public void einzahlen(double betrag) 
	{
		kontostand = kontostand + betrag;
	}

	
	public double auszahlen(double aus) 
	{
		kontostand = kontostand - aus;
		return aus;
	}

	
	public double get_Zinsen() 
	{
		return zinsen;
	}

	
	public double get_Limit() 
	{
		return limit;
	}

}
