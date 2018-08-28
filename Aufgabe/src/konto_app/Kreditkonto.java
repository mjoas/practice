package konto_app;

public class Kreditkonto extends Girokonto{

	public Kreditkonto(double kontostand, double zinsen, double limit, String eigentuemer, String iban) {
		super(kontostand, zinsen, limit, eigentuemer, iban);
		
	}

}
