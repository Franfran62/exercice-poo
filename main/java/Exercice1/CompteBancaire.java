package Exercice1;

public class CompteBancaire {
    private int numeroDeCompte;
    private float solde;
    private String titulaireDuCompte;

    static public int count;


    public CompteBancaire(float solde, String titulaireDuCompte) {
        ++count;
        this.numeroDeCompte = count;
        this.solde = solde;
        this.titulaireDuCompte = titulaireDuCompte;

    }

    public int getNumeroDeCompte() {
        return numeroDeCompte;
    }

    public void setNumeroDeCompte(int numeroDeCompte) {
        this.numeroDeCompte = numeroDeCompte;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public String getTitulaireDuCompte() {
        return titulaireDuCompte;
    }

    public void setTitulaireDuCompte(String titulaireDuCompte) {
        this.titulaireDuCompte = titulaireDuCompte;
    }

    public void verserArgent(float argent) {
        this.solde = this.solde + argent;
        System.out.println("Vous avez versé "+argent+" euros sur votre compte.");
        System.out.println("Votre nouveau solde est de : "+this.solde+" euros");
    }

    public void retirerArgent(float argent) {
        if (this.solde >= argent) {
            this.solde = this.solde - argent;
            System.out.println("Vous avez prélevé "+argent+" euros sur votre compte.");
            System.out.println("Votre nouveau solde est de : "+this.solde+ " euros");
        } else {
            System.out.println("Vous n'avez pas assez de fonds pour retirer " + argent + " euros");
        }
    }

    public void afficherSolde() {
        System.out.println("Votre solde est de "+this.solde+" euros");
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "numeroDeCompte=" + numeroDeCompte +
                ", solde=" + solde +
                ", titulaireDuCompte='" + titulaireDuCompte + '\'' +
                '}';
    }
}
