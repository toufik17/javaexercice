package idp.java.exercice8;

class Paire<T> {
	private T premier;
	private T deuxième;

	public Paire() {
		premier = null;
		deuxième = null;
	}

	public Paire(T premier, T deuxième) {
		this.premier = premier;
		this.deuxième = deuxième;
	}

	public T getPremier() {
		return this.premier;
	}

	public void setPremier(T premier) {
		this.premier = premier;
	}

	public T getDeuxième() {
		return this.deuxième;
	}

	public void setDeuxième(T deuxième) {
		this.deuxième = deuxième;
	}
}