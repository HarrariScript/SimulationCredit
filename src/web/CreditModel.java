package web;

public class CreditModel {
	
	private double Montant ;
	private double duree ;
	private double taux ;
	private double mensulite  ;
	
	public CreditModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getMontant() {
		return Montant;
	}
	public void setMontant(double montant) {
		Montant = montant;
	}
	public double getDuree() {
		return duree;
	}
	public void setDuree(double duree) {
		this.duree = duree;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public double getMensulite() {
		return mensulite;
	}
	public void setMensulite(double mensulite) {
		this.mensulite = mensulite;
	}
	
	
	
	

}
