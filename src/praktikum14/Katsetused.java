package praktikum14;

/**
 * Created by kekullam on 24.11.15.
 */
public class Katsetused {
    public static void main(String[] args) {

        Punkt minuPunkt = new Punkt();
        minuPunkt.x = 0;
        minuPunkt.y = 0;

        Ring minuRing = new Ring(minuPunkt, 5);
        Silinder minuSilinder = new Silinder(minuPunkt, 5 , 5);

        Punkt veelYksPunkt = new Punkt(100,0);
        System.out.println(veelYksPunkt);
        System.out.println(minuPunkt);

        Joon minuJoon = new Joon(minuPunkt, veelYksPunkt);
        System.out.println(minuJoon);
        System.out.println("Joone pikkus: " + minuJoon.pikkus());

        System.out.println("Ringi pindala: " + minuRing.pindala());
        System.out.println("Ringi ümbermõõt: " + minuRing.ymberm66t());

        System.out.println("Silindri pindala: " + minuSilinder.pindalaSilinder());
        System.out.println("Silindri ruumala: " + minuSilinder.ruumalaSilinder());
    }

}
