import java.util.ArrayList;
import java.util.HashMap;

public class PlayersController {

   private static HashMap<String, Player> playersMap;
    /////////////////////////////////////////
   private static ArrayList<Player> playerList;
    private static int numberOfPlayers ;
    //////////به متدش نگاه کن+static
    private static Player currentPlayer;

/////////فکری باری numberOfPlayers شود/////
    public PlayersController() {
        //playerList = this.getPlayers();
    }

    static {
        findCurrentPlayer();
    }

    public void createPlayers(String[] playersNames) {

        playersMap = new HashMap<>();
        for (int i = 0; i < playersNames.length; i++) {
            playersMap.put(playersNames[i], new Player(playersNames[i], getDefaultNumOfSoldiers()));
        }
        playerList = new ArrayList<Player>(playersMap.values());
    }


    public static ArrayList<Player> getPlayerList(){
        return playerList;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        PlayersController.numberOfPlayers = numberOfPlayers;
    }

    public static int getNumberOfPlayers() {
        return numberOfPlayers;
    }
/////////////////////////////////////////////////
    public static void findCurrentPlayer(){
        playerList.add(playerList.get(0));
        currentPlayer = playerList.get(0);
        playerList.remove(0);
    }

    public static int getDefaultNumOfSoldiers() {

        if (PlayersController.getNumberOfPlayers() == 2) {
            return 30;
        } else if (PlayersController.getNumberOfPlayers() == 3) {
            return 25;
        }
        return 20;
    }

    public static Player getCurrentPlayer(){
        return currentPlayer;
    }



}
