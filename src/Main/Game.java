package Main;

import javax.swing.*;
import java.util.Random;

public class Game {

    private final String[] shifumi = {"Shi","Fu","Mi"};
    static Player person= new Player(),computer= new Player();
   


    public void RandomShiFuMi(){
        computer.setChoice(shifumi[new Random().nextInt(3)]);
    }
    public void Shi(){
        person.setChoice("Shi");
    }
    public void Fu(){
        person.setChoice("Fu");
    }
    public void Mi(){
        person.setChoice("Mi");
    }
    public void Winner(){
        ImageIcon icn ;
        switch (computer.getChoice().charAt(0)){
            case 'S' : {
                switch (person.getChoice().charAt(0)){
                    case 'S' :  JOptionPane.showMessageDialog(null,"No one wins :D ");break;
                    case 'F' : {

                        JOptionPane.showMessageDialog(null,"Computer wins :D ","Computer",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("Rock.png"));
                        computer.setScore(computer.getScore()+1);
                    }break;
                    case 'M' : {
                        JOptionPane.showMessageDialog(null,person.getName()+" wins :D ");
                        person.setScore(person.getScore()+1);
                    }break;
                }
            }break;
            case 'F' : {
                switch (person.getChoice().charAt(0)){
                    case 'S' :  {
                        JOptionPane.showMessageDialog(null,person.getName()+" wins :D ");
                        person.setScore(person.getScore()+1);
                    }break;
                    case 'F' : {
                        JOptionPane.showMessageDialog(null,"No one wins :D ");
                    }break;
                    case 'M' : {
                        JOptionPane.showMessageDialog(null,"Computer wins :D ");
                        computer.setScore(computer.getScore()+1);
                    }break;
                }
            }break;
            case 'M' : {
                switch (person.getChoice().charAt(0)){
                    case 'S' :  {
                        JOptionPane.showMessageDialog(null,"Computer wins :D ");
                        computer.setScore(computer.getScore()+1);
                    }break;
                    case 'F' : {
                        JOptionPane.showMessageDialog(null,person.getName()+" wins :D ");
                        person.setScore(person.getScore()+1);
                    }break;
                    case 'M' : {
                        JOptionPane.showMessageDialog(null,"no one wins :D ");
                    }break;
                }
            }break;
        }
        if(person.getScore()==3){
            JOptionPane.showMessageDialog(null,Game.person.getName()+" won the three games !");
            person.setScore(0);
            computer.setScore(0);
        }else{
            if (computer.getScore()==3){
                JOptionPane.showMessageDialog(null,"Computer won the three games !");
                person.setScore(0);
                computer.setScore(0);
            }
        }
    }


}
