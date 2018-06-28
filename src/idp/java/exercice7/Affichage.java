package idp.java.exercice7;

public class Affichage {

	public static void main(String[] args) {
		
		Employe maxime = new Employe("Maxime", 24, 10000);
		maxime.augmentation(359.6);
		maxime.afficher();
		
		System.out.println();
		
		Employe martin = new Technicien("Martin", 29, 2500,(byte) 2);
		martin.augmentation(400);
		System.out.println("Le salaire avec prime de " + martin.getNom() + " est de : " + martin.calculeSalaire());
		martin.afficher();  // salaire avant prime
		martin.setSalaire(martin.calculeSalaire());
		martin.afficher();  // salaire après primer

	}

}
