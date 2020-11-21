package sample.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;


public class HelpWindow {
    @FXML
    public Button btn0;

    public static void displayHelp(ActionEvent actionEvent, Class classObj) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(classObj.getResource("/sample/view/HelpWindow.fxml"));
            /*
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             */
            Scene scene = new Scene(fxmlLoader.load(), 1018, 720);
            // css is not working currently due to the intelliJ license
//            scene.getStylesheets().add("sample/view/css/styles.css");
            Stage stage = new Stage();
            stage.setTitle("Help");
            stage.setScene(scene);
            stage.show();
            // Hide this current window (if this is what you want)
//            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void btnClickReturn(ActionEvent actionEvent) {
        Window w =btn0.getScene().getWindow();
        if(w instanceof Stage)
            ((Stage) w).close();

    }


    public static void display() {
        /* way 1 */
//        Stage window = new Stage();
//        window.initModality(Modality.APPLICATION_MODAL);
//        // window.getClass().getResource("view/screen2.fxml");
//        window.setTitle("Help");
//
//        VBox layout = new VBox(30);
//        layout.setAlignment(Pos.CENTER);
//        Scene scene = new Scene(layout, 200, 80);
//        window.setScene(scene);
//        window.showAndWait();


        /* way 2 with adding objects in code */

//        Stage window = new Stage();
//        // while this window is on the screen, you cannot interact
//        // with other windows.
//        window.initModality(Modality.APPLICATION_MODAL);
//        window.setTitle("Help");
//
//        VBox layout = new VBox(30);
//        Label messageLabel = new Label();
//        messageLabel.setText("Message");
//        messageLabel.setStyle("-fx-text-fill: blue; -fx-font-size: 20;");
////        messageLabel.setId("message");
//
//
//        Button okButton = new Button();
//        okButton.setText("OK");
//        okButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                // close the window!
//                window.close();
//            }
//        });
//
//        layout.getChildren().add(messageLabel);
//        layout.getChildren().add(okButton);
//        layout.setAlignment(Pos.CENTER);
//
//
//        Scene scene = new Scene(layout, 200, 80);
//        //scene.getStylesheets().add("sample/View/css/popup.css");
//        window.setScene(scene);
//        window.showAndWait();
    }

}
