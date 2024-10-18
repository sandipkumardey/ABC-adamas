import java.util.Scanner;

public class week3b {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Conversion Menu:");
        System.out.println("1. Length Conversion (meters to feet)");
        System.out.println("2. Weight Conversion (kilograms to pounds)");
        System.out.println("3. Temperature Conversion (Celsius to Fahrenheit)");
        System.out.print("Choose an option (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: 
                System.out.print("Enter the length in meters: ");
                double meters = scanner.nextDouble();
                double feet = metersToFeet(meters);
                System.out.println(meters + " meters = " + feet + " feet");
                break;
            case 2: 
                System.out.print("Enter the weight in kilograms: ");
                double kilograms = scanner.nextDouble();
                double pounds = kilogramsToPounds(kilograms);
                System.out.println(kilograms + " kilograms = " + pounds + " pounds");
                break;
            case 3: 
                System.out.print("Enter the temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
                break;
            default:
                System.out.println("Invalid choice! Please choose a valid option.");
        }
        scanner.close();
    }

   
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
