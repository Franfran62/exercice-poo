package Exercice3;

public class TestColors {
    public void melangerColors(PrimaryColors color1, PrimaryColors color2) {

        if (color1== color2)
        {
            System.out.println("Vous ne mélangez rien du tout, le saviez vous ?");
            return;
        }

        if (color1 == PrimaryColors.JAUNE || color2 == PrimaryColors.JAUNE)
        {
            if (color1 == PrimaryColors.ROUGE || color2 == PrimaryColors.ROUGE)
            {
                System.out.println("Avec votre mélange, vous obtenez du Orange");
            } else
            {
                System.out.println("Avec votre mélange, vous obtenez du Vert");
            }
        } else {
            System.out.println("Avec votre mélange, vous obtenez du Violet");
        }
    }
}
