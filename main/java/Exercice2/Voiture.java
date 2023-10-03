package Exercice2;

public class Voiture implements Vehicule {

    private String model;

    public Voiture(String model) {
        this.model = model;
    }

    public void accelerer() {
        System.out.println("Vroum vroum, la voiture accélère !");
    }
    public void ralentir() {
        System.out.println("Youpsi, je freine et je ralentis");
    }
    public void tournerAGauche() {
        System.out.println("Nioonnn, je tourne à gauche");
    }
    public void tournerADroite() {
        System.out.println("Clignotant et à droite !");
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "model='" + model + '\'' +
                '}';
    }
}
