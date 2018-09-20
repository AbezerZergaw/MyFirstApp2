import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {


        double millimeter = 25.4;
        double total;
        int x = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter number :");
            int input = scanner.nextInt();
            total = input * millimeter;
            System.out.println(input + " Inche =" +(int)total+ " MM");
        } while (x <= 15);
        x++;
    }

}
