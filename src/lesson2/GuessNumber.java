import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessNumber {
    private int secretNumber;
    private char againWhile;
    private Player p1;
    private Player p2;
    GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void startGame() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nHello! We start game - Guess Number!");
        System.out.println("You have to guess the number from 0 to 100 \n");
    
        Random randomInt = new Random();
        secretNumber = randomInt.nextInt(101); 

        do {
            do {
                System.out.println(p1.getName() + " Enter your number:");
                int p1Num = Integer.parseInt(reader.readLine());
                p1.setAnswer(p1Num);
                System.out.println(p2.getName() + " Enter your number:");
                int p2Num = Integer.parseInt(reader.readLine());
                p2.setAnswer(p2Num);
                
                if(p1.getAnswer() == secretNumber) {
                    System.out.println(p1.getName() + " You Win! Congratulations!");
                } else if(p1.getAnswer() < secretNumber) {
                     System.out.println(p1.getName() + " Your number less < secret number");
                } else if(p1.getAnswer() > secretNumber) {
                    System.out.println(p1.getName() + " Your number more > secret number");
                }
                if(p2.getAnswer() == secretNumber) {
                    System.out.println(p2.getName() + " You Win! Congratulations!");
                } else if(p2.getAnswer() < secretNumber) {
                    System.out.println(p2.getName() + " Your number less < secret number");
                } else if(p2.getAnswer() > secretNumber) {
                    System.out.println(p2.getName() + " Your number more > secret number");
                }

            } while(p1.getAnswer() != secretNumber && p2.getAnswer() != secretNumber);

            do {
                System.out.println("Dou you wont to play the \"Gues Number\" again?" + "\n" + 
                                "Inter \"y\" or \"n\" ");
                BufferedReader again = new BufferedReader(new InputStreamReader(System.in));
                againWhile = (char) again.read();
            } while (againWhile !='y' & againWhile !='n');

        } while (againWhile =='y');
    }
}