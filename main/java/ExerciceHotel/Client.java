package ExerciceHotel;

public class Client {

    private static int count;
    private int id;

    private String nom;
    private String prenom;

    private int numeroDeTelephone;

    public Client(String nom, String prenom, int numeroDeTelephone) {
        ++count;
        this.id = count;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public Client() {
        ++count;
        this.id = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(int numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    @Override
    public String toString() {
        return "Client { numéro = " + id + ", nom = " + nom + ", prenom = " + prenom + '}';
    }
}
