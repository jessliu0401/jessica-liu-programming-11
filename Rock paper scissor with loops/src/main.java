
    //import scanner and random picker
import java.util.Scanner;
import java.util.Random;
    public class main {
        public static void main(String[] args) {

            // this is the variables we are going to use
            int playerpoint;// this is how many times player wins
            playerpoint = 0;
            int computerpoint;// this is how many times player loses
            computerpoint = 0;
            int computernumber;//for the computer to pick random moves. we translate this number into actual moves
            String playerMove;// player input (r, p, s, x)
            String playeroutput;// what player chose(rock, paper, scissors)
            String computermove;// what computer picks(rock, paper, scissors)

//introductions to greet the user
            System.out.println("choose rock paper or scissors,'r' for rock, 'p' for paper and 's' for scissors. To exit choose 'x'");

            // this game is set that once a player or the computer reaches 10 points, the game is over
            while (playerpoint < 10 && computerpoint < 10) {

                //scanner takes in user move and assign the value to a variable representing the player's move
                Scanner scan = new Scanner(System.in);
                System.out.println("*****************************************");
                System.out.println("player choice:");
                playerMove = (scan.next());

                //if the player's move in neither rock, paper or scissor,the program will tell the user to try again
                while (!playerMove.equals("s") && !playerMove.equals("p") && !playerMove.equals("r") && !playerMove.equals("x")) {
                    System.out.println("invalid selection, please retry");
                    System.out.println("********************************************************************************");
                    System.out.println("player choice:");
                    playerMove = (scan.next()); }

                // if player chooses "quit" then the game stops
                if (playerMove.equals("x")) {
                    System.out.println("Thank you for playing");
                    break; }

                // if player move is valid, computer will randomly generate a number from 1 to 3
                if (playerMove.equals("s") || playerMove.equals("r") || playerMove.equals("p")) {

                    Random generator = new Random();
                    computernumber = generator.nextInt(3) + 1;
                    /*the randomly generated numbers that are assigned with a move,
                    where 1 is rock, paper is 2 and scissor is 3
                     */
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
                    // for each win, the player or the computer gets one point
                    //if player's move and the computer's move is the same, they have a tie. neither of them earns points
                    if (playeroutput.equals(computermove)){
                     System.out.println("Draw!");
                     System.out.println("Wins " + playerpoint + "\t" + "Losses " + computerpoint);}

                        //if player chooses rock, when computer retaliates with paper, they lose, otherwise they win
                    else if (playeroutput.equals("rock"))
                        if (computermove.equals("paper")){
                            System.out.println("You lose!");
                            computerpoint++;
                            System.out.println("Wins " + playerpoint + "\t" + "Losses " + computerpoint);}
                            else {System.out.println("You win!");
                            playerpoint++;
                            System.out.println("Wins " + playerpoint + "\t" + "Losses " + computerpoint);}

                        //if player chooses scissors, when computer retaliates with rock, they lose, otherwise they win
                    else if (playeroutput.equals("scissors"))
                        if (computermove.equals("rock")){
                            System.out.println("You lose!");
                            computerpoint++;
                            System.out.println("Wins " + playerpoint + "\t" + "Losses " + computerpoint);}

                        else {System.out.println("You win!");
                            playerpoint++;
                            System.out.println("Wins " + playerpoint + "\t" + "Losses " + computerpoint);}

                        // if player chooses paper, when computer picks rock, they win, otherwise they lose
                    else if (playeroutput.equals("paper"))
                        if (computermove.equals("rock")){
                            System.out.println("You win!");
                        playerpoint++;
                            System.out.println("Wins " + playerpoint + "\t" + "Losses " + computerpoint);}
                        else {System.out.println("You lose!");
                            computerpoint++;
                            System.out.println("Wins " + playerpoint + "\t" + "Losses " + computerpoint);}


                    // this part displays the player's selection as well as the computer's selections
                    System.out.print("player choice:" + playeroutput + "\t" );
                    System.out.println("computer choice: " + computermove);


                }
                /* after the player or the computer reaches 10 points, the game is over. This displays
            how much points they each get and who wins
             */
                {System.out.println("***********************************************");
                    System.out.println("Final results");
                    System.out.println("Wins " + playerpoint + "\tlose" + computerpoint);
                    if (playerpoint > computerpoint){
                        System.out.println("You win");}
                    else if(playerpoint == computerpoint){
                        System.out.println("you draw");}
                    else System.out.println("you lose");}
            }




            }
        }

