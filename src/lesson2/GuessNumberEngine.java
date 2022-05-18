
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumberEngine {
    Player player1;
    Player player2;
    //private String inpuName;
    private int secretNumber;
    private int answer;
    //private String name;
    /*InputName(String inputName) {
       
    } */
    public int setAnswer(int inputNumber) {
        inputNumber = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        this.answer = inputNumber;
    }
    startGame() {
        System.out.println("Player first input your namme \n ");
        player1.setName();

        System.out.println("Player second input your namme \n ");
        player2.setName();

        System.out.println("Hello! We start game - Guess Number! \n ");
        System.out.println("You have to guess the number from 1 to 100 \n");
        
        Random randomInt = new Random();
        //int answer = randomInt.nextInt(101);
        secretNumber = randomInt.nextInt(101); 

        do {
            System.out.println(player1.name + " Enter your number:\n");
            player1.setAnswer();
            System.out.println(player2.name + " Enter your number:\n");
            player2.setAnswer();
                if(player1.answer == secretNumber) {
                    System.out.println(player1.name + "You Win! Congratulations! \n ");
                    break;
                } else if(player1.answer < secretNumber) {
                    System.out.println(player1.name + " Your number more secret number \n ");
                    break;
                } else if(player1.answer > secretNumber) {
                    System.out.println(player1.name + " Your number less secret number \n");
                    break;
                }
                if(player2.answer == secretNumber) {
                    System.out.println(player2.name + "You Win! Congratulations! \n ");
                    break;
                } else if(player2.answer < secretNumber) {
                    System.out.println(player2.name + " Your number more secret number \n ");
                    break;
                } else if(player2.answer > secretNumber) {
                    System.out.println(player2.name + " Your number less secret number \n");
                    break;
                }
                
        } while(player1.answer != secretNumber && player2.answer != secretNumber);
    }
}