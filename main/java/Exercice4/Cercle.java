package Exercice4;

public class Cercle extends Forme{

    private float rayon;

    public Cercle(float rayon) {
        this.rayon = rayon;
    }

    public float getRayon() {
        return rayon;
    }

    public void setRayon(float rayon) {
        this.rayon = rayon;
    }

    public void calculerAir()
    {
        System.out.println("L'air est de : "+ (Math.PI * (this.rayon * this.rayon)));
    }
}
