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
		super("Editeur de fichiers");
		add(boutons, BorderLayout.NORTH);
		add(new JScrollPane(editeur));
		editeur.setBackground(Color.YELLOW);
		boutons.add(new AbstractAction("Sélection du fichier") {
			public void actionPerformed(ActionEvent e) {
				if (selection.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					File fichier = selection.getSelectedFile();
					nomFichier.setText(fichier.getPath());
					try {
						editeur.read(new FileReader(fichier), null);
					} catch (FileNotFoundException ex) {
						nomFichier.setText("Fichier non trouvé");
					} catch (IOException ex) {
						nomFichier.setText("Problème de lecture dans le fichier");
					}
				}
			}
		});
		boutons.addSeparator();
		boutons.add(nomFichier);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Edition();
	}
}