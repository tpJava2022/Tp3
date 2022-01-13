package LocationVoitures;

public class Voiture {
	private String marque;
	private String model;
	private int anneeProduction;
	private int prixLocation;
	
	public Voiture(String marque, String model, int anneeProduction, int prixLocation) {
		this.marque = marque;
		this.model = model;
		this.anneeProduction = anneeProduction;
		this.prixLocation = prixLocation;
	}
	
	public String getMarque() {
		return marque;
	}

	public boolean equals(Voiture obj) {
		// TODO Auto-generated method stub
		return ((marque==obj.marque)&&(model==obj.model)&&(anneeProduction==obj.anneeProduction)&&
				(prixLocation==obj.prixLocation));
	}
	
	public String toString() {
		String s= "";
		s= "------Affichage des caracteristiques-----\n";
		s= s+ "La Marque est : "+ this.marque+"\n"
				+ " Le model : "+ this.model+ "\n"
				+ " Le prix : "+ this.prixLocation + "\n"
				+ " L'anne de production : "+ this.anneeProduction;
		return s;
		
	}

	public int getPrixLocation() {
		return prixLocation;
	}
	
	
	

}
