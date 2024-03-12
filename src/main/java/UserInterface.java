import java.util.Scanner;

public class UserInterface {



    //evt atributter og instances
    Scanner input = new Scanner(System.in);



    //Constructor
    public UserInterface(){
        welcome();
        startAndPlayGame();

    }


    //Metoder getters og setters
    public void startAndPlayGame(){

        final String SENTINEL = "exit";
        String playerInput = " ";


        while(!playerInput.toLowerCase().equals(SENTINEL)) {
            System.out.println("In what direction do you want to go?");
            playerInput = input.nextLine();

            switch (playerInput) {
                case "north", "go north","n" -> {
                    System.out.println("vi går mod nord");
                    //System.out.println("and in what direction do you want to move now?");
                    //playerInput = input.nextLine();
                }
                case "go south", "south", "s" -> {
                    System.out.println("vi går mod syd");
                    //System.out.println("and in what direction do you want to move now?");
                    //playerInput = input.nextLine();
                }
                case "go east", "east", "e" -> {
                    System.out.println("vi går mod øst");
                    //System.out.println("and in what direction do you want to move now?");
                    //playerInput = input.nextLine();
                }
                case "go west", "west", "w" -> {
                    System.out.println("vi går mod vest");
                    //System.out.println("and in what direction do you want to move now?");
                    //playerInput = input.nextLine();
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
    public void welcome(){
        System.out.println("Welcome to the AdventureGame");
        System.out.println("We will take you around...");
        System.out.println("You start in room1 where you find yourself standing on a \nbeautiful green hill with w marvelous view...");

    }

}
