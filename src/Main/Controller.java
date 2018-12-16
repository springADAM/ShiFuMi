package Main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private static Game g= new Game();

    @FXML
      Label Player,Pscore,Cscore;


    private void Playing() {
        g.RandomShiFuMi();
        g.Winner();
        Pscore.setText(String.valueOf(Game.person.getScore()));
        Cscore.setText(String.valueOf(Game.computer.getScore()));
    }

    public void Shi(){
        g.Shi();
        Playing();
    }


    public void Fu(){

        g.Fu();
        Playing();

    }
    public void Mi(){

        g.Mi();
        Playing();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Player.setText(Game.person.getName());
    }
}
