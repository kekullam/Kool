package praktikum15;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Created by kekullam on 27.11.15.
 */
public class Lumehelves {
    int x;
    int y;


    public Lumehelves(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void joonistaMind(GraphicsContext gc) {

        gc.setStroke(Color.BLUE);
        gc.strokeLine(x - 10, y - 10, x + 10, y + 10);
        gc.strokeLine(x - 10, y + 10, x + 10, y - 10);

    }

}

