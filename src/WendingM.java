import java.util.Scanner;

public class WendingM {

    /**
     * Write a program to design Vending Machine using java with all possible tests
     * <p>
     * Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.
     * <p>
     * Allow user to select products Coke(25), Pepsi(35), Soda(45)
     * <p>
     * Allow user to take refund by cancelling the request.
     * <p>
     * Return selected product and remaining change if any.
     * <p>
     * Allow reset operation for vending machine supplier.
     */

    static int cokePrice = 25;
    static int pepsiPrice = 35;
    static int sodaPrice = 45;
    static String coke;
    static String pepsi;
    static String soda;
    static int price;
    static int totalIn;
    static boolean myBreak = true;

    public static void main(String[] args) {
        selectProductAndAssignPrice();
    }

    public static int selectProductAndAssignPrice() {
        boolean myBreak = true;

        while (myBreak) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please choose a drink from coke, pepsi or soda : ");
            String selection = scanner.nextLine();
            if (selection.equalsIgnoreCase("coke")) {
                price = cokePrice;
                System.out.println("The price of drink is : " + price + "p");
                myBreak = false;
            } else if (selection.equalsIgnoreCase("pepsi")) {
                price = pepsiPrice;
                System.out.println("The price of drink is : " + price + "p");
                myBreak = false;
            } else if (selection.equalsIgnoreCase("soda")) {
                price = sodaPrice;
                System.out.println("The price of drink is : " + price + "p");
                myBreak = false;
            } else {
                System.out.println("Invalid selection, please try again");
            }
        }
        return price;
    }

    public static void purchase(int coins) {

        if (coins == 1 || coins == 5 || coins == 10 || coins == 25) {

        }


    }

    /**
     *  boolean myBreak = true;
     *
     *         while (myBreak) {
     *             Scanner scanner = new Scanner(System.in);
     *             System.out.println("Please choose a drink from coke, pepsi or soda : ");
     *             String selection = scanner.nextLine();
     *             if (selection.equalsIgnoreCase("coke")) {
     *                 price = cokePrice;
     *                 System.out.println("The price of drink is : " + price + "p");
     *                 myBreak = false;
     *             } else if (selection.equalsIgnoreCase("pepsi")) {
     *                 price = pepsiPrice;
     *                 System.out.println("The price of drink is : " + price + "p");
     *                 myBreak = false;
     *             } else if (selection.equalsIgnoreCase("soda")) {
     *                 price = sodaPrice;
     *                 System.out.println("The price of drink is : " + price + "p");
     *                 myBreak = false;
     *             } else {
     *                 System.out.println("Invalid selection, please try again");
     *             }
     *         }
     *         return price;
     */


}
