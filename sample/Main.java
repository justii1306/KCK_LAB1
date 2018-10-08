package sample;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        GridPane gridpane2 = new GridPane();
        gridpane2.setPadding(new Insets(5));
        gridpane2.setVgap(2);
        gridpane2.setHgap(2);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setMaxWidth(300);
        column2.setHgrow(Priority.ALWAYS);
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setHgrow(Priority.ALWAYS);
        gridpane.getColumnConstraints().addAll(column1, column2);

        Label labelR = new Label("Narzędzia");

        VBox vBox = new VBox();
        TextArea textU = new TextArea("ola");
        TextArea textD = new TextArea("OLA");
        vBox.getChildren().addAll(new Label("Źródło"), textU, new Label("Wynik"), textD);

        gridpane.add(vBox, 1, 1);
        gridpane2.add(labelR, 1, 1);

        Button btn1 = new Button();
        btn1.setText("Przetwarzaj");
        btn1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpane2.setVgrow(btn1, Priority.ALWAYS);
        gridpane2.setHgrow(btn1, Priority.ALWAYS);
        gridpane2.add(btn1, 1, 2);

        Button btn2 = new Button();
        btn2.setText("Wyczyść źrodło");
        btn2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpane2.setVgrow(btn2, Priority.ALWAYS);
        gridpane2.setHgrow(btn2, Priority.ALWAYS);
        gridpane2.add(btn2, 1, 3);


        Button btn4 = new Button();
        btn4.setText("Pomoc");
        btn4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpane2.setVgrow(btn4, Priority.ALWAYS);
        gridpane2.setHgrow(btn4, Priority.ALWAYS);
        btn4.setDisable(true);
        gridpane2.add(btn4, 1, 4);

        Button btn5 = new Button();
        btn5.setText("O programie");
        btn5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpane2.setVgrow(btn5, Priority.ALWAYS);
        gridpane2.setHgrow(btn5, Priority.ALWAYS);
        gridpane2.add(btn5, 1, 5);

        Button btn6 = new Button();
        btn6.setText("Zapisz i zakończ");
        btn6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpane2.setVgrow(btn6, Priority.ALWAYS);
        gridpane2.setHgrow(btn6, Priority.ALWAYS);
        gridpane2.add(btn6, 1, 6);

        gridpane.add(gridpane2, 0, 1);

        Scene scene = new Scene(gridpane, 500, 300);

        primaryStage.setTitle("Zmiana wielkości liter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
