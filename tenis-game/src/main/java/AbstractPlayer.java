import java.util.Objects;

public abstract class AbstractPlayer {
    private String playerName;
    private int scorePlayer;
    private int opponentPlayer;
    private String[] score;

    //should I have a pseudo score here, or can I have it in my logic?

    public AbstractPlayer(String playerName, int scorePlayer, int opponentPlayer) {
        this.playerName = playerName;
        this.scorePlayer = scorePlayer;
        this.opponentPlayer = opponentPlayer;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScorePlayer() {
        return scorePlayer;
    }

    public void setScorePlayer(int scorePlayer) {
        this.scorePlayer = scorePlayer;
    }

    public int getOpponentPlayer() {
        return opponentPlayer;
    }

    public void setOpponentPlayer(int opponentPlayer) {
        this.opponentPlayer = opponentPlayer;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", scorePlayer=" + scorePlayer +
                ", opponentPlayer=" + opponentPlayer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPlayer that = (AbstractPlayer) o;
        return scorePlayer == that.scorePlayer &&
                opponentPlayer == that.opponentPlayer &&
                playerName.equals(that.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, scorePlayer, opponentPlayer);
    }
}
