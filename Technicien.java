package employes;

public class Technicien implements Employe {
	
	private String nom;
	private int age;
	private double salaire;
	private byte gradeTechnicien;

	
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

	public byte getGradeTechnicien() {
		return gradeTechnicien;
	}
	
	public void setGradeTechnicien(byte grade) {
		if (grade > 0 && grade <=3) {
			this.gradeTechnicien = grade;
		}
		else {
			this.gradeTechnicien = 1;
		}
	}
	
	
	public Technicien() {
		this.nom = "";
		this.age = 0;
		this.salaire = 0;
		this.gradeTechnicien = 1;
	}

	public Technicien(Technicien t2) {
		this.nom = t2.getNom();
		this.age = t2.getAge();
		this.salaire = t2.getSalaire();
		this.gradeTechnicien = t2.getGradeTechnicien();
	}

	public Technicien(String nom, int age, double salaire, byte gradeTechnicien) {
		this.nom = nom;
		this.age = age;
		this.salaire = salaire;
		if (gradeTechnicien > 0 && gradeTechnicien <=3) {
			this.gradeTechnicien = gradeTechnicien;
		}
		else {
			this.gradeTechnicien = 1;
		}
	}
	
	
	public void augmentation(double augment) {
		this.salaire += augment;
	}
	
	public void afficher() {
		System.out.println("Voici l'âge, le salaire et le grade de " + this.nom );
		System.out.println("Âge : " + this.age);
		System.out.println("Salaire : " + calculeSalaire());
		System.out.println("Grade : " + this.gradeTechnicien);
	}
	
	private double primeTechnicien() {
		if (this.gradeTechnicien == 1) {  // OU switch
			return 100;
		}
		else if (this.gradeTechnicien == 2) {
			return 200;
		}
		else {
			return 300;
		}
	}
	
	public double calculeSalaire() {
		return this.salaire + primeTechnicien();  
	}	

}
