import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rounds = 3, usersWins = 0, computersWins = 0;
        boolean userWantsToPlay = true;

        while (userWantsToPlay) {
            int usersPoints = 0, computersPoints = 0;
            boolean endOfGame = false;

            while (!endOfGame) {
                System.out.println("Type your choice (rock, paper, scissors):");
                String userChoice = scanner.nextLine();

                int randomNumber = random.nextInt(3);
                String computerChoice;

                if (randomNumber == 0) {
                    computerChoice = "rock";
                } else if (randomNumber == 1) {
                    computerChoice = "paper";
                } else {
                    computerChoice = "scissors";
                }

                System.out.println(userChoice + " vs " + computerChoice);

                if (userChoice.equals(computerChoice)) {
                    System.out.println("Draw");
                } else if (Methods.didPlayerWin(userChoice, computerChoice)) {
                    usersPoints++;
                    System.out.println("You beat the computer");
                    System.out.println("The score is " + usersPoints + ":" + computersPoints);
                } else {
                    computersPoints ++;
                    System.out.println("The computer beat you");
                    System.out.println("The score is " + usersPoints + ":" + computersPoints);
                }

                if (usersPoints == rounds) {
                    endOfGame = true;
                    usersWins ++;
                    System.out.println("Congratulations! You won the game :))");
                } else if (computersPoints == rounds) {
                    endOfGame = true;
                    computersWins ++;
                    System.out.println("You lose the game, better luck next time :((");
                }
            }

            System.out.println("Do you want to play one more time? (Y/N)");
            String usersAnswer = scanner.nextLine();
            if (usersAnswer.equals("y") || usersAnswer.equals("Y")) {
                userWantsToPlay = true;
            } else if (usersAnswer.equals("n") || usersAnswer.equals("N")) {
                userWantsToPlay = false;
            }
        }
    }
}