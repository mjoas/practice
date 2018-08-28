package konto_app;

public class Test {

	public static void main(String[] args) {
		
		GirokontoController controller = new GirokontoController();
		TagesgeldkontoController tcontroller = new TagesgeldkontoController();
		int iban = 0;
		String name = "malte";
		double kontostand = 1000.00;
		double betrag = 59.99;
		
		controller.hinzufuegenGirokonto(iban, name, kontostand);
		controller.hinzufuegenGirokonto(1, name, kontostand);
		controller.hinzufuegenGirokonto(2, name, kontostand);
		
		System.out.println("Test");
		System.out.println("Iban: "+ controller.get_Girokonto(iban).get_depotnr());
		System.out.println("Eigentümer: "+ controller.get_Girokonto(iban).get_eigentuemer());
		System.out.println("Kontostand: "+ controller.kontostandabfragen(iban));
		controller.einzahlen(iban, betrag);
		System.out.println("Neuer Kontostand: "+ controller.kontostandabfragen(iban));
		System.out.println("Es werden Ihnen "+ controller.auszahlen(iban, 30)+" Euro ausgezahlt");
		System.out.println("Kontostand: "+ controller.kontostandabfragen(iban));
		
		iban = iban+3;
		System.out.println("Test Tagesgeldkonto");
		tcontroller.hinzufuegenTagesgeldkonto(iban, name, kontostand, 10, 500);
		System.out.println(tcontroller.kontostandabfragen(iban));
		tcontroller.hinzufuegenZinsen(iban);
		System.out.println("Neuer Kontostand: "+ tcontroller.kontostandabfragen(iban));

	}

}
