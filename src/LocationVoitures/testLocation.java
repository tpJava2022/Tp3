package LocationVoitures;

import java.util.Iterator;
import java.util.Scanner;


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
		//a.louerVoiture(cl2, mercedesClassB);
		
		Iterator<Voiture> it=a.voituresLouees();
		
		while (it.hasNext()) {
			 System.out.println(it.next());
		}
		
		Scanner cl=new Scanner(System.in);
		//CA = Saisir_Chambre.saisir();
		//CB=new Chambre(1,300,99,'O');
		//CA=new Chambre(1,320,5,'L');
		while(true) {
			System.out.println("1.ajouter une voiture.");
			System.out.println("2.ajouter un client.");
			System.out.println("3.afficher criteres .");
			System.out.println("4.voitures louees.");
			System.out.println("5.retirer loueur.");
			System.out.println("6.quitter.");
			System.out.print("Saisissez un un choix : ");
			int choix=cl.nextInt();
			
			switch (choix) {
			case 1: {
				System.out.print("saisissez la marque:");
				String marque=cl.next();
				System.out.print("saisissez le model:");
				String model=cl.next();
				System.out.print("saisissez l'annee:");
				int annee=cl.nextInt();
				System.out.print("saisissez le prix:");
				int prix=cl.nextInt();
				
				a.add(new Voiture(marque, model, annee, prix));
				break;
			}
			case 2:{
				System.out.print("saisissez le nom:");
				String nom=cl.next();
				System.out.print("saisissez le prenom:");
				String prenom=cl.next();
				System.out.print("saisissez le cin:");
				String cin=cl.next();
				System.out.print("saisissez la civilite:");
				String civilite=cl.next();
				System.out.print("saisissez le critere marque:");
				String critereMarque=cl.next();
				System.out.print("saisissez le critere prix:");
				int criterePrix=cl.nextInt();
				
				InterCriteres c=new InterCriteres();
				c.add(new CritereMarque(critereMarque));
				c.add(new CriterePrix(criterePrix));
				
				Iterator<Voiture> itv=a.selectionne(c);
				if(itv.hasNext()) {
					a.louerVoiture(new Client(nom, prenom, cin, civilite), itv.next());
				}
				//chambres.suprimer(id);
				break;
			}
			case 3:{
				String critereMarque=cl.next();
				System.out.print("saisissez le critere prix:");
				int criterePrix=cl.nextInt();
				
				InterCriteres c=new InterCriteres();
				c.add(new CritereMarque(critereMarque));
				c.add(new CriterePrix(criterePrix));
				
				a.afficheSelection(c);
				//chambres.displayByCat(cat);
				break;
			}
			case 4:{
				Iterator<Voiture> itv=a.voituresLouees();
				if(itv.hasNext()) {
					System.out.println(itv.next());
				}
				break;
			}
			case 5:{
				System.out.print("saisissez le cin:");
				String cin=cl.next();
				Client client=a.getClient(cin);
				a.rendVoiture(client);
				break;
			}
			case 6:{
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choix);
			}
		}
		
		//a.afficheSelection(criteres);
		//System.out.println(v);

	}

}
