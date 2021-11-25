package com.naierabassi.jeu;
import javax.swing.JFrame;

public class Main {

    public static Scene scene;

    public static void main(String[] args) {

        //Création de la fenêtre de l'appli
        JFrame fenetre = new JFrame("Jeu mario");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(700, 360);
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);
        fenetre.setAlwaysOnTop(true);

        //Instantiation de l'object scene
        scene = new Scene();

        fenetre.setContentPane(scene); // On associe la scene à la fenêtre de l'application.
        fenetre.setVisible(true);

    }
}
