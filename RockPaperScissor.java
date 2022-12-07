import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Game!");
        System.out.println("Rules :- \n 0 -> Rock \n 1 -> Paper \n 2 -> Scissor");
        Random random = new Random();
        int compChoice = random.nextInt(3);
        int playerChoice = sc.nextInt();
        String PlayerChoice;
        String CompChoice;
        PlayerChoice = switch (playerChoice) {
            case 0 -> "Rock";
            case 1 -> "Paper";
            default -> "Scissor";
        };
        CompChoice = switch (compChoice) {
            case 0 -> "Rock";
            case 1 -> "Paper";
            default -> "Scissor";
        };
        System.out.println("Your Choice is:- " + PlayerChoice + "\nComputer Choice is:- " + CompChoice);
        if (compChoice == playerChoice) {
            System.out.println("It's a Draw");    //Draw Condition
        } else if (playerChoice == 0) {         //Player Chooses Rock
            if (compChoice == 1) {
                System.out.println("Winner :- Computer");
            } else {
                System.out.println("Winner :- Player");
            }
        } else if (playerChoice == 1) {             //Player Chooses Paper
            if (compChoice == 2) {
                System.out.println("Winner :- Computer");
            } else {
                System.out.println("Winner :- Player");
            }
        } else {                                    //Player Chooses Scissor
            if (compChoice == 0) {
                System.out.println("Winner :- Computer");
            } else {
                System.out.println("Winner :- Player");
            }
        }
    }

}
