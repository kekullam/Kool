package praktikum14;

/**
 * Created by kekullam on 24.11.15.
 */
public class Silinder extends Ring {
    int k6rgus;

    public Silinder(Punkt x, double r, int h) {
        super(x, r);
        raadius = r;
        k6rgus = h;
    }

    public double pindalaSilinder() {
        return pindala() * 2 + ymberm66t() * k6rgus;
    }

    public double ruumalaSilinder() {
        return pindala() * k6rgus;
    }

}
