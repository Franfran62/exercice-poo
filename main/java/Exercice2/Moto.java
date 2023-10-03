package Exercice2;

public class Moto {

    public void accelerer() {
        System.out.println("Vroum vroum, la moto accélère !");
    }
    public void ralentir() {
        System.out.println("Je freine et je ralentis");
    }
    public void tournerAGauche() {
        System.out.println("Nioonnn, je tourne à gauche");
    }
    public void tournerADroite() {
        System.out.println("Nioonnn, je tourne à droite");
    }

    @Override
    public String toString() {
        return "Moto";
    }
}
