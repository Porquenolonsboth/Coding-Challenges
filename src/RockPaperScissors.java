import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        String myChoice;
        Scanner kb = new Scanner(System.in);
        System.out.println("Hello, Welcome to the Thunder Dome!");
        int i = 1;
        do {
            System.out.println("type 'R' for 'Rock','P' for 'Paper', or 'S' for 'Scissors'.");
            myChoice = kb.next();
            myChoice = myChoice.toUpperCase();
            Random selector = new Random();
            String comPick = new String();
            int comChoice = selector.nextInt(3) + 1;
            if (comChoice == 1) {
                comPick = "R";
                System.out.println(comPick);
            }
            if (comChoice == 2) {
                comPick = "P";
                System.out.println(comPick);
            }
            if (comChoice == 3) {
                comPick = "S";
                System.out.println(comPick);
            }


            //  System.out.print(comPick + " " + myChoice);

            //the logic loop
            if (myChoice.equals(comPick)) {
                System.out.println("It's a tie!");
            } else if (myChoice.equals("R")) {
                if (comPick.equals("S"))
                    System.out.println("Rock crushes scissors. You win!!");
                else if (comPick.equals("P"))
                    System.out.println("Paper eats rock. You lose!!");
            } else if (myChoice.equals("P")) {
                if (comPick.equals("S"))
                    System.out.println("Scissor cuts paper. You lose!!");
                else if (comPick.equals("R"))
                    System.out.println("Paper eats rock. You win!!");
            } else if (myChoice.equals("S")) {
                if (comPick.equals("P"))
                    System.out.println("Scissor cuts paper. You win!!");
                else if (comPick.equals("R"))
                    System.out.println("Rock breaks scissors. You lose!!");
            } else {
                System.out.println("Invalid user input.");
            }
            System.out.println("Would you like to play again? 1= yes 0 = no");
            i = kb.nextInt();
            


        } while ( i == 1);
    }
}

