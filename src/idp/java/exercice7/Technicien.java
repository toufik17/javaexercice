package idp.java.exercice7;

public class Technicien extends Employe {
	
	private int grade;

	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		if (grade > 0 && grade <=3) {
			this.grade = grade;
		}
		else {
			this.grade = 1;
		}
	}

	
	public Technicien() {
		super();
		this.grade = 1;
	}

	public Technicien(Employe e2) {
		super(e2);
		this.grade = 1;
	}

	public Technicien(String nom, int age, double salaire, int grade) {
		super(nom, age, salaire);
		if (grade > 0 && grade <=3) {
			this.grade = grade;
		}
		else {
			this.grade = 1;
		}
	}
	
	
	private double prime() {
		if (this.grade == 1) {  // OU switch
			return 100;
		}
		else if (this.grade == 2) {
			return 200;
		}
		else {
			return 300;
		}
	}
	
	public double calculeSalaire() {
		return super.getSalaire() + prime(); 
	}	

}
