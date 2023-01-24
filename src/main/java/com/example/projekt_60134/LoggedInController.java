package com.example.projekt_60134;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class LoggedInController implements Initializable {
    @FXML
    private Button btn_logout;
    @FXML
    private Label lb_userfirstname;
    @FXML
    private Label lb_userlastname;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn_logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.changeScene(actionEvent, "first-page.fxml", "Zaloguj się", null, null);
            }
        });
    }

    public void setUserInformation(String userfirstname, String userlastname) {
        lb_userfirstname.setText(userfirstname);
        lb_userlastname.setText(userlastname);
    }

}
