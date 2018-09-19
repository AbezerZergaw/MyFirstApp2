import java.util.Scanner;

public class Game {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int secretNumber = (int) (Math.random() * 10);


        int count = 0;
        int secretNum = (int) (Math.random() * 5);
        System.out.println(secretNum);
        while (count < 5) {

            System.out.print("Guess a number : ");

            int j = scanner.nextInt();
            if (j == secretNum) {
                System.out.println("You are right : " + j + " is the secret number.");
                break;

            }else if (j < secretNum)
                System.out.println("Your guess is smaller than the secret number. Try again");

            else if (j > secretNum)
                System.out.println("Your guess is greater than the secret number. Try again");
            count++;
        }


    }


}


