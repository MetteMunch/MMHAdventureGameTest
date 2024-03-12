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

    public String roomNameThroughPlayer(){
        return player.getRoomNameThroughPlayer();
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