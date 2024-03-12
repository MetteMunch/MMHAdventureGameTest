import java.util.Scanner;

public class UserInterface {


    //evt atributter og instances
    Scanner input = new Scanner(System.in);
    AdventureController controller = new AdventureController();
    String previousRoom = controller.roomNameThroughPlayer(); //variabel der skal bruges til at finde ud af om spilleren har flyttet sig


    //Constructor
    public UserInterface() {
        welcome();
        startAndPlayGame();

    }


    //Metoder getters og setters
    public void startAndPlayGame() {

        final String SENTINEL = "exit";
        String playerInput = " ";
        this.previousRoom = controller.roomNameThroughPlayer();



        while (!playerInput.toLowerCase().equals(SENTINEL)) {
            System.out.println("In what direction do you want to go: North, South, East og West?");
            System.out.println("Or type inventory, take, drop, help, look og exit.");
            playerInput = input.nextLine();

            switch (playerInput.toLowerCase()) {
                case "north", "go north", "n" -> {
                    controller.getMovePLayer("north");
                    roomAndLook();
                    itemsToBeFoundInRoom();

                }
                case "go south", "south", "s" -> {
                    controller.getMovePLayer("south");
                    roomAndLook();
                    itemsToBeFoundInRoom();
                }
                case "go east", "east", "e" -> {
                    controller.getMovePLayer("east");
                    roomAndLook();
                    itemsToBeFoundInRoom();
                }
                case "go west", "west", "w" -> {
                    controller.getMovePLayer("west");
                    roomAndLook();
                    itemsToBeFoundInRoom();
                }
                case "help" -> {
                    //helpMenu();
                }
                case "look" -> {
                    roomAndLook();
                }
                case "take" -> {
                    takeItemChoice();
                }
                case "drop" -> {
                    dropItemChoice();
                }
                case "inventory" -> {
                    itemsInPlayersInventory();
                }
                case "exit", "Exit" -> {
                    System.out.println("Thank you for playing and see you soon");
                    playerInput = SENTINEL;

                }
                default -> {
                    System.out.println("Sorry you entered a wrong command. \nPlease type either a direction you want to go or help, look or exit");
                    startAndPlayGame();
                }
            }
        }

    }

    public void welcome() {
        System.out.println(" ");
        System.out.println("Welcome to the AdventureGame");
        System.out.println("We hope you are ready for som action.");
        System.out.println(" ");
        System.out.println("You start in room1 where you find yourself standing on a \nbeautiful green hill with a marvelous view...");
    }

    public void roomAndLook() {
        if(controller.getPlayerPossibleToMove().equals("No")) {
            System.out.println("Unfortunately you cannot go in this direction");
            System.out.println("You are still in: " +controller.roomNameThroughPlayer());
        } else {
            System.out.println("You are in now in: " + controller.roomNameThroughPlayer());
            System.out.println(controller.roomDescriptionThroughPlayer());
        }
    }
    public void itemsToBeFoundInRoom() {
        if(!controller.listOfItemsInRoom().isEmpty()){
            System.out.println("You find following items in this room: ");
            for(Item i : controller.listOfItemsInRoom()){
                System.out.println(i.getItemName());
            } takeItemChoice();

        } else {
            System.out.println("There are no items in this room");
        }

    }

    public void takeItemChoice(){
        System.out.println("Do you want to take an item, yes or no?");
        String playerChoice = input.nextLine();
        switch (playerChoice.toLowerCase()) {
            case "no" -> {
                System.out.println("Then let us move on");
            }
            case "yes" -> {
                System.out.println("What item do you want to take?");
                String chosenItem = input.nextLine();
                controller.playerTakeItem(chosenItem);
                System.out.println("You now have " +chosenItem + " in your bag");
            }
            default -> {
                System.out.println("Sorry you entered a wrong command. \nPlease type either yes or no");

            }
        }


    }
    public void itemsInPlayersInventory(){
        if(!controller.listOfPlayersInventory().isEmpty()) {
            System.out.println("You have following items in your bag: ");
            for(Item i : controller.listOfPlayersInventory()){
                System.out.println(i.getItemName());
            } dropItemChoice();

        } else {
            System.out.println("You have no items in your bag");
        }

    }

    public void dropItemChoice() {
        System.out.println("Do you want to drop an item in this room, yes or no?");
        String playerChoice = input.nextLine();
        switch (playerChoice.toLowerCase()) {
            case "no" -> {
                System.out.println("Then let us move on");
            }
            case "yes" -> {
                System.out.println("What item do you want to drop?");
                String chosenItem = input.nextLine();
                controller.playerDropItem(chosenItem);
                System.out.println("You now have in your bag: " + controller.listOfPlayersInventory().toString());
            }
            default -> {
                System.out.println("Sorry you entered a wrong command. \nPlease type either yes or no");

            }
        }

    }


}
