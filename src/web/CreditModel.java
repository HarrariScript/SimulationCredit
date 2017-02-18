package web;

public class CreditModel {
	
	private double Montant ;
	private int duree ;
	private double taux ;
	private double mensulite  ;
	
	public CreditModel(double montant, int duree, double taux, double mensulite) {
		super();
		Montant = montant;
		this.duree = duree;
		this.taux = taux;
		this.mensulite = mensulite;
	}
	
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
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
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
