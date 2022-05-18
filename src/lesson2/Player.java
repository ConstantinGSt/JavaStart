public class Player {
    private String name;

    Player() {
    }

    Player(String name){
        this.name = name;
    }

    public void setPlayerName(String inputName) {
        inputName = new BufferedReader(new InputStreamReader(System.in));
        this.name = inputName.readLine();
    }

    public String getPlayerName() {
        return name;
    }
}
