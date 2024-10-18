import java.util.Scanner;
import java.util.Stack;

public class week3demo {
    public static int findString(String s) {
        Stack<Character> st = new Stack<>();
    
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && ((ch == 'B' && st.peek() == 'A') || (ch == 'D' && st.peek() == 'C'))) {
                st.pop();  
            } else {
                st.push(ch);  
            }
        }
        return st.size(); 
    }
        public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
           System.out.println("Enter the String:");
           String n=sc.next();  
           System.out.println("The requiered answer:"+findString(n));  
           
           sc.close();
    }
}
