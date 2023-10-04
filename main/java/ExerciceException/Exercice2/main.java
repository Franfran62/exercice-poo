package ExerciceException.Exercice2;

import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("---------------------------------");
        System.out.println("----------------------Exercice 2-");
        System.out.println("---------------------------------");

        String prompt = prompt();
        Integer result = 0;

        try {
            result = convertStringToInt(prompt);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        if (result == 0)
        {
            System.out.println("Il y a eu un problème");
        } else {
            System.out.println("Voici votre Integer : "+ result);
        }
    }
    public static String prompt() {
        System.out.println("Entrez une chaine de caractère qu'on transformera en entier ");
        String prompt = scanner.next();

        return prompt;
    }

    public static Integer convertStringToInt(String param) throws  NumberFormatException {

        Integer response = Integer.parseInt(param);

        return response;
    }
}
