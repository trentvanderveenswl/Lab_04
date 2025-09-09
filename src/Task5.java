import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int temperatureFahrenheit;
        int temperatureCelsius;

        System.out.println("Enter the temperature in degrees (F):");

        temperatureFahrenheit = scan.nextInt();

        temperatureCelsius = (temperatureFahrenheit - 32) * 5/9;
        System.out.println("The temperature in celsius is: " + temperatureCelsius);
    }
}
