package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.GridPane;
import sample.view.HelpWindow;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public Button btn0;
    @FXML
    public Button btnConf;
    @FXML
    public Button btnWarn;
    @FXML
    public GridPane gridLayout;
    @FXML
    public Button btnHelp;

    // initialize properties
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    /**
     * General Click
     *
     * @param actionEvent
     */
    public void btnClick(ActionEvent actionEvent) {
        System.out.println("clicked: " + actionEvent.getSource());
        Button btnClicked = (Button) actionEvent.getSource();
        String id = btnClicked.getId();
        System.out.println("clicked id: " + id);
    }


    /**
     * Display help window
     *
     * @param actionEvent
     */
    public void btnClickHelp(ActionEvent actionEvent) {
        HelpWindow.displayHelp(actionEvent, getClass());
    }

    /**
     * Terminate app
     * Show Confirmation dialog beforehand
     *
     * @param actionEvent
     */
    public void btnConf(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        // HeaderText: can set any suitable text, or set null to remove
        alert.setHeaderText("Look, a Confirmation Dialog");
        alert.setContentText("Are you sure you want to stop playing?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            // OK: terminate app
            System.exit(0);
        } else {
            // Cancel: not terminate
        }
    }

    /**
     * Terminate app
     * Show Warning dialog beforehand
     *
     * @param actionEvent
     */
    public void btnWarn(ActionEvent actionEvent) {
        ButtonType btnYes = new ButtonType("Yes", ButtonBar.ButtonData.YES);
        ButtonType btnNo = new ButtonType("No", ButtonBar.ButtonData.NO);
        Alert alert = new Alert(Alert.AlertType.WARNING, "Are you sure you want to stop playing?", btnYes, btnNo);
        alert.setHeaderText(null);

//        alert.setTitle("Date format warning");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.orElse(btnNo) == btnYes) {
            // Yes: terminate app
            System.exit(0);
        }
    }

    /**
     * Terminate app
     * Show Customized Confirmation dialog beforehand
     *
     * @param actionEvent
     */
    public void btnCustConf(ActionEvent actionEvent) {
        ButtonType btnYes = new ButtonType("Yes", ButtonBar.ButtonData.YES);
        ButtonType btnNo = new ButtonType("No", ButtonBar.ButtonData.NO);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to stop playing?", btnYes, btnNo);
        alert.setHeaderText(null);

//        alert.setTitle("Date format warning");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.orElse(btnNo) == btnYes) {
            // Yes: terminate app
            System.exit(0);
        }
    }
}
