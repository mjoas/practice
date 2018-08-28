package konto_app;

public class Tagesgeldkonto extends Girokonto{

	public Tagesgeldkonto(double kontostand, double zinsen, double limit, String eigentuemer, String iban) {
		super(kontostand, zinsen, limit, eigentuemer, iban);
		
	}

}
