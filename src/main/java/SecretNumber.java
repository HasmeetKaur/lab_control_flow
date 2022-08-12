import java.util.Scanner;
public class SecretNumber {
    public static void main(String[] args){
        // put code in here

        // Welcome message
        String startMessage;
        startMessage = "Welcome to Hasmeet's Secret Number Game! Please take a guess of the secret number which is between 0 and 10.";
        System.out.println(startMessage);
        // input number
        Scanner userInput = new Scanner(System.in);

        int secretNumber;
        // generates a random number
        secretNumber = (int) (Math.random() * 10);
        int guessNumber = 0;

        // define the guess number
        System.out.print("Please enter your guess of the secret number here: ");
        guessNumber = userInput.nextInt ();
        System.out.println(guessNumber);

        // check the number guessed and pass a message dependent on it
        if (guessNumber == secretNumber) {
            System.out.println("Yey! You successfully guessed the secret number. It was "+secretNumber+"!");
        } else if (guessNumber < secretNumber){
            System.out.println("Your guess is lower than the secret number. The secret number was "+secretNumber+". Play again and please remember it will be a new secret number!");
        } else if (guessNumber > secretNumber){
            System.out.println("Your guess is higher than the secret number. The secret number was "+secretNumber+". Play again and please remember it will be a new secret number!");
        }
    }
}

