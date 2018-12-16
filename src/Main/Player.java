package Main;

public class Player {
    private String Name,choice;
    private int Score=0;

    public Player(){
    }
    public Player(String name, String choice, int score) {
        Name = name;
        this.choice = choice;
        Score = score;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}
