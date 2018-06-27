package idp.java.exercice6;

public class Flottant extends Affichable{
	private float x;
	
	public Flottant(float x){
		this.x = x;
	}

	@Override
	public void afficher() {
		System.out.println("Je suite flottant " + x);
	}
}
