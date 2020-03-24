public class Main {

    public static void main(String[] args) {
        Game game = new Game();

        game.serverWinsPoint();
        game.receiverWinsPoint();

        game.serverWinsPoint();
        game.receiverWinsPoint();

        game.serverWinsPoint();
//        game.receiverWinsPoint();

//        game.receiverWinsPoint();

        game.receiverWinsPoint();

        String score = game.getScore();
        System.out.println(score);
    }
}
