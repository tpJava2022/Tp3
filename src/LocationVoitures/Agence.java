package LocationVoitures;

import java.util.ArrayList;
import java.util.Iterator;

public class Agence {
	
	private ArrayList<Voiture> voitures;

	public Agence(ArrayList<Voiture> voitures) {
		this.voitures = voitures;
	}

	public Agence() {
		// TODO Auto-generated constructor stub
		voitures=new ArrayList<Voiture>();
	}
	
	public void add(Voiture v) {
		voitures.add(v);
	}
	
	public boolean remove(Voiture v) {
		return voitures.remove(v);
	}
	
	public Iterator<Voiture> selectionne(Critere c){
		Iterator<Voiture> iVoitures;
		ArrayList<Voiture> voituresSelected=new ArrayList<Voiture>();
		for(Voiture voiture:voitures) {
			
			if(c.estSatisfaitPar(voiture))
				voituresSelected.add(voiture);
			
		}
		iVoitures=voituresSelected.iterator();
		return iVoitures;
	}
	
	public void afficheSelection(Critere c) {
		Iterator<Voiture> it=this.selectionne(c);
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
