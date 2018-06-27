package idp.java.exercice5;


class Point {
	private int x, y;

	public Point() {
	}

	public Point(int x, int y) {
		if (testValeurs(x, y)) {
			this.x = x;
			this.y = y;
		}
	}

	public Point(Point point) {
		if (testValeurs(point.x, point.y)) {
			x = point.x;
			y = point.y;
		}
	}

	public void change(int x, int y) {
		if (testValeurs(x, y)) {
			this.x = x;
			this.y = y;
		} else {
			this.x = 0;
			this.y = 0;
		}
	}

	public void change(Point point) {
		if (testValeurs(point.x, point.y)) {
			x = point.x;
			y = point.y;
		} else {
			this.x = 0;
			this.y = 0;
		}
	}

	public boolean testValeurs(int x, int y) {
		return x >= 0 && x <= 1000 && y >= 0 && y <= 1000;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean equals(Point p) {
		return x == p.x && y == p.y;
	}
}