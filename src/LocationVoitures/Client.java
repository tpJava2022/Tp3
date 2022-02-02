package LocationVoitures;

public class Client {
	private String nom;
	private String prenom;
	private String cin;
	public String getCin() {
		return cin;
	}

	private String civilite;
	
	public Client(String nom, String prenom, String cin, String civilite) {
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.civilite = civilite;
	}
	
	
}
