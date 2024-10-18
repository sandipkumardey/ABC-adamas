import java.util.*;
public class demo4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose between options:");
        System.out.println("1)Fahrenheit to Celsius.");
        System.out.println("2) Celsius to Fahrenheit.");
        
        System.out.println("Enter choice:");
        int choose=sc.nextInt();

        switch (choose) {
         case 1:
         System.out.print("Enter temperature in Fahrenheit: ");
             double fahrenheit = sc.nextDouble();
             double celsius = (fahrenheit - 32) * 5/9;
             System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
             break;
         
         case 2:
           System.out.print("Enter temperature in Celsius: ");
             celsius = sc.nextDouble();
            fahrenheit = (celsius * 9/5) + 32;
             System.out.println(celsius+"°C is equal to" + fahrenheit+ "°F");
             break;
         default:
             System.out.println("Invalid choice.");
        }

        sc.close();
 }    
}
