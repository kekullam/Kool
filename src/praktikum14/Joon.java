package praktikum14;

/**
 * Created by kekullam on 24.11.15.
 */
public class Joon {

    Punkt algPunkt;
    Punkt lõppPunkt;

    public Joon(Punkt x, Punkt y) {
        algPunkt = x;
        lõppPunkt = y;
    }

    public Joon() {
    }

    @Override
    public String toString() {
        return "Joon (" + algPunkt + " kuni " + lõppPunkt +")";
    }

    public double pikkus() {
        return Math.sqrt( (algPunkt.x - lõppPunkt.x)*(algPunkt.x - lõppPunkt.x) + (algPunkt.y - lõppPunkt.y)*(algPunkt.y - lõppPunkt.y) );
    }

}
