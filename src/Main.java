import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rounds = 3, usersPoints = 0, computersPoints = 0;

        for(int i = 0; i < rounds; i++) {
            System.out.println("Type your choice (rock, paper, scissors):");
            String userChoice = scanner.nextLine();

            int randomNumber = random.nextInt(3);
            String computerChoice;

            if (randomNumber == 0) {
                computerChoice = "rock";
            } else if (randomNumber == 1) {
                computerChoice = "paper";
            } else{
                computerChoice = "scissors";
            }

            System.out.println(userChoice + " vs " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("Draw");
            } else if (Methods.didPlayerWin(userChoice, computerChoice)) {
                usersPoints ++;
                System.out.println("You win");
                System.out.println("The score is " + usersPoints + ":" + computersPoints);
            } else {
                System.out.println("You lose");
                System.out.println("The score is " + usersPoints + ":" + computersPoints);
            }
//liczenie punktów
//zapytanie czy chce zagrać ponownie (ale jeszcze się nad tym zastanowię)
//czy używa dwa razy tej samej figury, jeśli tak, załóż, że nie weźmie jej trzeci raz, jeśli znowu ją weźmie, załóż to ponownie
//jeśli powtarza swoją figurę po zwycięstwie, uznaj, że znowu to zrobi przy innej figurze
//czy zmienia figury według schematu rock, paper, scissors lub odwrotnego, jeśli tak, rób na odwrót
//czy zmienia figury wedlug odwrotnego schematu, jeśli tak, powtórz jego ruch
//czy stosuje schemat zmiany figur zależnie od swojej ostatniej figury lub figury komputera
        }
    }
}