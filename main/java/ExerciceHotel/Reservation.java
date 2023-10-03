package ExerciceHotel;

import java.util.ArrayList;

public class Reservation {

    private static int count;
    private int id;
    private boolean statut;
    private String statutString;
    private ArrayList<Chambre> listeDeChambres;
    private Client client;

    public Reservation() {
        ++count;
        this.id = count;
        listeDeChambres = new ArrayList<Chambre>();
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setListeDeChambres(ArrayList<Chambre> listeDeChambres) {
        this.listeDeChambres = listeDeChambres;
    }

    public Client getClient() {
        return client;
    }

    public boolean isStatut() {
        return statut;
    }

    public ArrayList<Chambre> getListeDeChambres() {
        return listeDeChambres;
    }

    public void addChambreToBook(Chambre chambre) {
        this.listeDeChambres.add(chambre);
    }

    @Override
    public String toString() {

        if (statut){
            statutString = "en cours";
        } else {
            statutString = "terminé";
        }
        return "La réservation numéro " + id +
                " est " + statutString +
                ", elle concerne le client " + client +
                "et les chambres " + listeDeChambres.toString();
    }
}
