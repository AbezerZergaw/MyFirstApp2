import java.util.Scanner;

public class Cards {
    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {

       // System.out.println(getVal2(card));

        String char1 = "J";
        String char2 = "Q";
        String char3 = "K";
        String char4 = "A";
        int convertd = 10;

        //System.out.println("Enter the face cards J, Q, K, or A");

        // String card = sc.nextLine();
        //int changed =Integer.parseInt(card);
/*
        switch (card) {
            case "J":
                System.out.println(card + " Value is; " + 10);
                break;
            case "Q":
                System.out.println(card + " Value is; " + 10);
                break;
            case "K":
                System.out.println(card + " Value is; " + 10);
                break;
            case "A":
                System.out.println(card + " Value is; " + 11);
                break;*/
    }

    public static int getVal2(String card) {
        if (!card.equals("J") && !card.equals("K") && !card.equals("Q")) {
            if (card.equals("A")) {
                System.out.println("Do you want to enter 1 or 11");
                int val = sc.nextInt();
                return val;
            } else return Integer.parseInt(card);
        } else return Integer.parseInt(card);
    }

}






