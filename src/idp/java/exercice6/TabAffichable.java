package idp.java.exercice6;

public class TabAffichable {

	public static void main(String[] args) {

		Affichable[] tab = new Affichable[3];
		tab[0] = new Entier(1);
		tab[1] = new Flottant(2f);
		tab[2] = new Entier(3);
		
		for(int i = 0; i<3 ;i++){
			tab[i].afficher();
		}
	}

}
