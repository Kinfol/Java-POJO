import java.util.Objects;

public abstract class AbstractPlayer {
    private String playerName;
    private String point;

    public AbstractPlayer(String playerName, String point) {
        this.playerName = playerName;
        this.point = point;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "AbstractPlayer{" +
                "playerName='" + playerName + '\'' +
                ", point='" + point + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPlayer that = (AbstractPlayer) o;
        return
                point.equals(that.point) &&
                playerName.equals(that.playerName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, point);
    }
}
