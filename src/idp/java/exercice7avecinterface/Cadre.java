package idp.java.exercice7avecinterface;

public class Cadre implements Employe {
	
	private String nom;
	private int age;
	private double salaire;
	private byte gradeCadre;

	
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

	public byte getGradeCadre() {
		return gradeCadre;
	}
	
	public void setGradeCadre(byte grade) {
		if (grade > 0 && grade <=3) {
			this.gradeCadre = grade;
		}
		else {
			this.gradeCadre = 1;
		}
	}
	
	
	public Cadre() {
		this.nom = "";
		this.age = 0;
		this.salaire = 0;
		this.gradeCadre = 1;
	}

	public Cadre(Cadre t2) {
		this.nom = t2.getNom();
		this.age = t2.getAge();
		this.salaire = t2.getSalaire();
		this.gradeCadre = t2.getGradeCadre();
	}

	public Cadre(String nom, int age, double salaire, byte gradeTechnicien) {
		this.nom = nom;
		this.age = age;
		this.salaire = salaire;
		if (gradeTechnicien > 0 && gradeTechnicien <=3) {
			this.gradeCadre = gradeTechnicien;
		}
		else {
			this.gradeCadre = 1;
		}
	}
	
	
	public void augmentation(double augment) {
		this.salaire += augment;
	}
	
	public void afficher() {
		System.out.println("Voici l'âge, le salaire et le grade de " + this.nom );
		System.out.println("Âge : " + this.age);
		System.out.println("Salaire : " + calculeSalaire());
		System.out.println("Grade : " + this.gradeCadre);
	}
	
	private double primeCadre() {
		if (this.gradeCadre == 1) {  // OU switch
			return 500;
		}
		else if (this.gradeCadre == 2) {
			return 1000;
		}
		else {
			return 1500;
		}
	}
	
	public double calculeSalaire() {
		return this.salaire + primeCadre();  
	}	

}
