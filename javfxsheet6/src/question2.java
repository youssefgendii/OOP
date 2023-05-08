import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class question2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        Image xImage = new Image("https://c.tenor.com/az6eaU1yJ8wAAAAM/typography-alphabet.gif");
        Image oImage = new Image("http://www.clipartbest.com/cliparts/Kij/XyB/KijXyBGrT.gif");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                ImageView imageView = new ImageView();
                int randomNum = (int) (Math.random() * 3);
                if (randomNum == 0) {
                    imageView.setImage(xImage);
                } else if (randomNum == 1) {
                    imageView.setImage(oImage);
                }
                grid.add(imageView, col, row);
            }
        }

        Scene scene = new Scene(grid, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}