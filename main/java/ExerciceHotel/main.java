package ExerciceHotel;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);

    static Hotel hotel = new Hotel();

    public static void main(String[] args) {

        System.out.println("Bienvenue dans le logiciel de gestion de votre Hotêl");
        System.out.println("Pour commencer, entrez un nom votre hotêl");
        hotel.setNom(scanner.next());
        System.out.println("-----------------------------------------");
        System.out.println("Bienvenue dans l'hotel "+ hotel.getNom());
        System.out.println("Voici un listing des chambres : ");
        for (Chambre chambre:hotel.getChambres())
        {
            System.out.println(chambre);
        }

        System.out.println();
        Menu();
    }
    public static void Menu() {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("-------------------MENU------------------");
        System.out.println("-----------------------------------------");
        System.out.println();

        System.out.println("1. Ajouter un client");
        System.out.println("2. Prendre une réservation");
        System.out.println("3. Voir la liste de chambre");
        System.out.println("4. Voir les réservations");
        System.out.println("5. Voir les réservations d'un client");
        System.out.println("6. Sortir");

        switch (scanner.next())
        {
            case "1" : ajouterUnClient();
                break;
            case "2" : prendreUneReservation();
                break;
            case "3" : voirLesChambres();
                break;
            case "4" : voirLesReservations();
                break;
            case"5" : voirLesReservationsDunClient();
                break;
            case "6" : leave();
                break;

            default: Menu();
        }
    }
    public static void ajouterUnClient() {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("-----------AJOUT D'UN CLIENT-------------");
        System.out.println("-----------------------------------------");
        System.out.println();

        Client client = new Client();
        System.out.println("Veuillez entrer un nom");
        client.setNom(scanner.next());

        System.out.println("Veuillez entrer un prénom");
        client.setPrenom(scanner.next());

        System.out.println("Entrez un numéro de téléphone");
        client.setNumeroDeTelephone(scanner.nextInt());

        hotel.setClient(client);
        System.out.println("Félicitation ! Le client à bien été créé !");

        Menu();
    }
    public static void prendreUneReservation() {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("--------------RESERVATION----------------");
        System.out.println("-----------------------------------------");
        System.out.println();

        Reservation reservation = new Reservation();
        reservation.setStatut(true);

        System.out.println("Voici les chambres libres");
        System.out.println();

        for (Chambre chambre:hotel.getChambres())
        {
            if (chambre.isStatut())
            {
                System.out.println(chambre);
            }
        }
        System.out.println("------------PARTIE CHAMBRES--------------");
        System.out.println("-----------------------------------------");
        System.out.println("Combien de chambres voulez-vous affecter à cette réservation ?");

        int j = scanner.nextInt();

        for (int i = 1; i <= j; i++) {
            System.out.println();
            System.out.println("Quelle chambre voulez-vous affecter ?");
            System.out.println("Entrez son numéro :");

            Chambre chambreToBook = hotel.getChambreToBook(scanner.nextInt());
            reservation.addChambreToBook(chambreToBook);
        }
        System.out.println();
        System.out.println("Vous avez ajouté "+ j + " chambre(s) à votre réservation");
        System.out.println("Il s'agit des suivantes : ");

        for (Chambre chambrebooked: reservation.getListeDeChambres())
        {
            System.out.println(chambrebooked.toString());
            chambrebooked.setStatut(false);
        }
        System.out.println();
        System.out.println("--------------PARTIE CLIENT--------------");
        System.out.println("-----------------------------------------");

        System.out.println("Il faut désormais attribuer un client à la réservation");
        System.out.println("Voici la liste de clients de l'hotel "+ hotel.getNom());

        if (hotel.getClients().isEmpty())
        {
            System.out.println("ERROR------------------------------------");
            System.out.println("Oups, vous n'avez aucun client");
            System.out.println("Vous allez devoir recommencer");
            System.out.println("Nous allons vous rediriger pour créer un client");
            System.out.println("REDIRECTION-------------------------------");
            ajouterUnClient();
            return;
        }
            for (Client client: hotel.getClients()) {
                System.out.println(client);
            }

        System.out.println("Selectionner le client que vous souhaitez affecter");
        System.out.println("Entrez son numéro");
        reservation.setClient(hotel.getClients().get(scanner.nextInt() -1));

        hotel.setNewReservation(reservation);

        System.out.println();
        System.out.println("Votre reservation à bien été pris en compte !");
        Menu();
    }
    public static void voirLesChambres() {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("--------------LES CHAMBRES---------------");
        System.out.println("-----------------------------------------");
        System.out.println();

        for (Chambre chambre: hotel.getChambres())
        {
            System.out.println(chambre.toString());
        }

        Menu();
    }
    public static void voirLesReservations() {

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("------------LES RESERVATIONS-------------");
        System.out.println("-----------------------------------------");
        System.out.println();

        if (hotel.getReservations().isEmpty())
        {
            System.out.println("Il n'y a aucune réservation");
            Menu();
            return;
        }



        for (Reservation reservation: hotel.getReservations())
        {
            System.out.println(reservation.toString());
        }

        Menu();
    }
    public static void voirLesReservationsDunClient() {

        if (hotel.getClients().isEmpty()) {
            System.out.println("ERROR------------------------------------");
            System.out.println("Oups, vous n'avez aucun client");
            System.out.println("Vous allez devoir recommencer");
            System.out.println("Nous allons vous rediriger pour créer un client");
            System.out.println("REDIRECTION-------------------------------");
            ajouterUnClient();
            return;
        }

        System.out.println();
        System.out.println("--------------PARTIE CLIENT--------------");
        System.out.println("-----------------------------------------");

        System.out.println();
        System.out.println("Il faut d'abord selectionner un client !");
        System.out.println("Voici la liste de clients de l'hotel : ");

        for (Client client: hotel.getClients())
        {
            System.out.println(client);
        }

        System.out.println("Selectionner le client que vous souhaitez affecter");
        System.out.println("Entrez son numéro");

        Client clientCourant = hotel.getClients().get(scanner.nextInt() -1);
        ArrayList<Reservation> reservationsFromOneClient =  hotel.getReservationsFromOneClient(clientCourant);

        System.out.println();
        System.out.println("------------SES RESERVATIONS-------------");
        System.out.println("-----------------------------------------");
        System.out.println();

        System.out.println("Voici les réservations de votre client");

        for (Reservation oneReservationFromOneClient: reservationsFromOneClient) {
            System.out.println(oneReservationFromOneClient.toString());
        }

        Menu();
    }

    public static void leave() {
        System.out.println("Merci pour votre visite");
        System.out.println("Bye !");
        return;
    }
}
