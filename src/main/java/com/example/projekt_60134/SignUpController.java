package com.example.projekt_60134;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML
    private Button btn_back;
    @FXML
    private Button btn_sign_up;

    @FXML
    private TextField tf_username;
    @FXML
    private TextField tf_userfirstname;
    @FXML
    private TextField tf_userlastname;
    @FXML
    private TextField tf_password;
    @FXML
    private TextField tf_email;
    @FXML
    private TextField tf_phonenumber;
    @FXML
    private CheckBox cb_newsletter;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btn_sign_up.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                if (!tf_username.getText().trim().isEmpty() &&
                        !tf_userfirstname.getText().trim().isEmpty() &&
                        !tf_userlastname.getText().trim().isEmpty() &&
                        !tf_password.getText().trim().isEmpty() &&
                        !tf_email.getText().trim().isEmpty()) {
                    DBUtils.signUpUser(actionEvent,
                            tf_username.getText(),
                            tf_userfirstname.getText(),
                            tf_userlastname.getText(),
                            tf_password.getText(),
                            tf_email.getText(),
                            tf_phonenumber.getText(),
                            cb_newsletter.isSelected()
                    );

                } else {
                    System.out.println("Uzupełnij wszystkie dane");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Uzupełnij wszystkie dane");
                    alert.show();
                }
            }
        });
        btn_back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.changeScene(actionEvent, "first-page.fxml", "Logowanie", null, null);
            }
        });
    }
}
