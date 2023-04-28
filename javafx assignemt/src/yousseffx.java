import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.awt.*;
public class yousseffx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle();

        circle.setRadius(100);
        circle.setStroke(Color.RED);
        circle.setFill(Color.BLUE);

        //Create a pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        //Create a scene and place it in the stage
        Scene scene = new Scene(pane,500,500);
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.radiusProperty().bind(Bindings.min(pane.widthProperty(), pane.heightProperty()).divide(4));

        primaryStage.setTitle("ShowCircle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
