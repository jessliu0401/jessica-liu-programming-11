package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("GUI");
        primaryStage.setScene(new Scene(root, 300, 275));//size of your window
        primaryStage.show();
    }
//rules: two players each roll a dice. whoever gets a bigger number wins a point.
// if there's a tie each person gets a point
    // whoever gets 10 point first wins

    public static void main(String[] args) { launch(args);
    }
}
