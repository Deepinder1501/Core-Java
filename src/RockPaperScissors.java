import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome");
        System.out.println("Enter choice: ");
        System.out.println("1 Rock");
        System.out.println("2 Paper");
        System.out.println("3 Scissors");

        System.out.print("Your choice: ");
        int uC = scanner.nextInt();

        if (uC < 1 || uC > 3) {
            System.out.println("Invalid");
            return;
        }

        int cC = random.nextInt(3)+1;

        System.out.println("You chose: " + getChoiceName(uC));
        System.out.println("Computer chose: " + getChoiceName(cC));

        if (uC == cC) {
            System.out.println("Tie!");
        } else if ((uC == 1 && cC == 3) ||
                   (uC == 2 && cC == 1) || 
                   (uC == 3 && cC == 2)) { 
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }

        scanner.close();
    }

    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid";
        }
    }
}
//using random function print all the arithematic and relational operators switch case in java 
