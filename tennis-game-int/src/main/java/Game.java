public class Game {
    private static final int[] SCORE = {0, 15, 30, 40, 50, 65};

    private int serverPoints;
    private int receiverPoints;

    public void serverWinsPoint() {
        serverPoints++;
        if (deuce() && !winGame()) {
            System.out.println("Deuce");
        }
        if (advantage() && !winGame()) {
            System.out.println("advantage server");
        }
        if (winGame()) {
            System.out.println("server won with");
        }
    }


    public void receiverWinsPoint() {
        receiverPoints++;
        if (advantage() && !winGame()) {
            System.out.println("advantage receiver");
        }
        if (winGame()) {
            System.out.println("receiver won");
        }
        if (deuce()) {
            System.out.println("Deuce");
        }
    }

    int serverScore() {
        return SCORE[serverPoints];
    }

    int receiverScore() {
        return SCORE[receiverPoints];
    }


    public boolean winGame() {
        if (serverScore() == SCORE[3] && receiverScore() == SCORE[5]) {
            return true;
        }

        if (serverScore() == SCORE[5] && receiverScore() == SCORE[3]) {
            return true;
        }

        if (serverScore() == SCORE[5] && receiverScore() == SCORE[3]) {
            return true;
        }

        if (serverScore() == SCORE[3] && receiverScore() == SCORE[5]) {
            return true;
        }
        return false;
    }

    public boolean deuce() {
        if (serverScore() == SCORE[3] && receiverScore() == SCORE[3]) {
            return true;
        }
        return false;
    }

    public boolean advantage() {
        if (serverScore() == SCORE[4] && receiverScore() == SCORE[3]) {
            return true;
        }

        if (serverScore() == SCORE[3] && receiverScore() == SCORE[4]) {
            return true;
        }

        if (serverScore() == SCORE[4] && receiverScore() == SCORE[3]) {
            return true;
        }

        if (serverScore() == SCORE[3] && receiverScore() == SCORE[4]) {
            return true;
        }
        return false;
    }

    public String getScore() {
        return String.format("%d - %d", serverScore(), receiverScore());
    }
}

