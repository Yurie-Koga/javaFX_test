package sample.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class HelpWindow {
    public static void display1(ActionEvent actionEvent, Class classObj){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(classObj.getResource("/sample/view/sample.fxml"));
//                fxmlLoader.setController(Controller);
            /*
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             */
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("New Window");
            stage.setScene(scene);
            stage.show();
            // Hide this current window (if this is what you want)
//            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
    public static void display(){
        /* show in another tab */
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


        /* show in another tab */

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
