import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessNumberEngine {
    private int secretNumber;
    private char againWhile;
    Player player1 = new Player();
    Player player2 = new Player();
    
    public void startGame() throws IOException {  // долбанные исключения
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Player first input your namme");
        String p1 = reader.readLine();
        player1.setName(p1);
        
        System.out.println("Player second input your namme");
        String p2 = reader.readLine();
        player2.setName(p2);
        
        System.out.println("\nHello! We start game - Guess Number!");
        System.out.println("You have to guess the number from 1 to 100 \n");
        
        Random randomInt = new Random();
        secretNumber = randomInt.nextInt(100)+1; 

        do {
            do {
                System.out.println(player1.getName() + " Enter your number:");
                int p1Num = Integer.parseInt(reader.readLine());
                player1.setAnswer(p1Num);
                System.out.println(player2.getName() + " Enter your number:");
                int p2Num = Integer.parseInt(reader.readLine());
                player2.setAnswer(p2Num);
                
                if(player1.getAnswer() == secretNumber) {
                    System.out.println(player1.getName() + " You Win! Congratulations!");
                } else if(player1.getAnswer() < secretNumber) {
                     System.out.println(player1.getName() + " Your number less < secret number");
                } else if(player1.getAnswer() > secretNumber) {
                    System.out.println(player1.getName() + " Your number more > secret number");
                }
                if(player2.getAnswer() == secretNumber) {
                    System.out.println(player2.getName() + " You Win! Congratulations!");
                } else if(player2.getAnswer() < secretNumber) {
                    System.out.println(player2.getName() + " Your number less < secret number");
                } else if(player2.getAnswer() > secretNumber) {
                    System.out.println(player2.getName() + " Your number more > secret number");
                }
                        
            } while(player1.getAnswer() != secretNumber && player2.getAnswer() != secretNumber);
                        
            do {
                System.out.println("Dou you wont to play the \"Gues Number\" again?" + "\n" + 
                                "Inter \"y\" or \"n\" ");
                BufferedReader again = new BufferedReader(new InputStreamReader(System.in));
                againWhile = (char) again.read();
            } while (againWhile !='y' & againWhile !='n');

        } while (againWhile =='y');
    }
}