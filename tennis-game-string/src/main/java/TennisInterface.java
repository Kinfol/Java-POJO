import java.util.Scanner;

public class TennisInterface {
    TennisGame tennisGame = new TennisGame();
    Scanner scanner = new Scanner(System.in);

    private static final int ADD_POINT_SERVER = 1;
    private static final int ADD_POINT_RECEIVER = 2;
    private static final int SHOW_SCORE = 3;
    private static final int EXIT = 4;
    private static int choice;

    public void tennisGameMenu() {
        do {
            printMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("try from givin options");
                scanner.next();
            }
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    tennisGame.playerWinsPoint(new TennisPlayer("server"));
                    break;
                case 2:
                    tennisGame.playerWinsPoint(new TennisPlayer("receiver"));
                    break;
                case 3:
                    tennisGame.getSCORE();
                    break;
                case 4:
                    exitMessage();
                    break;
                default:
                    System.out.println("chose the from menu");
                    continue;
            }
        } while (choice != 4);
    }

    private static void printMenu() {
        System.out.println("Enter \n" + ADD_POINT_SERVER + " to add point to server\n" + ADD_POINT_RECEIVER + " to add point to receiver\n" + SHOW_SCORE + " to show score\n" + EXIT + " to exit the game");
    }
    private void exitMessage() {
        System.out.println("thank you for passing by");
    }
}
