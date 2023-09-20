package net.byteboost.duck.gui;

import dev.langchain4j.data.document.Document;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;


public class AiControllerChat implements Initializable {
    private static String user;
    private static Document doc;
    public static void saveUserInformation(String username, Document document){
        user = username;
        doc = document;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
