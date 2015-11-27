package praktikum15;

/**
 * Created by kekullam on 27.11.15.
 */

import javafx.scene.canvas.GraphicsContext;

public class GraafilineLumesadu extends Lumesadu {

    public GraafilineLumesadu(int helvesteArv, GraphicsContext gc) {
        super(helvesteArv, (int) gc.getCanvas().getWidth(), (int) gc.getCanvas().getHeight());
        for (Lumehelves lumehelves: lumehelbed){
            lumehelves.joonistaMind(gc);
        }
    }
}

