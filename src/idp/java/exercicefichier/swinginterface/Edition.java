package idp.java.exercicefichier.swinginterface;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Edition extends JFrame {
	
	
	private JFileChooser selection = new JFileChooser();
	private JToolBar boutons = new JToolBar("Choix du fichier texte");
	private JTextArea editeur = new JTextArea(30, 60);
	private JLabel nomFichier = new JLabel();

	public Edition() {
		
		// ajouter le nom de l'application
		super("Editeur de fichiers");
		
		// ajouter la tootbar dans la position nord
		add(boutons, BorderLayout.NORTH);
		
		// ajouter un zone de saisie avec un scorll
		add(new JScrollPane(editeur));
		
		// modifier la couleur du l'arrière plan de la zone de saisie
		editeur.setBackground(Color.YELLOW);
		
		// ajouter un bouton dans la toolbar
		boutons.add(new AbstractAction("Sélection du fichier") {
			
			// les instruction à executer après le clique sur le bouton Sélection du fichier
			public void actionPerformed(ActionEvent e) {
				if (selection.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					
					// recupérer le fichier selectionner dans un objet file
					File fichier = selection.getSelectedFile();
					
					// ajouter le nom du fichier dans le label dans la boolbar
					nomFichier.setText(fichier.getPath());
					try {
						
						// lire et affichier le contenu du fichier
						editeur.read(new FileReader(fichier), null);
					} catch (FileNotFoundException ex) {
						nomFichier.setText("Fichier non trouvé");
					} catch (IOException ex) {
						nomFichier.setText("Problème de lecture dans le fichier");
					}
				}
			}
		});

		// séparer les bouton dans la tool bar
		boutons.addSeparator();
		
		// ajouter le libellé dans la toolbar
		boutons.add(nomFichier);
		
		// calculer la taille de la fenêtre
		pack();
		
		// centrer l'affichage de la fenêtre
		setLocationRelativeTo(null);
		// activer la fermiture par default de l'appli
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// afficher l'appli en premier plan
		setVisible(true);
	}

	public static void main(String[] args) {
		new Edition();
	}
}