package net.byteboost.duck.gui;

import dev.langchain4j.data.document.Document;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class AiControllerChat implements Initializable {
    private static String user;
    private static Document doc;
    public static void saveUserInformation(String username, Document document){
        user = username;
        doc = document;
    }
    @FXML
    private Button button_send;
    @FXML
    private TextField tf_question;
    @FXML
    private VBox chat;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
