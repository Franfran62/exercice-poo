package Exercice4;

public class Triangle {

    private float coté;

    private float hauteur;

    public Triangle(float coté, float hauteur) {
        this.coté = coté;
        this.hauteur = hauteur;
    }

    public float getCoté() {
        return coté;
    }

    public void setCoté(float coté) {
        this.coté = coté;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public void calculerAir()
    {
        System.out.println("L'air est de : "+ ((this.coté * this.hauteur) / 2));
    }
}
