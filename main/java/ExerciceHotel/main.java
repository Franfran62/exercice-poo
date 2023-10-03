package ExerciceHotel;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenue dans le logiciel de gestion de votre Hotêl");
        System.out.println("Pour commencer, entrez un nom votre hotêl");
        Hotel hotel = new Hotel(scanner.next());
        System.out.println("-----------------------------------------");
        System.out.println("Bienvenue dans l'hotel "+ hotel.getNom());
        System.out.println("Voici un listing des chambres : ");
        for (Chambre chambre:hotel.getChambres())
        {
            System.out.println(chambre);
        }

        System.out.println();
        Menu(hotel);
    }
    public static void Menu(Hotel hotel) {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("-------------------MENU------------------");
        System.out.println("-----------------------------------------");
        System.out.println();

        System.out.println("1. Ajouter un client");
        System.out.println("2. Prendre une réservation");
        System.out.println("3. Voir la liste de chambre");
        System.out.println("4. Voir les réservations");
        System.out.println("5. Sortir");

        switch (scanner.next())
        {
            case "1" : ajouterUnClient(hotel);
                break;
            case "2" : prendreUneReservation(hotel);
                break;
            case "3" : voirLesChambres(hotel);
                break;
            case "4" : voirLesReservations(hotel);
                break;
            case "5" : leave();
                break;

            default: Menu(hotel);
        }
    }
    public static void ajouterUnClient(Hotel hotel) {
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

        Menu(hotel);
    }
    public static void prendreUneReservation(Hotel hotel) {
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
            ajouterUnClient(hotel);
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
        Menu(hotel);
    }
    public static void voirLesChambres(Hotel hotel) {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("--------------LES CHAMBRES---------------");
        System.out.println("-----------------------------------------");
        System.out.println();

        for (Chambre chambre: hotel.getChambres())
        {
            System.out.println(chambre.toString());
        }

        Menu(hotel);
    }
    public static void voirLesReservations(Hotel hotel) {

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("------------LES RESERVATIONS-------------");
        System.out.println("-----------------------------------------");
        System.out.println();

        if (hotel.getReservations().isEmpty())
        {
            System.out.println("Il n'y a aucune réservation");
            Menu(hotel);
            return;
        }



        for (Reservation reservation: hotel.getReservations())
        {
            System.out.println(reservation.toString());
        }

        Menu(hotel);
    }

    public static void leave() {
        System.out.println("Merci pour votre visite");
        System.out.println("Bye !");
        return;
    }
}