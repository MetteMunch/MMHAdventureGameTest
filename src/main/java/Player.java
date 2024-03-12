public class Player {
    private String possibleToMove;
    private Room currentRoom;


    ///Constructor///
    public Player(Room startRoom) {
        currentRoom = startRoom;

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

    public String getRoomNameThroughPlayer() {
        return currentRoom.getRoomName();
    }

    public String getRoomDescriptionThroughPlayer () {
        return currentRoom.getRoomDescription();
    }

    public String getPossibleToMove() {
        return possibleToMove;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
}
