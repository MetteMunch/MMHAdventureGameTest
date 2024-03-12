import java.util.ArrayList;

public class Room {
    //evt atributter og instances
    private String roomName;
    private String roomDescription;
    private Room roomToNorth;
    private Room roomToWest;
    private Room roomToSouth;
    private Room roomToEast;
    private ArrayList<Item> listOfItemsInRoom;

    //Constructor
    public Room(String roomName, String roomDescription){
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        roomToNorth = null;
        roomToSouth = null;
        roomToEast = null;
        roomToWest = null;
        listOfItemsInRoom = new ArrayList<Item>();
    }


    //Metoder getters og setters
    //Skal have en metode til at tilføje og fjerne items fra Arraylist samt visning af hele listen

    public void addItemToRoom (Item item){
        listOfItemsInRoom.add(item);
    }

    public void removeItemFromRoom (Item item){
        listOfItemsInRoom.remove(item);
    }


    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public Room getRoomToNorth() {
        return roomToNorth;
    }

    public void setRoomToNorth(Room roomToNorth) {
        this.roomToNorth = roomToNorth;
    }

    public Room getRoomToWest() {
        return roomToWest;
    }

    public void setRoomToWest(Room roomToWest) {
        this.roomToWest = roomToWest;
    }

    public Room getRoomToSouth() {
        return roomToSouth;
    }

    public void setRoomToSouth(Room roomToSouth) {
        this.roomToSouth = roomToSouth;
    }

    public Room getRoomToEast() {
        return roomToEast;
    }

    public void setRoomToEast(Room roomToEast) {
        this.roomToEast = roomToEast;
    }

    public ArrayList<Item> getListOfItemsInRoom() {
        return listOfItemsInRoom;
    }
}
