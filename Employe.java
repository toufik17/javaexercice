package employes;

public class Employe {
	
	private String nom;
	private int age;
	private double salaire;  
  
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
	public Employe(String nom, int age, double salaire) {
		this.nom = nom;
		this.age = age;
		this.salaire = salaire;
	}
	
	public Employe() {
		this.nom = "";
		this.age = 0;
		this.salaire = 0;
	}
	
	public Employe(Employe e2) {
		this.nom = e2.getNom();
		this.age = e2.getAge();
		this.salaire = e2.getSalaire();
	}
	
	
	public void augmentation(double augment) {
		this.salaire += augment;
	}
	
	public void afficher() {
		System.out.println("Voici l'âge et le salaire de " + this.nom );
		System.out.println("Âge : " + this.age);
		System.out.println("Salaire : " + this.salaire);
	}
	
	public double calculeSalaire() {
		return this.salaire;
	}
		
}
