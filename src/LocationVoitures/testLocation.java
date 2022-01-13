package LocationVoitures;

public class testLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agence a=new Agence();
		Voiture mercedesClassB=new Voiture("mercedes","class b",2015,500);
		Voiture mercedesClassC=new Voiture("mercedes","class c",2015,500);
		Voiture audi=new Voiture("audi", "A5", 2017, 400);
		
		a.add(audi);
		a.add(mercedesClassB);
		a.add(mercedesClassC);
		//A extends B
		// B b=new A(); 
		Critere mercedes=new CritereMarque("mercedes");
		
		a.afficheSelection(mercedes);
		//System.out.println(v);

	}

}
