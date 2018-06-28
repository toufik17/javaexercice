package idp.java.exercice8;

public class Test {
	public static void main(String[] args) {
		String[] phrase = { "amandine", "possede", "une", "petite", "lampe" };
		Paire<String> extremesString = minmax(phrase);
		System.out.println("min = " + extremesString.getPremier());
		System.out.println("max = " + extremesString.getDeuxième());
		
		Integer[] integers = { 6, 2, 3, 4, 5};
		Paire<Integer> extremesInteger = minmax(integers);
		System.out.println("min = " + extremesInteger.getPremier());
		System.out.println("max = " + extremesInteger.getDeuxième());
	}
	
	public static Paire<String> minmax(String[] chaines) {
		if (chaines == null || chaines.length == 0)
			return null;
		String min = chaines[0];
		String max = chaines[0];
		for (String chaine : chaines) {
			if (min.compareTo(chaine) > 0)
				min = chaine;
			if (max.compareTo(chaine) < 0)
				max = chaine;
		}
		return new Paire<String>(min, max);
	}
	
	public static Paire<Integer> minmax(Integer[] integers) {
		if (integers == null || integers.length == 0)
			return null;
		Integer min = integers[0];
		Integer max = integers[0];
		for (Integer entier : integers) {
			if (min.compareTo(entier) > 0)
				min = entier;
			if (max.compareTo(entier) < 0)
				max = entier;
		}
		return new Paire<Integer>(min, max);
	}
}
