
//import scanner and random picker
import java.util.Scanner;
import java.util.Random;
public class main {
    public static void main(String[] args) {

        // this is the variables we are going to use
        int computernumber;//for the computer to pick random moves
        String playerMove;// player input (r, p, s)
        String playeroutput;// what player chose(rock, paper, scissors)
        String computermove;// what computer picks(rock, paper, scissors)

//introductions to greet the user
        System.out.println("choose rock paper or scissors,'r' for rock, 'p' for paper and 's' for scissors");

        //scanner takes in user move and assign the value to a variable representing the player's move
        Scanner scan = new Scanner(System.in);
        playerMove = (scan.next());
        //if the player's move in neither rock, paper or scissor,the program will tell the user to try again
        if (!playerMove.equals("s") && !playerMove.equals("p") && !playerMove.equals("r")) {
            System.out.println("invalid selection,please play again");
        } else {//move is valid, computer will randomly generate a number from 1 to 3
            Random generator = new Random();
            computernumber = generator.nextInt(3) + 1;
            //the randomly generated numbers are assigned with a move, where 1 is rock, paper is 2 and scissor is 3
            if (computernumber == 1)
                computermove = "rock";
            else if (computernumber == 2)
                computermove = "paper";
            else computermove = "scissors";

            // then we translate the initial letters "r, p and s" into actual moves(rock, paper, scissors)
            // this is so that the player move can be more easily compared with the computer's move
            if (playerMove.equals("s"))
                playeroutput = "scissors";
            else if (playerMove.equals("r"))
                playeroutput = "rock";
            else playeroutput = "paper";

            // now we determine if player wins or loses
            //if player's move and the computer's move is the same, they have a tie.
        if (playeroutput.equals(computermove))
                System.out.println("Draw!");
                //if player chooses rock, when computer retaliates with paper, they lose, otherwise they win
            else if (playeroutput.equals("rock"))
                if (computermove.equals("paper"))
                    System.out.println("You lose!");
                else System.out.println("You win!");
                //if player chooses scissors, when computer retaliates with rock, they lose, otherwise they win
            else if (playeroutput.equals("scissors"))
                if (computermove.equals("rock"))
                    System.out.println("You lose!");
                else System.out.println("You win!");
                // if player chooses paper, when computer picks rock, they win, otherwise they lose
            else if (playeroutput.equals("paper"))
                if (computermove.equals("rock"))
                    System.out.println("You win!");
                else System.out.println("You lose!");


            else System.out.println("invalid move");
            // this part displays the player's selection as well as the computer's selections
            System.out.print("player choice:" + playeroutput + "    ");
            System.out.print("computer choice: " + computermove);
            // feel free to try this program out~

        }
    }
}












