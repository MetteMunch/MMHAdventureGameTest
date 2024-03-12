public class Map {
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



    //Constructor//
    public Map() {
        makeGameScene();
        this.currentRoom = room1;
        createAndPlaceItems();
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
    public void createAndPlaceItems (){

            Item itemKnife = new Item("Knife", "a small knife as sharp as a racor blade.");
            Item itemSword = new Item("Sword", "a great and terrifying sword, but as light as a feather.");
            Item itemAxe = new Item("Axe", "an axe made by evil forces.");
            Item itemFirstAidKit = new Item("First Aid Kit", "a kit which can heal all wounds.");

            room3.addItemToRoom(itemKnife);
            room3.addItemToRoom(itemSword);
            room3.addItemToRoom(itemAxe);
            room7.addItemToRoom(itemFirstAidKit);

    }

    public Room getCurrentRoom() {
        return currentRoom;
    }


}
