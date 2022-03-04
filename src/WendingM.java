import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WendingM {

    /**
     * Write a program to design Vending Machine using java with all possible tests
     * <p>
     * Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter - Done.
     * <p>
     * Allow user to select products Coke(25), Pepsi(35), Soda(45) - Done
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
    static int price = cokePrice;
    static int totalIn;
    static boolean myBreak;
    static List<Integer> coins = new ArrayList<>();
    static List<Integer> totalCollectionInTheMachine = new ArrayList<>();

    public static void main(String[] args) {
        acceptableCoins();
        selectProductAndAssignPrice();
    }

    public static int selectProductAndAssignPrice() {
        myBreak = true;

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

    public static int acceptableCoins() {
        boolean myBreak = true;
        while (myBreak) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter coins from 1, 5, 10 and 25 or 0 to stop  : ");
            int coin = scanner.nextInt();
            if (coin == 1 || coin == 5 || coin == 10 || coin == 25) {
                coins.add(coin);
            } else if (coin == 0) {
                for(int a: coins)
                    totalIn += a;
                if(totalIn >=price) {
                    System.out.println("The total amount collected is : " + totalIn + "p");
                    System.out.println("Hurray! you have enough money, choose your drink now!");
                } else {
                    System.out.println("Insufficient funds, process has ended");
                }
                myBreak = false;
            } else {
                System.out.println("Invalid coin, please try again");
            }
        }
       return totalIn;
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
