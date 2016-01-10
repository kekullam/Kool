package praktikum10;

/**
 * Created by Kerdo Kullamäe on 9.11.2015.
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Drawing extends Application{

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) {
            primaryStage.setTitle("by Kerdo");
            Group root = new Group();
            Canvas canvas = new Canvas(400, 400);
            GraphicsContext gc = canvas.getGraphicsContext2D();
            joonista(gc);
            root.getChildren().add(canvas);
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }

        private void joonista(GraphicsContext gc) {
            gc.fillOval(0,0,100,100);

        }
    }

