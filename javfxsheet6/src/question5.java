import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class question5 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the axes
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        // Create the bar chart
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

        // Set the title and labels for the axes
        barChart.setTitle("Overall Grade Breakdown");
        xAxis.setLabel("Category");
        yAxis.setLabel("Percentage");

        // Create the data series for each category
        XYChart.Series<String, Number> projectsSeries = new XYChart.Series<>();
        projectsSeries.setName("Projects");
        projectsSeries.getData().add(new XYChart.Data<>("", 20));

        XYChart.Series<String, Number> quizzesSeries = new XYChart.Series<>();
        quizzesSeries.setName("Quizzes");
        quizzesSeries.getData().add(new XYChart.Data<>("", 10));

        XYChart.Series<String, Number> midtermSeries = new XYChart.Series<>();
        midtermSeries.setName("Midterm Exams");
        midtermSeries.getData().add(new XYChart.Data<>("", 30));

        XYChart.Series<String, Number> finalExamSeries = new XYChart.Series<>();
        finalExamSeries.setName("Final Exam");
        finalExamSeries.getData().add(new XYChart.Data<>("", 40));

        // Set the colors for each data series
        projectsSeries.getNode().setStyle("-fx-bar-fill: red;");
        quizzesSeries.getNode().setStyle("-fx-bar-fill: blue;");
        midtermSeries.getNode().setStyle("-fx-bar-fill: green;");
        finalExamSeries.getNode().setStyle("-fx-bar-fill: orange;");

        // Add the data series to the bar chart
        barChart.getData().addAll(projectsSeries, quizzesSeries, midtermSeries, finalExamSeries);

        // Create a StackPane to hold the bar chart
        StackPane root = new StackPane();
        root.getChildren().add(barChart);

        // Create the scene and set it on the stage
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
