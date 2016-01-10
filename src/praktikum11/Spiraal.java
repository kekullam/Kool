package praktikum11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Ringjoone valemi järgi ringi joonistamise näide
 * @author Mikk Mangus
 */
@SuppressWarnings("serial")
public class Spiraal extends Applet {

    private Graphics g;

    public void paint(Graphics g) {
        this.g = g;
        joonistaTaust();
        joonistaRing();
    }

    /**
     * Katab tausta valgega
     */
    public void joonistaTaust() {
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);
    }

    /**
     * Joonistab ringi
     */
    public void joonistaRing() {
        g.setColor(Color.black);
        int keskkohtX = getWidth() / 2;
        int keskkohtY = getHeight() / 2;
        int raadius = 2;

        for (double nurk = 0; nurk <= Math.PI * 10; nurk = nurk + .2) {
            int x = (int) (raadius * Math.cos(nurk));
            int y = (int) (raadius * Math.sin(nurk));
            g.fillOval(keskkohtX + x, keskkohtY + y, 10, 10);
            raadius++;
        }
    }
}