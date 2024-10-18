import java.util.*;
public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        if(isLeapyear(year)){
            System.out.println("It is a leap year.");
        }
        else{
            System.out.println("Not a leap year.");
        }
        sc.close();
    }
    public static boolean isLeapyear(int year) {
        if (year%4==0){
            if(year%100==0){
                return year%400==0;
            }
            else{
                return true;
            }

        }
        else{
            return false;
        }
    }
}
