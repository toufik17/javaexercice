package idp.java.exomap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapListeNotes {

	public static void main(String[] args) {

		Map<String, List<Integer>> notes = new HashMap<String, List<Integer>>();
		addAssociation(notes, "Jean", 5, 6, 12, 8, 9);
		addAssociation(notes, "Ludo", 7, 3, 13, 6, 7);
		addAssociation(notes, "Manu", 15, 16, 2, 18, 3);
		printMap(notes);

	}

	private static void printMap(Map<String, List<Integer>> map) {
		for (Entry<String, List<Integer>> entry : map.entrySet()) {
			System.out.println("Voici les notes de " + entry.getKey() + " : " + entry.getValue().toString());
		}
	}

	private static void addAssociation(Map<String, List<Integer>> map, String nom, Integer note1, Integer note2,
			Integer note3, Integer note4, Integer note5) {
		List<Integer> listeNotes = new ArrayList<Integer>();
		listeNotes = Arrays.asList(note1, note2, note3, note4, note5);
		map.put(nom, listeNotes);
	}
}