import java.util.Scanner;

public class UserInterface {


    //evt atributter og instances
    Scanner input = new Scanner(System.in);
    AdventureController controller = new AdventureController();
    String previousRoom = controller.getCurrentRoom().getRoomName(); //variabel der skal bruges til at finde ud af om spilleren har flyttet sig


    //Constructor
    public UserInterface() {
        welcome();
        startAndPlayGame();

    }


    //Metoder getters og setters
    public void startAndPlayGame() {

        final String SENTINEL = "exit";
        String playerInput = " ";
        this.previousRoom = controller.getCurrentRoom().getRoomName();



        while (!playerInput.toLowerCase().equals(SENTINEL)) {
            System.out.println("In what direction do you want to go?");
            playerInput = input.nextLine();

            switch (playerInput) {
                case "north", "go north", "n" -> {
                    controller.movePlayer("north");
                    roomAndLook();

                }
                case "go south", "south", "s" -> {
                    controller.movePlayer("south");
                    roomAndLook();

                }
                case "go east", "east", "e" -> {
                    controller.movePlayer("east");
                    roomAndLook();

                }
                case "go west", "west", "w" -> {
                    controller.movePlayer("west");
                    roomAndLook();

                }
                case "look" -> {
                    roomAndLook();
                }
                case "exit", "Exit" -> {
                    System.out.println("Thankyou for playing and see you soon");
                    playerInput = SENTINEL;

                }
                default -> {
                    System.out.println("Sorry you entered a wrong command. \nPlease type either a direction you want to go, help or exit");
                    startAndPlayGame();
                }
            }
        }

    }

    public void welcome() {
        System.out.println("Welcome to the AdventureGame");
        System.out.println("We will take you around...");
        System.out.println("You start in room1 where you find yourself standing on a \nbeautiful green hill with w marvelous view...");
    }

    public void roomAndLook() {
        if(controller.getPossibleToMove().equals("No")) {
            System.out.println("Unfortunately you cannot go in this direction");
            System.out.println("You are still in: " +controller.getCurrentRoom().getRoomName());
        } else {
            System.out.println("You are in now in: " + controller.getCurrentRoom().getRoomName());
            System.out.println(controller.getCurrentRoom().getRoomDescription());
        }
    }

    //public void

}
