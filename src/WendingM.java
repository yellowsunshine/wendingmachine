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
     * Return selected product and remaining change if any - Done.
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
    static int changeAmount;
    static int refund;
    static String refundConsent;
    static String drinkSelection;
    static int forceRefund;

    public static void main(String[] args) {
        userSelectsProductAndAssignsPrice();

    }

    public static int userPutsAcceptableCoinsIn() {
        boolean myBreak = true;
        while (myBreak) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter coins from 1, 5, 10 and 25 or 0 to stop  : ");
            int coin = scanner.nextInt();
            if (coin == 1 || coin == 5 || coin == 10 || coin == 25) {
                coins.add(coin);
            } else if (coin == 0) {
                for (int a : coins)
                    totalIn += a;
                if (totalIn >= price) {
                    System.out.println("The total amount collected is : " + totalIn + "p");
                    System.out.println("Hurray! you have enough money, choose your drink now!");
                } else {
                    System.out.println("Insufficient funds, process has ended");
                    myBreak = false;
                }
                myBreak = false;
            } else {
                System.out.println("Invalid coin, please try again");
            }
        }
        return totalIn;
    }

    public static int userSelectsProductAndAssignsPrice() {
        userPutsAcceptableCoinsIn();
        if (totalIn >= 25) {
            myBreak = true;
            while (myBreak) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please choose a drink from coke, pepsi or soda : ");
                String selection = scanner.nextLine();
                if (selection.equalsIgnoreCase("coke")) {
                    price = cokePrice;
                    if (totalIn < price) {
                        forceRefund = totalIn;
                        totalIn = 0;
                        System.out.println("You have paid insufficient funds for this transaction");
                        System.out.println("Your refund is :" + forceRefund + "p");
                    } else {
                        System.out.println("You will get a can of coke");
                        drinkSelection = "coke";
                        System.out.println("The price of drink is : " + price + "p");
                        userCancelsTransactionAndGetsRefund();
                    }
                    myBreak = false;
                } else if (selection.equalsIgnoreCase("pepsi")) {
                    price = pepsiPrice;
                    if (totalIn < price) {
                        forceRefund = totalIn;
                        totalIn = 0;
                        System.out.println("You have paid insufficient funds for this transaction");
                        System.out.println("Your refund is :" + forceRefund + "p");
                    } else {
                        System.out.println("You will get a can of pepsi");
                        drinkSelection = "pepsi";
                        System.out.println("The price of drink is : " + price + "p");
                        userCancelsTransactionAndGetsRefund();
                    }
                        myBreak = false;
                    } else if (selection.equalsIgnoreCase("soda")) {
                        price = sodaPrice;
                    if (totalIn < price) {
                        forceRefund = totalIn;
                        totalIn = 0;
                        System.out.println("You have paid insufficient funds for this transaction");
                        System.out.println("Your refund is :" + forceRefund + "p");
                    } else {
                        System.out.println("You will get a can of soda");
                        drinkSelection = "soda";
                        System.out.println("The price of drink is : " + price + "p");
                        userCancelsTransactionAndGetsRefund();
                    }
                        myBreak = false;
                    } else {
                        System.out.println("Invalid selection, please try again");

                    }
                    //userCancelsTransactionAndGetsRefund();
                }
            }
            return price;

        }

        public static int calculateAndPayBackChange () {

            changeAmount = totalIn - price;
            if (totalIn >= price) {
                System.out.println("The change payable to the user is: " + changeAmount + "p");
            } else {

            }

            return changeAmount;
        }

        public static int userCancelsTransactionAndGetsRefund () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Would you like a refund Yes/No");
            refundConsent = scanner.nextLine();
            if (refundConsent.equalsIgnoreCase("yes")) {
                refund = totalIn;
                System.out.println(refund + "p is being refunded due to cancelled transaction");
            } else {
                System.out.println("Transaction continued");
                calculateAndPayBackChange();
                System.out.println("You will get a can of " + drinkSelection);
            }

            return refund;

        }

//        public static int forceRefund () {
//            if (totalIn < price) {
//                forceRefund = totalIn;
//                totalIn = 0;
//                System.out.println("You have paid insufficient funds for this transaction");
//                System.out.println("Your refund is :" + forceRefund() + "p");
//            } else {
//
//                System.out.println("Transaction is being processed");
//            }
//            return forceRefund;
//        }


    }
