import java.util.*;

public class GameWinner {
    public static int countWinners(int n, int[][] pick) {
        int winners = 0;

        
        HashMap<Integer, HashMap<Integer, Integer>> playerColorMap = new HashMap<>();

       
        for (int i = 0; i < n; i++) {
            playerColorMap.put(i, new HashMap<>());
        }

        
        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];

            HashMap<Integer, Integer> colorCount = playerColorMap.get(player);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }

        
        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> colorCount = playerColorMap.get(i);

           
            for (int count : colorCount.values()) {
                if (count >= i + 1) {
                    winners++;
                    break; 
                }
            }
        }

        return winners;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the length of pick:");
        int m = sc.nextInt();
        int[][] pick = new int[m][2];
        System.out.println("Enter the picks (player and color): ");
        for (int i = 0; i < m; i++) {
            System.out.print("Pick " + (i + 1) + " (player color): ");
            pick[i][0] = sc.nextInt(); 
            pick[i][1] = sc.nextInt(); 
        }

        
        int result = countWinners(n, pick);
        System.out.println("Number of players who win: " + result);

        sc.close();
    }
}

