package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("Shi Fu Mi");
        primaryStage.setResizable(false);
        primaryStage.setOnCloseRequest(e ->{
            if(JOptionPane.showConfirmDialog(null,"Made By BendabizAdam\nYou really wish to close ?","Alert",JOptionPane.YES_NO_OPTION)==0){
                primaryStage.close();
                e.consume();
            }
        });
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Game.person.setName(JOptionPane.showInputDialog(null,"Enter your name","Name",JOptionPane.INFORMATION_MESSAGE));
        launch(args);
    }
}
