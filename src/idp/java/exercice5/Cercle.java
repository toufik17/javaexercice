package idp.java.exercice5;

class Cercle {
	private static final int rayon = 50;
	private Point centre;

	public Cercle(int x, int y) {
		centre = new Point(x, y);
	}

	public Cercle(Point centre) {
		this.centre = new Point(centre);
	}

	public Cercle(Cercle cercle) {
		this(new Point(cercle.centre));
	}

	public Cercle() {
		this(0, 0);
	}

	public void change(int x, int y) {
		centre.change(x, y);
	}

	public void change(Point centre) {
		this.centre.change(centre);
	}

	public boolean equals(Cercle c) {
		return centre.equals(c.centre);
	}

	public Point getCentre() {
		return new Point(centre);
	}
}
