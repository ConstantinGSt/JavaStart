
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumberEngine {
    Player player1;
    Player player2;
    private String inpuName;
    private int secretNumber;
    private int answer;

    InputName(String inputName) {
        
    }

    System.out.println("Player first input your namme \n ");
    player1.setPlayerName(inpuName);

    System.out.println("Player second input your namme \n ");
    player2.setPlayerName(inpuName);

    System.out.println("Hello! We start game - Guess Number! \n ");
    System.out.println("You have to guess the number from 1 to 100 \n");
        
    while(secretNumber != answer) {
        System.out.println("Enter your number:");
            answer = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
            if(secretNumber > answer) {
                System.out.println("Your number less secret number \n");
            } else if(secretNumber < answer) {
                System.out.println("Your number more secret number \n ");
            } else if(secretNumber == answer) {
                System.out.println("You Win! Congratulations! \n ");
            }
    }
}