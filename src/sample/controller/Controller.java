package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sample.view.HelpWindow;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public Button btn0;
    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public GridPane gridLayout;

    // initialize properties
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void btnClick(ActionEvent actionEvent) {
        System.out.println("clicked: " + actionEvent.getSource());
        Button btnClicked = (Button) actionEvent.getSource();
        String id = btnClicked.getId();
        System.out.println("clicked id: " + id);
        if(id.equals("btn3")){
            System.out.println("goint to opening a new window");
//            HelpWindow.display();
            HelpWindow.display1(actionEvent, getClass());

        }
    }


}
