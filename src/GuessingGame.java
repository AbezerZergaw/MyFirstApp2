import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
       // System.out.print( "Type some data for the program: " );


        int x=0 ;
        int secretNumber ;
        secretNumber =(int)(Math.random()*10);
        while (x <=10) {
            System.out.print( "Type some data for the program: " );
            if (x == secretNumber) {
                System.out.println("Your guess : " + x);
                System.out.println("That's right! You're a good guesser.");
                break;
            } else
                System.out.println("Your guess : " + x);
            System.out.println("That is incorrect. Guess again.");
            String input = scanner.nextLine();
            x++;
        }


    }


}
