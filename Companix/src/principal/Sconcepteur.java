package principal;

public class Sconcepteur extends Salarie {
	private String annee_dev;
	public Sconcepteur(String code, String nom, String prenom, String dateEmbauche, String annee_dev) {
		// TODO Auto-generated constructor stub
		super(code,nom,prenom,dateEmbauche);
		this.annee_dev = annee_dev;
	}
	
	public String getAnnee_dev() {
		return annee_dev;
	}
	public void setAnnee_dev(String annee_dev) {
		this.annee_dev = annee_dev;
	}
	
	@Override
	public String toString() {
		return "Code : " + this.getCode() + " Nom : " + this.getNom() + " Prenom : " + this.getPrenom() + " Date d'embauche : " + this.getDateEmbauche() + " Année de développement : " + this.annee_dev;
	} 

}
