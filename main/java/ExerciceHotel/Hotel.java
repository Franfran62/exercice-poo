package ExerciceHotel;

import java.util.ArrayList;

public class Hotel {
    private String nom;
    private ArrayList<Chambre> chambres;

    private ArrayList<Client> clients;

    private ArrayList<Reservation> reservations;


    public Hotel() {
        chambres = new ArrayList<Chambre>();
        clients = new ArrayList<Client>();
        reservations = new ArrayList<Reservation>();

        for (int i = 0; i < ((Math.random() * (32 - 10)) + 10); i++) {
            chambres.add(new Chambre(true));
        }
    }
    public void setNom(String nom) {
            this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public ArrayList<Chambre> getChambres() {
        return chambres;
    }
    public ArrayList<Client> getClients() {
        return clients;
    }
    public void setClient(Client client) {
        this.clients.add(client);
    }
    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
    public Chambre getChambreToBook(int index) {
        return chambres.get(index - 1);
    }
    public void setNewReservation(Reservation reservation){
        this.reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservationsFromOneClient(Client client) {

        ArrayList<Reservation> response = new ArrayList<Reservation>();

        for (Reservation reservation: reservations) {
            if(reservation.getClient().getId() == client.getId())
            {
                response.add(reservation);
            }
        }

        return response;
    }
}
