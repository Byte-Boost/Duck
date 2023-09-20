package net.byteboost.duck.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import net.byteboost.duck.utils.GUIutils;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private TextField tf_username;
    @FXML
    private PasswordField pf_password;
    @FXML
    private Button btn_login;
    @FXML
    private Button btn_register;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btn_login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GUIutils.changeScene(event,"/fxml/upload.fxml","Upload",tf_username.getText(), pf_password.getText(), null);
            }
        });
        btn_register.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GUIutils.changeScene(event,"/fxml/register.fxml","Register",null,null,null);
            }
        });
    }
}
