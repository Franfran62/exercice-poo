package ExerciceException.Exercice3;

public class main {

    public static void main(String[] args) {

        int[] array = new int[5];

        try {
            getTooBigIndex(array);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("L'index est trop grand ! Il n'existe pas ..");
        }
    }

    public static int  getTooBigIndex(int[] array) throws ArrayIndexOutOfBoundsException {
        return array[array.length+1];
    }
}
