package net.byteboost.duck.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

public class UploadController {
    @FXML
    private Label selectedFileField;
    @FXML
    protected void fileSelect(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("txt,html,pdf,docx files", "*.txt","*.htm","*.pdf","*.docx")
        );
        Stage currentStage = (Stage) selectedFileField.getScene().getWindow();
        File selectedFIle = fileChooser.showOpenDialog(currentStage);

        //For now, it'll only display its own name.
        selectedFileField.setText(selectedFIle.getName());
    }
}
