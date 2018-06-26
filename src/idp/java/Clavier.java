package idp.java;

import java.util.Scanner;

public class Clavier {


	public static int lireInt(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String lecture = "";
		lecture = sc.nextLine();
		while(! verifierEntier(lecture)){
			System.out.println("veuillez saisir un entier : ");
			lecture = sc.nextLine();
		}
		return Integer.parseInt(lecture);
	}

	private static boolean verifierEntier(String lecture) {
		try{
			int lectureInt = Integer.parseInt(lecture);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}	
	}
}