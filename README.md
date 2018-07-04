# javaexercice
Exercice 1 - Chaine.java :

Soit la déclaration suivante dans la méthode main :
String bonjour = "salut la compagnie";
Continuer le programme pour que le message bonjour s'affiche en majuscule.
Compléter le programme en ajoutant une méthode qui permet de mettre uniquement la première lettre de chaque mot d'une chaîne de caractères en majuscule. Vous testerez cette méthode avec la chaîne bonjour.

Exercice 2 - InformationsSysteme.java :

A l'aide de la classe System, réalisez un programme qui affiche le nom de l'utilisateur et le nom du système d'exploitation utilisés sur l'ordinateur où se trouve le programme.

Exercice 3 - Mathematique.java

Construire une classe Mathématique qui comporte plusieurs méthodes, savoir :<br/>
une fonction impaire, prend un entier en paramètre<br/>
une fonction paire ( relative à la fonction impaire )<br/>
une fonction valeur absolue, prend un double en paramètre<br/>

Exercice 4 - Tableau.java

Faire un programme convivial (à l'aide d'un menu sommaire) qui permet de compléter un tableau d'entier de 10 cases, d'afficher son contenu, d'enlever des valeurs (le menu comporte 4 options :<br/>
ajouter une valeur,<br/>
enlever le dernière valeur,<br/>
afficher le contenu du tableau<br/>
et quitter le programme.<br/>
Au départ le tableau doit être vide. L'affichage lorsqu'il est demandé doit être sous la forme de, par exemple <5, 3> (on remarque dans cet affichage que le tableau dispose de deux valeurs entières respectivement 5 et 3). Il faut protéger votre programme par les malversation de l'utilisateur, en effet il ne doit pas y avoir plus de dix valeurs dans le tableau même si l'opérateur, sans le faire exprès, veut en rajouter d'autre.

Exercice 5 - TestFormes.java

Vous allez construire une classe qui représente un point. Chaque instance (objet) de cette classe appelée Point possède 2 attributs privés x et y qui représente la coordonnée du point. A la création du point il est possible de fixer les coordonnées ou pas. Si on fixe les coordonnées, il faut que se soit à l'aide d'un point déjà existant ou alors en donnant les valeurs séparées de x et de y. Dans le cas où on ne fixe pas de coordonnées, cela correspond au point se situant à l'origine des axes. Prévoyez deux méthodes(surdéfinies) change qui permettent de modifier les coordonnées du point, soit en donnant les nouvelles valeurs de x et de y, soit en donnant un nouveau point. De plus, prévoyer deux méthodes qui permettent de récupérer la valeur d'un attribut, avec respectivement : getX qui renvoie la valeur de x et getY qui renvoie la valeur de y. Enfin, prévoyez une méthode equals qui détermine si les coordonnées du point passé en argument est égal aux coordonnées du point qui exécute la méthode. Le résultat du test est renvoyé par la méthode. Attention les coordonnées devront toujours être testées. Les valeurs possibles pour x et pour y doivent être comprises entre 0 et 1000. Si on dépasse ces valeurs, le point résultant deviendra le point origine. Ce principe sera vrai pour les classes suivantes Cercle et Carré.

Pour chacune de ces méthodes, vous déterminerez les types à utiliser. Vous testerez ce programme, par le rajout d'une classe principale avec sa méthode principale.

Construire une classe Cercle qui dispose de 2 attributs : d'une part, l'attribut centre (de type Point) qui fixe les coordonnées du centre du cercle, d'autre part, l'attribut rayon qui aura toujours une valeur fixe de 50. Plusieurs types de création seront possible, soit par rapport à un point, soit par rapport aux coordonnées séparées, soit par rapport à un autre cercle ou soit sans aucune précision en sachant que le cercle se trouvera alors à l'origine. A l'exemple de la classe Point, prévoyez 2 méthodes surdéfinies change qui permettent de modifier les coordonnées du centre du cercle. De même prévoyez une méthode equals qui permet de contrôler si les deux cercles possèdent les mêmes attributs. Enfin, prévoyez une méthode getCentre qui renvoie un point représentant les coordonnées du centre du cercle. Attention, il ne faut pas que la modification éventuelle des coordonnées de ce point à l'extérieur de la classe Cercle ait une répercussion sur l'attribut centre de cette même classe. Vous rajouterez cette classe sur le programme précédent.
Pour terminer, contruisez une classe Carré qui possède également deux attributs : d'une part l'attribut centre qui est identique à Cercle, d'autre part, l'attribut côté qui a une valeur par défaut de 50, mais il est possible de fixer une autre valeur à la construction, par contre une fois que la valeur est donnée, il n'est plus possible de la modifier. Prévoyez tous les types de constructeurs. Les constructeurs seront les seules méthodes de votre classe.

Exercice 6 - Tab.java

Soit une classe abstraite nommée Affichable, dotée d'une seule méthode abstraite affiche(). Deux classes Entier et Flottant dérivent de cette classe. La méthode main() utilise un tableau hétérogène d'objets de type Affichable qu'elle remplit en instanciant des objets de type Entier et Flottant.


Exercice 7 - TestEmploye

Dans une société, un employé est décrit par les membres suivants :

<b>Attributs : </b><br/>
<ul>
  <li>Nom ; Age ; salaire.</li>
</ul>
<b>Constructeurs :</b> 
<ul>
  <li>par défaut, </li>
  <li> par copie</li>
  <li>avec trois paramètres</li>
 </ul>

<b>Méthodes :</b><br/>
<ul>
  <li>Augmentation(…) ; </li>
  <li>afficher() ; </li>
  <li>calculeSalaire() ;</li>
 </ul>

Un technicien est décrit en plus par l’attribut : grade et la méthode prime( ) et la redéfinition de la méthode calculeSalaire().<br/>
<ul>
  <li>Si grade=1 alors Prime= 100</li>
  <li>Si grade=2 alors Prime= 200</li>
  <li>Si grade=3 alors Prime= 300</li>
 </ul>

Travail à faire : <br/>
<ul>
  <li>1-      Ecrire la classe Employé.
</li>
  <li>2-      Ecrire la classe Technicien.</li>

  <li>3-      Ecrire un programme qui saisie un employé puis un technicien et affiche leurs informations avant et après augmentation de leurs salaires.
</li>
 </ul>
 
Exercice 8 - 

Paire est classe générique avec deux attributs, premier et deuxieme. Les deuxs attributs utilisent des variables de type <br/>
T premier;
T deuxieme;
C'est celui qui utilisera cette classe qui spécifiera le type qu'il désire utiliser pour décrire l'objet de cette classe Paire.

Faire un programme qui met en oeuvre la classe Paire. La méthode minmax() statique parcourt un tableau de chaînes de caractères et calcule en même temps la valeur minimale et la valeur maximale. Elle utilise un objet Paire pour renvoyer les deux résultats.<br/>
Appliquer le même programme sur un tableau d'entiers.

Souvenez-vous que la méthode compareTo() compare deux chaînes et renvoie 0 si les deux chaînes sont identiques, un entier négatif si la première chaîne vient avant la seconde dans l'ordre alphabétique et un entier positif dans les autres cas.


Exercice 9 :

Soit les deux classes d'exception E1 et E2

 <pre><code>public class E1 extends Exception {
     public E1(String mess) {
         super(mess);
     }
 }</code></pre>
 <pre><code>public class E2 extends Exception {
     public E2(String mess) {
         super(mess);
     }
 }
</code></pre>
et la classe suivante

<code><pre>
  /**
  * Programme de test pour ?tudier le m?canisme d'exceptions
  */
 public class TraceException {
     private double x;
     
     /** Creates a new instance of TraceException */
     public TraceException(double x) {
         this.x = x;
    }
    
    public double getX() {
        return x;
    }
    
    public void m1(double y) throws E1,E2 {
        System.out.println("D?but de m1");
        if (y == 0)
            throw new E1("parametre de m1 null");
        if (x * y < 0)
            throw new E2("parametre de signe oppos? ? l'attribut");
        x = x / y;
        System.out.println("Fin de m1");
    }
    
    public void m2(double y) throws E1 {
        System.out.println("D?but de m2");
        try {
            System.out.println("Dans m2 avant appel de m1");
            m1(y);<br/>
            System.out.println("Dans m2 apres appel de m1");
        }
        catch (E2 excpt) {
            System.out.println(excpt.getMessage());
        }
         System.out.println("Fin de m2");
     }
     
     public static void main(String[] args) throws E1 {
         System.out.println("Debut du main");
         TraceException te = new TraceException(Double.parseDouble(args[0]));
         te.m2(Double.parseDouble(args[1]));
         System.out.println("x = " + te.getX());
         System.out.println("Fin du main");
     }
 }
</code></pre>


Question : Donnez l'affichage produit sur la console pour chacune des exécutions suivantes :

a) java TraceException 10 2<br/>
b) java TraceException 10 -2<br/>
c) java TraceException 10 0<br/>

Exercice 10 - TestMakeRange.java

Définir une méthode appelée makeRange() dans une classe TestMakeRange qui admet deux entiers, une limite inférieure et une limite supérieure, et crée un tableau qui contient tous les entiers compris entre ces deux entiers (à l'inclusion des deux limites). Par exemple, lorsque j'écris ceci :
makeRange(3, 7); le résultat doit-être : [ 3 4 5 6 7 ]

Exercice 11 - exercicefichier

Manipulation des fichiers

Exercice 12 - 

Exercice sur les collections en JAVA

<lu>
<li>	Créer une ArrayList de 4 pays. (le pays est de type String)</li>
<li>	Afficher la taille de votre liste en annonçant combien de pays elle contient.</li>
<li>	Afficher la liste de pays (Essayer d’en faire une méthode et de l’appeler dans votre programme).</li>
<li>	Effacer votre liste, affichez la à nouveau.</li>
<li>	Remplir à nouveau votre liste de 4 pays.</li>
<li>	Vérifier si un pays fait partie de la liste et afficher si il existe ou pas.</li>
<li>	Classer et afficher votre liste par ordre alphabétique</li>
</lu>

<br/>Exercice 13- List avec interface swing

je vous porpose de mettre en oeuvre une application qui permet de recenser l'ensemble des notes à prendre en compte pour calculer une moyenne, ansi que de connaître automatiquement, la note la plus haute, la plus basse, etc.

![img](https://github.com/toufik17/javaexercice/blob/master/src/idp/java/listswing/Capture.JPG)

<pre>
<code>
private JFormattedTextField nouvelleNote = new JFormattedTextField(NumberFormat.getNumberInstance());
</pre>
</code>

<br/> Exercice 14 - manipulation des map

<br/> Exercice 15 - Collection

__Question 1__

On considère la classe Carte :
<pre>
<code>
package cartes;

public class Carte {
	// NOTE : commencez par modifer ce code pour utiliser un enum afn de
	// représenter la
	// couleur.
	public static final String PIQUE = "pique";
	public static final String TREFLE = "trefe";
	public static final String COEUR = "coeur";
	public static final String CARREAU = "carreau";
	public static final String[] couleurs = { PIQUE, TREFLE, COEUR, CARREAU };
	private int valeur;
	private String couleur;

	public Carte(int valeur, String couleur) {
		this.valeur = valeur;
		this.couleur = couleur;
	}

	public int getValeur() {
		return valeur;
	}

	public String getCouleur() {
		return couleur;
	}

	@Override
	public String toString() {
		return "" + valeur + " de " + couleur;
	}
}
</pre>
</code>

Tester le programme suivant :

<pre>
<code>
import java.util.ArrayList;

public class TestCartes0 {
	public static void main(String[] args) {
		ArrayList\<Carte\> cartes = new ArrayList\<Carte\>();
		cartes.add(new Carte(10, Carte.CARREAU));
		cartes.add(new Carte(1, Carte.COEUR));
		if (cartes.contains(new Carte(10, Carte.CARREAU))) {
			System.out.println("Le jeu contient le 10 de carreau");
		} else {
			System.out.println("Le jeu ne contient pas le 10 de carreau");
		}
	}
}
</pre>
</code>

</br>
Quel résultat donne-t-il ? Pourquoi ?

__Question 2__

Ajouter à la classe Carte les méthodes equals et hashcode. Tester la classe.

__Question 3__

Remplacez l'ArrayList par un HashSet.

Ajouter 3 cartes :
</br>cartes.add(new Carte(10, Carte.CARREAU));
</br>cartes.add(new Carte(10, Carte.CARREAU));
</br>cartes.add(new Carte(1, Carte.COEUR));

