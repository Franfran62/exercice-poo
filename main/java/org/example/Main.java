package org.example;

import Exercice1.CompteBancaire;
import Exercice2.Moto;
import Exercice2.Voiture;
import Exercice3.PrimaryColors;
import Exercice3.TestColors;
import Exercice4.Carré;
import Exercice4.Cercle;
import Exercice4.Triangle;
import ExerciceGenerique.Hangar;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

/*
        System.out.println("------------------------------------------------------------");
        CompteBancaire compte1 = new CompteBancaire( 100, "Franfran");
        CompteBancaire compte2 = new CompteBancaire( 500, "Franfran");
        System.out.println(compte1.toString());
        System.out.println(compte2.toString());

        compte1.verserArgent(200);
        compte1.afficherSolde();
        compte2.retirerArgent(500);
        compte2.retirerArgent(60);

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        Voiture voiture = new Voiture();
        voiture.accelerer();
        voiture.ralentir();
        voiture.tournerAGauche();
        voiture.tournerADroite();

        Moto moto = new Moto();
        moto.accelerer();
        moto.ralentir();
        moto.tournerAGauche();
        moto.tournerADroite();

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        TestColors melangeur = new TestColors();
        melangeur.melangerColors(PrimaryColors.BLEU, PrimaryColors.ROUGE);
        melangeur.melangerColors(PrimaryColors.BLEU, PrimaryColors.JAUNE);
        melangeur.melangerColors(PrimaryColors.JAUNE, PrimaryColors.BLEU);
        melangeur.melangerColors(PrimaryColors.JAUNE, PrimaryColors.JAUNE);

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        Cercle rond  = new Cercle(2.5F);
        rond.calculerAir();

        Triangle dorito = new Triangle(2.3F, 5F);
        dorito.calculerAir();

        Carré carrelage = new Carré(3.4F);
        carrelage.calculerAir();
*/

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        ArrayList<Voiture> voitures = new ArrayList<Voiture>();
        Voiture voiture1 = new Voiture("tesla");
        Voiture voiture2 = new Voiture("Renault");
        Voiture voiture3 = new Voiture("Ferrari");
        voitures.add(voiture1);
        voitures.add(voiture2);
        voitures.add(voiture3);

        Hangar<Voiture> hangar = new Hangar<Voiture>(voitures);
        System.out.println(hangar.getAll());
        System.out.println(hangar.toString());


    }
}
