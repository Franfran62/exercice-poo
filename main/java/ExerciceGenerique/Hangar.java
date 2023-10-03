package ExerciceGenerique;

import java.util.ArrayList;

public class Hangar<T> {

private ArrayList<T> contenu;
private int emplacement;

    public Hangar(ArrayList<T> listObjects)
    {
        contenu = new ArrayList<T>();

        for (T indidualObject: listObjects)
        {
            this.contenu.add(indidualObject);
            this.emplacement++;
        }
    }
    public Hangar() {
        contenu = new ArrayList<T>();
    }

    public void addElement(T value) {
        this.contenu.add(value);
        this.emplacement++;
    }

    public ArrayList<T> getAll() {
        return this.contenu;
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "contenu=" + contenu +
                ", emplacement=" + emplacement +
                '}';
    }
}
