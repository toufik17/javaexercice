package idp.java;

public class Tableau {
	private static int[] tableau = new int[10];
	private static int nombre = 0;

	public static void main(String[] args) {
		int choix;
		do {
			switch (choix = optionMenu()) {
			case 1:
				if (nombre < 10)
					tableau[nombre++] = Clavier.lireInt("Valeur entière");
				else{
					System.out.println("Tableau rempli");
				}
				break;
			case 2:
				tableau[nombre--] = 0;
				break;
			case 3:
				afficherTableau();
				break;
			case 4:
				System.out.println("Le programme est terminé");
				break;
			default:
				System.out.println("La valeur introduite n'est pas valable");
			}
		} while (choix != 4);
	}

	private static int optionMenu() {
		System.out.println("Menu");
		System.out.println("--------");
		System.out.println("1 - Ajouter une valeur au tableau");
		System.out.println("2 - Enlever la dernière valeur");
		System.out.println("3 - Afficher le contenu du tableau");
		System.out.println("4 - Quitter\n");
		return Clavier.lireInt("Votre s�lection ?");
	}

	private static void afficherTableau() {
		System.out.print('<');
		for (int i = 0; i < nombre; i++) {
			System.out.print(tableau[i]);
			if ((i + 1) != nombre)
				System.out.print(", ");
		}
		System.out.println('>');
	}
}