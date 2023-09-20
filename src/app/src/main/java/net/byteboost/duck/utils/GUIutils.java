package net.byteboost.duck.utils;

import dev.langchain4j.data.document.Document;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.byteboost.duck.gui.AiControllerChat;
import net.byteboost.duck.gui.UploadController;


import java.io.IOException;

public class GUIutils {

    public static void changeScene(ActionEvent event, String fxmlFile, String title, String username, String password, Document doc){
        Parent root = null;
        if (username != null) {
            try {
                FXMLLoader loader = new FXMLLoader(GUIutils.class.getResource(fxmlFile));
                root = loader.load();
                if(fxmlFile=="/fxml/aichat.fxml"){
                    AiControllerChat aictrl = loader.getController();
                    aictrl.saveUserInformation(username,doc);
                }
                if (fxmlFile=="/fxml/upload.fxml"){
                    UploadController upctrl = loader.getController();
                    upctrl.saveUserInformation(username);
                }

            }catch(IOException exception){
                exception.printStackTrace();
            }
        }
        else {
            try{
                FXMLLoader loader = new FXMLLoader(GUIutils.class.getResource(fxmlFile));
                root = loader.load();
            }catch (IOException exception){
                exception.printStackTrace();
            }
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();

    }
}
