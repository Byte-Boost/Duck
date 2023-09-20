
package net.byteboost.duck;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("/fxml/login.fxml")));

        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root));

        primaryStage.show();


    }
}