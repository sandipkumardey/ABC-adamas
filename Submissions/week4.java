import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
public class week4 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); 
        ListNode current = dummyHead;
        int carry = 0; 
        
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0; 
            int y = (l2 != null) ? l2.val : 0; 
            int sum = carry + x + y; 
            carry = sum / 10; 
            current.next = new ListNode(sum % 10); 
            current = current.next; 

            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        
        return dummyHead.next;
    }


    public static ListNode createLinkedList(int n, Scanner scanner) {
        if (n == 0) {
            return null; 
        }

        System.out.print("Enter the digits for the linked list: ");
        ListNode head = new ListNode(scanner.nextInt()); 
        ListNode current = head;

        for (int i = 1; i < n; i++) {
            current.next = new ListNode(scanner.nextInt()); 
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of digits in the first number: ");
        int n1 = scanner.nextInt();
        ListNode l1 = createLinkedList(n1, scanner);

        
        System.out.print("Enter the number of digits in the second number: ");
        int n2 = scanner.nextInt();
        ListNode l2 = createLinkedList(n2, scanner);

        
        week4  solution = new week4();
        ListNode result = solution.addTwoNumbers(l1, l2);

        
        System.out.print("Sum: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
    }
}
