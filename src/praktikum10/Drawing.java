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
            gc.setLineWidth(8);
            gc.setStroke(Color.BLACK);
            gc.setFill(Color.YELLOW);
            gc.strokeOval(100, 100, 200, 200);
            gc.fillOval(100, 100, 200, 200);
            gc.strokeOval(130, 150, 35, 50);
            gc.strokeOval(235, 150, 35, 50);
            gc.strokeLine(50, 230, 95, 200);
            gc.strokeLine(345, 230, 305, 200);
            gc.strokeLine(235, 350, 235, 300);
            gc.strokeLine(160, 350, 163, 300);
            gc.setFill(Color.BLACK);
            gc.fillOval(130, 150, 20, 30);
            gc.fillOval(235, 150, 20, 30);
            gc.strokeOval(175, 240, 50, 40);
            gc.setFill(Color.LIGHTPINK);
            gc.fillOval(175, 240, 50, 40);
            gc.setStroke(Color.RED);
            gc.strokeOval(195, 210, 10, 10);
            gc.setFill(Color.BLUE);
            gc.fillOval(80, 95, 190, 30);
            gc.fillRoundRect(150, 70, 120,55,10,10);
            gc.fillText("Olen yks v2ike kollane tegelane!", 130, 50);

        }
    }

