package idp.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chaine {
	public static void main(String[] args) {
		String bonjour = "salut la compagnie";
		System.out.println(bonjour.toUpperCase());
		System.out.println(premiereMajuscule(bonjour));
		System.out.println(premiereMajusculeV2(bonjour));
		
	}

	static String premiereMajuscule(String chaine) {
		String resultat = "";
		boolean debutMotPossible = true;
		for (int i = 0; i < chaine.length(); i++) {
			if (chaine.charAt(i) != ' ' && debutMotPossible) {
				resultat += Character.toUpperCase(chaine.charAt(i));
				debutMotPossible = false;
			} else{
				resultat += chaine.charAt(i);
			}
			if (chaine.charAt(i) == ' '){
				debutMotPossible = true;
			}
		}
		return resultat;
	}
	
	static String premiereMajusculeV2(String chaine) {
		String[] chaines = chaine.split(" ");
		List<String> chainesL = Arrays.asList(chaines);
		List<String> chainesResulat = new ArrayList<>();

		chainesL.stream().forEach(s -> {
			chainesResulat.add(premiereMajusculeMot(s));
		});
		return String.join(" ", chainesResulat);
	}

	private static String premiereMajusculeMot(String s) {
		return Character.toUpperCase(s.substring(0, 1).charAt(0)) + s.substring(1);
	}
	
}
