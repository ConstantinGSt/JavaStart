import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameLauncher {
    public static void main(String[] args) throws IOException {
        private char againWhile;
        GuessNumberEngine game = new GuessNumberEngine();
        do { 
            
            game.startGame();
                        
            do {
                System.out.println("Dou you wont to play the \"Gues Number\" again?" + "\n" + 
                                "Inter \"y\" or \"n\" ");
                BufferedReader again = new BufferedReader(new InputStreamReader(System.in));
				againWhile = (char) again.read();
			} while (againWhile !='y' & againWhile !='n');

            } while (againWhile =='y');
        }
    }
    
}
