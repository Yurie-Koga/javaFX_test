package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import sample.view.HelpWindow;

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
    @FXML
    public Button btn3;

    // initialize properties
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void btnClick(ActionEvent actionEvent) {
        System.out.println("clicked: " + actionEvent.getSource());
        Button btnClicked = (Button) actionEvent.getSource();
        String id = btnClicked.getId();
        System.out.println("clicked id: " + id);
    }


    public void btnClickHelp(ActionEvent actionEvent) {
        HelpWindow.displayHelp(actionEvent, getClass());
    }
}
