package praktikum15;

/**
 * Created by kekullam on 27.11.15.
 */
public class Lumesadu {
    ArrayList<Lumehelves> lumehelbed;

    public Lumesadu(int helvesteArv, int aknaLaius, int aknaK6rgus) {
        lumehelbed = new ArrayList<Lumehelves>();
        for (int i = 0; i < helvesteArv; i++) {
            int x = (int) (aknaLaius * Math.random());
            int y = (int) (aknaLaius * Math.random());
            Lumehelves l = new Lumehelves(x, y);
            lumehelbed.add(l);
        }
    }
}


