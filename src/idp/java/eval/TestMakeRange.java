package idp.java.eval;

public class TestMakeRange {

	public static void main(String[] args) {
		int limitinf = 0;
		int limitsup = 10;

		int[] tab = makeRange(limitinf, limitsup);

		afficher(tab);

	}

	private static void afficher(int[] tab) {
		System.out.print("[");
		int length = tab.length;
		for (int i = 0; i < length; i++) {
			if (i != length-1)
				System.out.print(tab[i] + " ");
			else
				System.out.print(tab[i]);
		}
		System.out.print("]");
	}

	private static int[] makeRange(int inf, int sup) {

		int tailleTab = sup - inf + 1;
		int[] tab = new int[tailleTab];
		for (int i = 0; i < tailleTab; i++) {
			tab[i] = inf + i;
		}

		return tab;
	}
}
