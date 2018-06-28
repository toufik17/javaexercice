package employes;

public class Affichage {

	public static void main(String[] args) {
		
		Employe maxime = new Technicien("Maxime", 24, 10000, (byte) 3);
		System.out.println("Avant augmentation, avec prime");
		maxime.afficher();  

		System.out.println();	
		maxime.augmentation(359.6);	
		System.out.println("Après augmentation, avec prime");
		maxime.afficher();  
		
		System.out.println();
		
		Employe martin = new Cadre("Martin", 29, 2500, (byte) 2);
		System.out.println("Avant augmentation, avec prime");
		martin.afficher();  
		
		System.out.println();
		martin.augmentation(150.9);
		System.out.println("Après augmentation, avec prime");
		martin.afficher();  

	}

}
