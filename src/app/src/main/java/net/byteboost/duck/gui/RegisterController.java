package net.byteboost.duck.gui;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import net.byteboost.duck.utils.DButils;


public class RegisterController{
    @FXML
    private TextField tf_username;
    @FXML
    private PasswordField pf_password;
    @FXML
    private PasswordField pf_confirm;
    @FXML
    protected void Register(){
        if( !tf_username.getText().trim().isEmpty()  && !pf_password.getText().trim().isEmpty()  && !pf_confirm.getText().trim().isEmpty()){

            String confirm = pf_confirm.getText();
            String password = pf_password.getText();

            if( confirm.equals(password)){

                System.out.println("Sucesso! As senhas coincidem.");

            }
            else {
                System.out.println(confirm + "," + password);

                System.out.println("Erro! As senhas não coincidem.");
            }
        }
        else {
            System.out.println("Erro! Os campos se encontram vazios.");
        }
    }
}