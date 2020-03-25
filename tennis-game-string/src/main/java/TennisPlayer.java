public class TennisPlayer {
    private String player;
    private String[] score;

    public TennisPlayer(String player) {
        this.player = player;
    }

    public TennisPlayer(String[] score) {
        this.score = score;
    }

    public TennisPlayer() {

    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "TennisPlayer{" +
                "player='" + player + '\'' +
                '}';
    }
}
