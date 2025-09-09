import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double purchasePrice;
        double SALES_TAX = 0.05;
        double totalPrice;

        purchasePrice = scan.nextDouble();
        totalPrice = (purchasePrice * SALES_TAX) + purchasePrice;

        System.out.println("The total price of your purchase with a 5% sales tax is $" + totalPrice);
    }
}
