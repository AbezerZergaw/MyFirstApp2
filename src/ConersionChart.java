public class ConersionChart {

    public static void main(String[] args) {


        double millimeter = 25.4;
        double sum;



        System.out.println("Conversion chart for loop");
        for(int x=1; x<=15; x++){

             sum = x *millimeter;
            System.out.println(x + " Inche ="+ (int) sum);

        }
        int x = 1;

        System.out.println("Conversion chart for while");
        while (x <=15) {

            sum = x * millimeter;
            System.out.println(x + " Inche ="+ (int) sum);
            x++;
        }
        System.out.println("Conversion chart for do while");

        x=1;
        do {
            sum = x * millimeter;
            System.out.println(x + " Inche ="+ (int) sum);
            x++;
        } while (x <=15);


    }
}
