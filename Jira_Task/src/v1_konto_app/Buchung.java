package v1_konto_app;

import java.util.Date;

public class Buchung {
	
	private int bnr;
	private double betrag;
	private Date datum;
	private Konto auftragskonto;// oder als int fuer iban
	private Konto empfangskonto;// oder als int fuer iban
	
	public Buchung(int bnr, double betrag, Konto auftragskonto, Konto empfangskonto)
	{
		this.set_bnr(bnr);
		this.set_betrag(betrag);
		this.set_auftragskonto(auftragskonto);
		this.set_empfangskonto(empfangskonto);
		this.set_datum(new Date());
	}
	/**
	 * @return the bnr
	 */
	public int get_bnr() 
	{
		return bnr;
	}
	/**
	 * @param bnr the bnr to set
	 */
	public void set_bnr(int bnr) 
	{
		this.bnr = bnr;
	}
	/**
	 * @return the betrag
	 */
	public double get_betrag() 
	{
		return betrag;
	}
	/**
	 * @param betrag the betrag to set
	 */
	public void set_betrag(double betrag) 
	{
		this.betrag = betrag;
	}
	/**
	 * @return the datum
	 */
	public Date get_datum() 
	{
		return datum;
	}
	/**
	 * @param datum the datum to set
	 */
	public void set_datum(Date datum) 
	{
		this.datum = datum;
	}
	/**
	 * @return the auftragskonto
	 */
	public Konto get_auftragskonto() 
	{
		return auftragskonto;
	}
	/**
	 * @param auftragskonto the auftragskonto to set
	 */
	public void set_auftragskonto(Konto auftragskonto) 
	{
		this.auftragskonto = auftragskonto;
	}
	/**
	 * @return the empfangskonto
	 */
	public Konto get_empfangskonto() 
	{
		return empfangskonto;
	}
	/**
	 * @param empfangskonto the empfangskonto to set
	 */
	public void set_empfangskonto(Konto empfangskonto) 
	{
		this.empfangskonto = empfangskonto;
	}

}
