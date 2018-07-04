package idp.java.exomap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapNote {

	public static void main(String[] args) {

		Map<String, Integer> note = new HashMap<String, Integer>();
		addAssociation(note, "Jean", 10);
		addAssociation(note, "Ludo", 6);
		addAssociation(note, "Manu", 7);
		addAssociation(note, "Ludo", 8); // ceci écrase la première association
											// de Ludo
		printMap(note);

	}

	private static void printMap(Map<String, Integer> notes) {
		for (Entry<String, Integer> entry : notes.entrySet()) {
			System.out.println("Voici la note de " + entry.getKey() + " : " + entry.getValue());
		}
	}

	private static void addAssociation(Map<String, Integer> notes, String nom, Integer note) {
		notes.put(nom, note);
	}
}