package idp.java.exercice5;

public class TestFormes {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.change(5, 5);
		System.out.println("coordonne du point p1 = (" + p1.getX() + "," +p1.getY()+")");
		Point p2 = new Point(5, 4);
		System.out.println("coordonne du point p2 = (" + p2.getX() + "," +p2.getY()+")");
		p2.change(p1);
		System.out.println("coordonne du point p2 = (" + p2.getX() + "," +p2.getY()+")");

		boolean test = p1.equals(p2);
		System.out.println("p1 egale p2 : " + test);

		Cercle c1 = new Cercle(p1);
		p2 = c1.getCentre();
		p2.change(10, 10);
		p1.change(3, -5);
		Carre ca1 = new Carre(p1, 75), ca2 = new Carre(ca1, 32), ca3 = new Carre(ca2);
	}
}