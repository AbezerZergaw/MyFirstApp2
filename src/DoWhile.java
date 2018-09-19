import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {


        double millimeter = 25.4;
        double total;
        int x = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter number :");
            int j = scanner.nextInt();
            total = j * millimeter;
            System.out.println(j + " Inche =" +(int)total+ " MM");
        } while (x <= 15);
        x++;
    }

}
