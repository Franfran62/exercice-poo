package ExerciceException.Exercice1;

import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("---------------------------------");
        System.out.println("----------------------Exercice 1-");
        System.out.println("---------------------------------");

        float resultat = 0;

        try {
            resultat = division();
        } catch (Exception e){
            System.out.println("Impossible de diviser par zero");
        }

        if (resultat > 0)
        {
            System.out.println("Le résultat est : "+resultat);
        } else {
            System.out.println("Il y a eu une erreur");
        }

    }

    public static float prompt() {

        System.out.println("Entrez un nombre");

        float a = 0;

        try {
            a = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Erreur : veuillez recommencer");
            prompt();
        }

        return a;
    }

    public static float division() throws Exception {

        float a = prompt();
        float b =prompt();

        if(b == 0F) {
            throw new Exception();
        } else {
            return a/b;
        }
    }
}
