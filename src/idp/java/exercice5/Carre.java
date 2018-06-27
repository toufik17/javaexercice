package idp.java.exercice5;

class Carre {
	private final int cote;
	private Point centre;

	public Carre(int x, int y) {
		this(x, y, 50);
	}

	public Carre(int x, int y, int cote) {
		this.cote = cote;
		centre = new Point(x, y);
	}

	public Carre(Point centre) {
		this(centre, 50);
	}

	public Carre(Point centre, int cote) {
		this.cote = cote;
		this.centre = new Point(centre);
	}

	public Carre(Carre Carre) {
		this(Carre, 50);
	}

	public Carre(Carre Carre, int cote) {
		this(new Point(Carre.centre), cote);
	}

	public Carre() {
		this(0, 0, 50);
	}
}