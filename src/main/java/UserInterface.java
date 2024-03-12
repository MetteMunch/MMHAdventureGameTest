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
            System.out.println("In what direction do you want to go?");
            playerInput = input.nextLine();

            switch (playerInput.toLowerCase()) {
                case "north", "go north", "n" -> {
                    controller.getMovePLayer("north");
                    roomAndLook();

                }
                case "go south", "south", "s" -> {
                    controller.getMovePLayer("south");
                    roomAndLook();
                }
                case "go east", "east", "e" -> {
                    controller.getMovePLayer("east");
                    roomAndLook();
                }
                case "go west", "west", "w" -> {
                    controller.getMovePLayer("west");
                    roomAndLook();
                }
                case "help" -> {
                    //helpMenu();
                }
                case "look" -> {
                    roomAndLook();
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
        System.out.println("Welcome to the AdventureGame");
        System.out.println("We will take you on around...");
        System.out.println("You start in room1 where you find yourself standing on a \nbeautiful green hill with w marvelous view...");
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



}
