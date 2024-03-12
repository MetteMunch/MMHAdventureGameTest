import java.util.ArrayList;

public class Player {
    private String possibleToMove;
    private Room currentRoom;
    private ArrayList<Item> listOfPlayersInventory;


    ///Constructor///
    public Player(Room startRoom) {
        currentRoom = startRoom;
        listOfPlayersInventory = new ArrayList<Item>();

    }

    public void movePlayer(String playerDirection) {
        possibleToMove = "Yes";

        switch (playerDirection) {
            case "north" -> {
                if (currentRoom.getRoomToNorth() != null) {
                    currentRoom = currentRoom.getRoomToNorth();
                } else this.possibleToMove = "No";
            }
            case "south" -> {
                if (currentRoom.getRoomToSouth() != null) {
                    currentRoom = currentRoom.getRoomToSouth();
                } else this.possibleToMove = "No";
            }
            case "east" -> {
                if (currentRoom.getRoomToEast() != null) {
                    currentRoom = currentRoom.getRoomToEast();
                } else this.possibleToMove = "No";
            }
            case "west" -> {
                if (currentRoom.getRoomToWest() != null) {
                    currentRoom = currentRoom.getRoomToWest();
                } else this.possibleToMove = "No";

            }
        }
    }

    //Skal have en metode til at tilføje og fjerne items fra Arraylist samt visning af hele listen
    //player skal også have metode til dropItem og takeItem (flytter et item fra current room og til player objekt og omvendt
    /*public ArrayList<Item> dropItem (String chosenItem) {
        for(Item item : listOfPlayersInventory) {
            if(getRoomNameThroughPlayer().equalsIgnoreCase(chosenItem)) {
                currentRoom.addItemToRoom(item);
                removeItemFromPlayerInventory(item);
            } return listOfPlayersInventory;
        } return listOfPlayersInventory;

    }*/
    public void dropItem (String chosenItem) {
        for(Item item : listOfPlayersInventory) {
            if(item.getItemName().equalsIgnoreCase(chosenItem)) {
                currentRoom.addItemToRoom(item);
                removeItemFromPlayerInventory(item);
                break;
            }
        }

    }
    public void takeItem(String chosenItem) {
        for(Item item : currentRoom.getListOfItemsInRoom()) {
            if(item.getItemName().equalsIgnoreCase(chosenItem)) {
                currentRoom.removeItemFromRoom(item);
                addItemToPlayerInventory(item);
                break;
            }
        }
    }

    /*public ArrayList<Item> takeItem(String chosenItem) {
        for(Item item : currentRoom.getListOfItemsInRoom()) {
            if(getRoomNameThroughPlayer().equalsIgnoreCase(chosenItem)) {
                currentRoom.removeItemFromRoom(item);
                addItemToPlayerInventory(item);
            } return listOfPlayersInventory;
        } return listOfPlayersInventory;
    }*/

    public void addItemToPlayerInventory(Item item) {
        listOfPlayersInventory.add(item);
    }

    public void removeItemFromPlayerInventory(Item item) {
        listOfPlayersInventory.remove(item);
    }

    public ArrayList<Item> getListOfPlayersInventory() {
        return listOfPlayersInventory;
    }

    public String getRoomNameThroughPlayer() {
        return currentRoom.getRoomName();
    }

    public String getRoomDescriptionThroughPlayer() {
        return currentRoom.getRoomDescription();
    }

    public String getPossibleToMove() {
        return possibleToMove;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
}
