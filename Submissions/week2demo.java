import java.util.*;

public class week2demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String:");
        String s1= sc.nextLine();
        System.out.println("Enter the Second String:");
        String s2= sc.nextLine();

        System.out.println("Concatinated String:"+(s1.concat(s2)));

        sc.close();
    } 
}
