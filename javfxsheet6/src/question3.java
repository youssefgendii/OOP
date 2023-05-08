import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class question3 extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();

        Text text1 = new Text("youssef");
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text1.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

        Text text2 = new Text("mohammed");
        text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text2.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

        Text text3 = new Text("joee");
        text3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text3.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

        Text text4 = new Text("gendyyy");
        text4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text4.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

        Text text5 = new Text("gendyy");
        text5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text5.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

        root.getChildren().addAll(text1, text2, text3, text4, text5);

        Scene scene = new Scene(root, 200, 400);

        primaryStage.setTitle("Vertical Texts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}