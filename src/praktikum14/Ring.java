package praktikum14;

/**
 * Created by kekullam on 24.11.15.
 */
public class Ring {
    Punkt x;
    double raadius;

    public Ring(Punkt x, double raadius) {
        this.x = x;
        this.raadius = raadius;
    }

    public double ymberm66t() {
        return 2*Math.PI*raadius;
    }

    public double pindala() {
        return Math.PI*raadius*raadius;
    }
}
