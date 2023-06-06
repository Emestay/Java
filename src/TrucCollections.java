import java.util.ArrayList;
import java.util.Collections;

public class TrucCollections {
    public static void main(String[] args) {

        ArrayList<Integer> maListe = new ArrayList<>();
        maListe.add(55);
        maListe.add(200);
        maListe.add(565);
        maListe.add(15);
        maListe.add(25);
        maListe.add(245);
        maListe.add(666);

        System.out.println("La valeur min  est: " + minima(maListe));
    }
    public static int minima(ArrayList<Integer> list) {
        return Collections.min(list);

    }
}