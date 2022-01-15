package LocationVoitures;

import java.util.Iterator;

public class testLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agence a=new Agence();
		Voiture mercedesClassB=new Voiture("mercedes","class b",2015,500);
		Voiture mercedesClassC=new Voiture("mercedes","class c",2015,700);
		Voiture audi=new Voiture("audi", "A5", 2017, 400);
		
		a.add(audi);
		a.add(mercedesClassB);
		a.add(mercedesClassC);
		 
		Critere mercedes=new CritereMarque("mercedes");
		Critere prix500=new CriterePrix(500);
		
		InterCriteres criteres=new InterCriteres();
		criteres.add(mercedes);
		criteres.add(prix500);
		
		Client cl1=new Client("ABID","Salah Eddine", "BAB", "M");
		Client cl2=new Client("ElAlaoui", "Fadwa", "AAC", "Mlle");
		
		a.louerVoiture(cl1, audi);
		a.louerVoiture(cl2, mercedesClassB);
		
		Iterator<Voiture> it=a.voituresLouees();
		
		while (it.hasNext()) {
			 System.out.println(it.next());
			
		}
		
		//a.afficheSelection(criteres);
		//System.out.println(v);

	}

}
