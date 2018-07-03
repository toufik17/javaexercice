package idp.java.list;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;

public class Notes extends JFrame {
   private JFormattedTextField nouvelleNote = new JFormattedTextField(NumberFormat.getNumberInstance());
   private JCheckBox ordre = new JCheckBox("Dans l'ordre croissant");
   private JCheckBox présente = new JCheckBox("Déjà présente");
   private JLabel liste = new JLabel("[]");
   private JPanel panneau = new JPanel();
   private JToolBar barre = new JToolBar();
   private JLabel nombre = new JLabel("(Aucun)");

   public Notes() {
      super("Ensembles de notes et moyenne");      
      liste.setForeground(Color.RED);
      liste.setBorder(BorderFactory.createTitledBorder("Tableau de notes"));
      nombre.setForeground(Color.RED);
      nombre.setHorizontalAlignment(JLabel.CENTER);
      AbstractAction ajout = new AbstractAction("Ajout") {
         public void actionPerformed(ActionEvent e) {
            
         }
      };
      barre.add(ajout);
      barre.add(new AbstractAction("Suppression") {
         public void actionPerformed(ActionEvent e) {
            
         }
      });
      barre.add(new AbstractAction("Note présente ?") {
         public void actionPerformed(ActionEvent e) {
           
         }
      });
      nouvelleNote.setColumns(5);
      nouvelleNote.addActionListener(ajout);
      barre.addSeparator();
      barre.add(new JLabel("Calculs :  "));
      barre.add(nombre);
      add(barre, BorderLayout.NORTH);
      panneau.add(new JLabel("Nouvelle note : "));
      panneau.add(nouvelleNote);
      panneau.add(ordre);
      panneau.add(présente);
      présente.setEnabled(false);
      ordre.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             
         }
      });
      add(panneau);
      add(liste, BorderLayout.SOUTH);
      setSize(480, 135);
      setLocationRelativeTo(null);
      setResizable(false);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }
  

   public static void main(String[] args) { new Notes(); }
}