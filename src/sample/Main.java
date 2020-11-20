package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
//adding for testing
    @Override
    public void start(Stage primaryStage) throws Exception{
        // Single Screen
        // Main screen
        Parent root = FXMLLoader.load(getClass().getResource("view/sample.fxml"));
        primaryStage.setTitle("Hello World");
        Scene main = new Scene(root, 700, 500);
//        main.getStylesheets().add("sample/view/css/styles.css");

//        // Dynamically add object
//        GridPane gridPane = (GridPane) main.getRoot();
//        Label helloLabel = new Label("Hello Child!");
//        helloLabel.setTranslateX(10);
//        helloLabel.setTranslateY(20);
//        gridPane.getChildren().add(helloLabel);

        primaryStage.setScene(main);
        primaryStage.show();


        // Multiple Screens
//        // Main screen
//        Parent root = FXMLLoader.load(getClass().getResource("view/sample.fxml"));
//        // Stack Pane: it's same to write in fxml
//        // <StackPane> .. <GridPane>...</GridPane>..</StackPane>
//        StackPane stackPane = new StackPane();
//        stackPane.getChildren().add(root);
//
//        primaryStage.setTitle("Hello World");;
//        Scene boardScene = new Scene(stackPane, 700, 500);
//
//        //boardScene.getStylesheets().add("sample/view/css/styles.css");
//
//        primaryStage.setScene(boardScene);
//        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
