package idp.java.exercice6;

public class Entier extends Affichable{
	private int x;
	
	public Entier(int x){
		this.x = x;
	}

	@Override
	public void afficher() {
		System.out.println("Je suite entier " + x);
	}
}
