import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int generatedNumber = random.nextInt(100) + 1;
	   while (true) 
	     {          
                System.out.print("Guess the number between 1 and 100: ");
                int userGuess = scanner.nextInt();
                  if (userGuess < generatedNumber)
		    {
                       System.out.println("Too low! Try again.");
                    } 
		else if (userGuess > generatedNumber)
    		   {
                      System.out.println("Too high! Try again.");
                   }
	        else 
		  {
                     System.out.println("Congratulations! You guessed the correct number: " + generatedNumber);
                    break;
                  }
           }    

        scanner.close();
    }
}
