import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class question1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

            // Create a GridPane
            GridPane gridPane = new GridPane();
            gridPane.setPadding(new Insets(10));
            gridPane.setHgap(10);
            gridPane.setVgap(10);

            // Create four ImageViews and add them to the GridPane
            ImageView imageView1 = new ImageView(new Image("https://vectorified.com/image/american-flag-vector-free-download-34.jpg"));
            ImageView imageView2 = new ImageView(new Image("https://www.lpgsystems.com/fr/wp-content/uploads/sites/7/2018/01/flag-de-300x300-1.jpg"));
            ImageView imageView3 = new ImageView(new Image("https://clipartmag.com/images/jamaica-cliparts-21.png"));
            ImageView imageView4 = new ImageView(new Image("https://databaseworldwide.com/wp-content/uploads/2019/11/Jordan-Flag-300x300.png"));

            gridPane.add(imageView1, 0, 0);
            gridPane.add(imageView2, 1, 0);
            gridPane.add(imageView3, 0, 1);
            gridPane.add(imageView4, 1, 1);

            // Create a Scene and add the GridPane to it
            Scene scene = new Scene(gridPane,500,500);

            // Set the title of the Stage and show it
            primaryStage.setTitle("Image Grid Pane");
            primaryStage.setScene(scene);
            primaryStage.show();



    }
}
