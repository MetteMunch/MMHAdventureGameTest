import java.util.ArrayList;

public class AdventureController {

    //evt atributter og instances
    Map map;
    Player player;



    //Constructor
    public AdventureController() {
        map = new Map();
        player = new Player(map.getCurrentRoom());

    }

    //////PLAYER///////
    public void getCurrentRoom(){
        player.getCurrentRoom();
    }

    public ArrayList<Item> listOfPlayersInventory () {
        return player.getListOfPlayersInventory();
    }

    public ArrayList<Item> listOfItemsInRoom(){
        return player.getCurrentRoom().getListOfItemsInRoom();
    }

    public String roomNameThroughPlayer(){
        return player.getRoomNameThroughPlayer();
    }

    public void playerDropItem (String chosenItem){
        player.dropItem(chosenItem);
    }

    public void playerTakeItem (String chosenItem) {
        player.takeItem(chosenItem);
    }

    public String roomDescriptionThroughPlayer(){
        return player.getRoomDescriptionThroughPlayer();
    }

    public void getMovePLayer (String playerDirection){
        player.movePlayer(playerDirection);
    }

    public String getPlayerPossibleToMove() {
        return player.getPossibleToMove();
    }



}