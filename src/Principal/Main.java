package Principal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Main extends Application {
    public static Stage window;
    public boolean cerrar = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Intefaz.fxml"));
        window.setTitle("Hello World");
        window.setScene(new Scene(root, 780, 540));
        window.show();
            }
    public static void closed(){
        window.close();
    }
}


