package sdk;

/**
 * Created by jesperbruun on 15/10/15.
 * OBS! Fra serveren
 */

// klassen oprettes
public class Gamer extends User {

    // Deklarerer variablerne til Game klassen
    private int score;
    private int totalScore;
    private int kills;
    private String controls;
    private boolean winner;

    //Laver getters og setters til alle variablerne
    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void setControls(String controls) {
        this.controls = controls;
    }

    public int getKills() {
        return kills;
    }

    public int getScore() {
        return score;
    }

    public String getControls() {
        return controls;
    }
}
