

// greedy Q3: Indian Coins
// TC: O(n log n + total coins used)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Question3 {
  

  public static void main(String[] args) {
    Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

    Arrays.sort(coins, Comparator.reverseOrder());

    int amount =1999;
    int countOfCoins = 0;

    ArrayList<Integer> ans = new ArrayList<>();

    for(int i = 0; i < coins.length; i++) {
      if (coins[i] <= amount) {
        while (coins[i] <= amount) {
          countOfCoins++;
          ans.add(coins[i]);
          amount -= coins[i];
        }
      }
    }

    System.out.println("Total (min) coins used = " + countOfCoins);
    
    for(int i = 0; i < ans.size(); i++) {
      System.out.println(ans.get(i) + " ");
    }
    

  }
}
