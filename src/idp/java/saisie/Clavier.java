package idp.java.saisie;

import java.io.*;

/**
 *
 * <p><b>Titre : </b>Saisie à l'aide du clavier</p>
 * <p><b>Description :</b> Permet de récupérer des chaînes, des entiers, des réels
 * ou des caractères issus du clavier. Par ailleurs, chaque méthode envoie un message
 * d'invite à l'utilisateur. Toutefois, aucune vérification n'est réalisée lors de la
 * saisie pour contrôler si les types saisis correspondent à la méthode utilisée.</p>
 * @author toufik
 * @version 1.0
 */

public class Clavier {

  /**
   * Effectue la saisie d'une chaîne de caractères tapée au clavier.
   * @param <b>message</b> Message d'invite qui permet de guider l'utilisateur
   * sur les données attendues.
   * @return Chaîne de caractères issue du clavier.
   */
  public static String lireString(String message) {
    System.out.print(message+" : ");
    String lecture = "";
    try {
      lecture = new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
    catch (IOException erreur) { System.out.println("Problème à la saisie"); }
    return lecture;
  }

  /**
   * Effectue la saisie d'un entier tapée au clavier. <b><i>Attention toutefois,
   * utilisez bien la partie numérique du clavier. Aucun test n'est réalisé pour
   * contrôler le passage de caractères alphabétiques non prévus.
   * @param  <b>message</b> Message d'invite qui permet de guider l'utilisateur
   * sur les données attendues.
   * @return Valeur entière issue de la partie numérique du clavier.
   */
  public static int lireInt(String message) {
    return Integer.parseInt(lireString(message));
  }

  /**
   * Effectue la saisie d'un réel tapé au clavier. <b><i>Attention toutefois,
   * utilisez bien la partie numérique du clavier. Aucun test n'est réalisé pour
   * contrôler le passage de caractères alphabétiques non prévus.
   * @param  <b>message</b> Message d'invite qui permet de guider l'utilisateur
   * sur les données attendues.
   * @return Valeur réelle issue de la partie numérique du clavier.
   */
  public static double lireDouble(String message) {
    return Double.parseDouble(lireString(message));
  }

  /**
   * Effectue la saisie d'un seul caractère tapé au clavier. <b><i>Attention toutefois,
   * aucun test n'est réalisé pour
   * contrôler si vous tapez plusieurs caractères avant de valider.
   * @param  <b>message</b> Message d'invite qui permet de guider l'utilisateur
   * sur les données attendues.
   * @return Caractère issu du clavier.
   */
  public static char lireChar(String message) {
    return lireString(message).charAt(0);
  }
}