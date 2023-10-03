package Exercice4;

public class Carré extends Forme {

    private float coté;

    public Carré(float coté) {
        this.coté = coté;
    }

    public float getCoté() {
        return coté;
    }

    public void setCoté(float coté) {
        this.coté = coté;
    }

    public void calculerAir() {
        System.out.println("L'air est de : "+ (this.coté * this.coté));
    }
}
