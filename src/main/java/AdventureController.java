public class AdventureController {

    //evt atributter og instances
    private Room currentRoom;
    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;
    private Room room5;
    private Room room6;
    private Room room7;
    private Room room8;
    private Room room9;
    private String possibleToMove;


    //Constructor
    public AdventureController() {
        makeGameScene();
        currentRoom = room1;
    }

    public void makeGameScene() {
        room1 = new Room("Room1", "a nice green hill with a marvelous view");
        room2 = new Room("Room2", "a dark cave with a thousands bats");
        room3 = new Room("Room3", "a huge castle with a lot of towers");
        room4 = new Room("Room4", "a noisy and polluted metropolis");
        room5 = new Room("Room5", "a cozy cabin with a fireplace");
        room6 = new Room("Room6", "a cold and rushing river");
        room7 = new Room("Room7", "a high and impassable mountain");
        room8 = new Room("Room8", "a lovely tropical beach");
        room9 = new Room("Room9", "a beautiful old castle");

        room1.setRoomToEast(room2);
        room1.setRoomToSouth(room4);

        room2.setRoomToWest(room1);
        room2.setRoomToEast(room3);

        room3.setRoomToWest(room2);
        room3.setRoomToSouth(room6);

        room4.setRoomToNorth(room1);
        room4.setRoomToSouth(room7);

        room5.setRoomToSouth(room8);

        room6.setRoomToNorth(room3);
        room6.setRoomToSouth(room9);

        room7.setRoomToNorth(room4);
        room7.setRoomToEast(room8);

        room8.setRoomToWest(room7);
        room8.setRoomToNorth(room5);
        room8.setRoomToEast(room9);

        room9.setRoomToNorth(room6);
        room9.setRoomToWest(room8);

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

    public String getPossibleToMove() {
        return possibleToMove;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    //Metoder getters og setters

}