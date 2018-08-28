package v1_konto_app;

public interface Konto {
	
	public int iban = 0;
	public String eigentuemer = null;
	public double kontostand = 0.0;
	
	public void set_depotnr(int iban);
	public int get_depotnr();
	public String get_eigentuemer();
	public void set_eigentuemer(String eigentuemer);
	public double get_kontostand();
	public void set_kontostand(double kontostand);
}
