import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        double millimeter = 25.4;
        double total;

        Scanner scanner = new Scanner(System.in);

        int x = 1;
        while (x <= 15) {
            System.out.println("Enter number :");
            int j = scanner.nextInt();
            total = j * millimeter;

            System.out.println(j + " Inche =" +(int)total+ " MM");
            x++;
        }
    }


}
