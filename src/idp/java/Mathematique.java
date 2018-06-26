package idp.java;

public class Mathematique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(paire(-18));
		System.out.println(impaire(-13));
		System.out.println(abs(-5.5));
	}

	private static double abs(double d) {
		return d < 0 ? -d : d ;
	}

	private static boolean impaire(int i) {
		return !paire(i);
	}

	private static boolean paire(int i) {
		return i%2 == 0;
	}

}
