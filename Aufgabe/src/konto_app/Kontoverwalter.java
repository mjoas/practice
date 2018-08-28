package konto_app;

import java.util.ArrayList;

public class Kontoverwalter {

	ArrayList<Konto> al_Konto = new ArrayList<Konto>();
	public void neuesKontoanlegen(int kontoart, double kontostand, double zinsen, double limit, String eigentuemer, String iban)
	{
		switch(kontoart)
		{
		case 0:	al_Konto.add(new Girokonto(kontostand, zinsen, limit, eigentuemer, iban));
		break;
		case 1:	al_Konto.add(new Tagesgeldkonto(kontostand, zinsen, limit, eigentuemer, iban));
		break;
		case 2: al_Konto.add(new Depot(kontostand, zinsen, limit, eigentuemer, iban));
		break;
		case 3:	al_Konto.add(new Kreditkonto(kontostand, zinsen, limit, eigentuemer, iban));
		break;
		}
		
	}
}
