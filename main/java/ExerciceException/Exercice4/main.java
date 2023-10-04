package ExerciceException.Exercice4;

import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int solde = 400;

        int montant = prompt();

        try {
            System.out.println( retirerArgentDuCompte(solde, montant) );
        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int prompt() {

        System.out.println("Combien d'argent voulez vous retirer ? ");
        int montant = scanner.nextInt();

        return montant;
    }

    public static int retirerArgentDuCompte(int solde, int montant) throws SoldeInsuffisantException {
        if (solde - montant < 0) {
            throw new SoldeInsuffisantException();
        } else {
           return solde - montant;
        }
    }
}
