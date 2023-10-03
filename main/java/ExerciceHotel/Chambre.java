package ExerciceHotel;

public class Chambre {

    private static int count;
    private int numero;
    private boolean statut;
    private String statutString;
    private int nombreDeLits;
    private float prix;


    public Chambre(boolean random) {
        ++count;
        if (random ==true)
        {
            this.numero = count;
            this.statut = true;
            this.nombreDeLits = (int) ((Math.random() * (4 - 1)) + 1);
            this.prix = (float) ((Math.random() * (40D - 1D)) + 1D);
        } else {
            this.numero = count;
            this.statut = false;
            this.nombreDeLits = (int) ((Math.random() * (4 - 1)) + 1);
            this.prix = (float) ((Math.random() * (40D - 1D)) + 1D);
        }
    }

    public Chambre(boolean statut, int nombreDeLits, float prix) {
        ++count;
        this.numero = count;
        this.statut = statut;
        this.nombreDeLits = nombreDeLits;
        this.prix = prix;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public int getNombreDeLits() {
        return nombreDeLits;
    }

    public void setNombreDeLits(int nombreDeLits) {
        this.nombreDeLits = nombreDeLits;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {

        if (statut){
            statutString = "libre";
        } else {
            statutString = "Occupé";
        }
        return "La chambre numéro " + numero +
                " est " + statutString +
                ", elle possède " + nombreDeLits + " lits, " +
                "son prix est de : " + prix + " euros";
    }
}
