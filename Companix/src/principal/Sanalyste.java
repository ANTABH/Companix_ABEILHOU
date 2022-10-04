package principal;

public class Sanalyste extends Salarie {
	private String nbr_deplct_client;
	
	public Sanalyste(String code, String nom, String prenom, String dateEmbauche, String nbr_deplct_client) {
		// TODO Auto-generated constructor stub
		super(code,nom,prenom,dateEmbauche);
		this.nbr_deplct_client = nbr_deplct_client;
	}

	
	public String getNbr_deplct_client() {
		return nbr_deplct_client;
	}

	public void setNbr_deplct_client(String nbr_deplct_client) {
		this.nbr_deplct_client = nbr_deplct_client;
	}
	
	@Override
	public String toString() {
		return "Code : " + this.getCode() + " Nom : " + this.getNom() + " Prenom : " + this.getPrenom() + " Date d'embauche : " + this.getDateEmbauche() + " Année de développement : " + this.nbr_deplct_client;
	} 

}
