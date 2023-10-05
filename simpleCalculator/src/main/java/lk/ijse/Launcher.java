package lk.ijse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.util.Objects;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/calculatorForm.fxml")));

        Scene scene = new Scene(rootNode);

        Image iconImage = new Image("assest/calculatorIcon.png");

        stage.getIcons().add(iconImage);
        stage.setTitle("Calculator");
        stage.centerOnScreen();
        stage.setScene(scene);

        stage.show();
    }
}
