import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double fallCost;
        double winterCost;
        double springCost;
        double summerCost;
        double yearlyTotal;

        System.out.println("Please enter your maintenance costs for each season -");

        System.out.println("Fall:");
        fallCost = scan.nextDouble();
        System.out.println("Winter:");
        winterCost = scan.nextDouble();
        System.out.println("Spring:");
        springCost = scan.nextDouble();
        System.out.println("Summer:");
        summerCost = scan.nextDouble();

        yearlyTotal = fallCost + winterCost + springCost + summerCost;

        System.out.println("Your yearly cost is $" + yearlyTotal);
    }
}
