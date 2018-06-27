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

<b>Attributs<b> : <br/>
Nom ; Age ; salaire.<br/>
Constructeurs : 
par défaut, 
par copie
avec trois paramètres

Méthodes :
Augmentation(…) ; 
toString() ; 
afficher() ; 
calculeSalaire() ;


Un technicien est décrit en plus par l’attribut : grade et la méthode prime( ) et la redéfinition de la méthode toString() et de la méthode calculeSalaire().
Si grade=1 alors Prime= 100
Si grade=2 alors Prime= 200
Si grade=3 alors Prime= 300

Travail à faire : 

1-      Ecrire la classe Employé.
2-      Ecrire la classe Technicien.
3-      Ecrire un programme qui saisie un employé puis un technicien et affiche leurs informations avant et après augmentation de leurs salaires.
