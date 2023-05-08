import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class question4 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);

        // Define the circle
        Arc arc = new Arc(250, 250, 200, 200, 0, 360);
        arc.setType(ArcType.CHORD);
        arc.setStroke(Color.BLACK);
        arc.setFill(null);

        // Define the text
        String text = "Welcome to Java";
        Text[] letters = new Text[text.length()];
        for (int i = 0; i < text.length(); i++) {
            letters[i] = new Text(String.valueOf(text.charAt(i)));
            letters[i].setFont(Font.font("Arial", 20));
            letters[i].setX(250 + Math.cos(Math.toRadians(i * (360.0 / text.length()))) * 150);
            letters[i].setY(250 + Math.sin(Math.toRadians(i * (360.0 / text.length()))) * 150);
            letters[i].setRotate(i * (360.0 / text.length()) + 90);
        }

        root.getChildren().addAll(arc);
        root.getChildren().addAll(letters);

        primaryStage.setTitle("Circle Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}