package sdk;

/**
 * Created by nicolaiostergaard on 12/10/15.
 * OBS! fra serveren
 */


// klassen oprettes
public class Score {

    // Deklarerer variablerne til Game klassen
    private int id;
    private Gamer user;
    private Gamer opponent;
    private Game game;
    private int score;

    public Score(){}

    //Laver getters og setters til alle variablerne
    public Gamer getOpponent() { return opponent; }

    public void setOpponent(Gamer opponent) { this.opponent = opponent;  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gamer getUser() {
        return user;
    }

    public void setUser(Gamer user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
