
package praktikum15;
        import javafx.application.Application;
        import javafx.scene.Group;
        import javafx.scene.Scene;
        import javafx.scene.canvas.Canvas;
        import javafx.scene.canvas.GraphicsContext;
        import javafx.scene.paint.Color;
        import javafx.stage.Stage;


/**
 * Created by kekullam on 27.11.15.
 */
public class GraafikaNaide extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX-iga joonistamise näide");
        Group root = new Group();
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        new Lumehelves(5,5);
        new GraafilineLumesadu(50,gc);



        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void joonista(GraphicsContext gc) {

        // Määrame värvid
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);

        // Joone laius
        gc.setLineWidth(5);

        // Tegelase roheline pea
        gc.fillRoundRect(50, 50, 300, 300, 40, 40);

        // Suu
        gc.strokeLine(100, 300, 300, 300);

        // Silmad
        gc.strokeOval(100, 100, 50, 50);
        gc.strokeOval(250, 100, 50, 50);

        // Värvivahetus
        gc.setFill(Color.RED);

        // Punane nina
        gc.fillRoundRect(175, 200, 50, 50, 10, 10);

        gc.fillText("Olen roheline mehike Marsilt", 100, 370);
    }
}
