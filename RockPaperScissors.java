import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    int choice;
    String computerChoice;

    void playerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");
        System.out.println("choose the number you want as your choice");
        
        choice = 0;

        while(choice<1||choice>3){
            System.out.println("Choose between 1, 2 and 3");
            choice = Integer.parseInt(scanner.nextLine());
            if(choice<1||choice>3){
                System.out.println("Invalid Input! Try again");
            }
        }

        switch (choice){
            case 1:
                System.out.println("1. You chose rock");
                break;
            case 2:
                System.out.println("2. You chose paper");
                break;
            case 3:
                System.out.println("3. You chose scissor");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    void CompInput(){
        String[] choices={"Rock", "Paper", "Scissor"};
        Random random = new Random();

        computerChoice=choices[random.nextInt(choices.length)];
        System.out.println("Computer chose " + computerChoice);
    }

    void winningCondition(){
        String playerChoice;
        if(choice == 1) playerChoice="Rock";
        else if(choice == 2) playerChoice="Paper";
        else playerChoice="Scissor";

        if(playerChoice.equals(computerChoice)){
            System.out.println("Draw!");
        } else if((playerChoice.equals("Rock") && computerChoice.equals("Scissor")) || (playerChoice.equals("Paper") && computerChoice.equals("Rock")) || (playerChoice.equals("Scissor") && computerChoice.equals("Paper"))){
            System.out.println("You Won!");
        } else{
            System.out.println("You Lose!");
        }
    }

    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.playerInput();
        game.CompInput();
        game.winningCondition();
    }
}
