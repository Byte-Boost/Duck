package net.byteboost.duck.gui;

import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.FileSystemDocumentLoader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import net.byteboost.duck.utils.GUIutils;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class UploadController implements Initializable {
    private static String user;
    private static String access;
    private static Document doc;
    private static File selectedFile;
    public static void saveUserInformation(String username){
        user = username;
    }
    @FXML
    private Label selectedFileField;
    @FXML
    private Button btn_upload;
    @FXML
    private Button btn_next;
    @FXML
    private Button btn_back;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btn_upload.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fileChooser = new FileChooser();
                fileChooser.getExtensionFilters().addAll(
                        new FileChooser.ExtensionFilter("txt,html,pdf,docx files", "*.txt","*.htm","*.pdf","*.docx")
                );
                Stage currentStage = (Stage) selectedFileField.getScene().getWindow();
                selectedFile = fileChooser.showOpenDialog(currentStage);

                doc = FileSystemDocumentLoader.loadDocument(selectedFile.getPath());

                //For now, it'll only display its own name.
                selectedFileField.setText(selectedFile.getName());

            }
        });
    btn_next.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if (selectedFile != null) {
                GUIutils.changeScene(event,"/fxml/aichat.fxml","Chat",user,null,doc);
            }

        }
    });

    btn_back.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            GUIutils.changeScene(event,"/fxml/login.fxml","Login",null,null,null);
        }
    });
    }
}
