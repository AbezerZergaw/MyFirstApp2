import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {


        double millimeter = 25.4;
        double total;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversion chart for loop");


        for (int x = 1; x <= 15; x++) {
            System.out.println("Enter number :");
            int input = scanner.nextInt();
            total = input * millimeter;

            System.out.println(input + " Inche =" + total +"MM");

        }
    }

}
