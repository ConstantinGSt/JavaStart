import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameLauncher {
    public static void main(String[] args) throws IOException {
        GuessNumberEngine game = new GuessNumberEngine();
        game.startGame();
    }
}
