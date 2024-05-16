import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coin {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5}; // Types of coins available
        int amount = 5; // Total amount

        int ways = coinChangeWays(coins, amount);
        System.out.println("Number of ways to make change: " + ways);
        System.out.println("Permutations:");
        printPermutations(coinChangePermutations(coins, amount));
    }

    public static int coinChangeWays(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }

    public static List<List<Integer>> coinChangePermutations(int[] coins, int amount) {
        List<List<Integer>> permutations = new ArrayList<>();
        findPermutations(coins, amount, new ArrayList<>(), permutations);
        return permutations;
    }

    private static void findPermutations(int[] coins, int amount, List<Integer> current, List<List<Integer>> permutations) {
        if (amount == 0) {
            permutations.add(new ArrayList<>(current));
            return;
        }

        for (int coin : coins) {
            if (amount - coin >= 0) {
                current.add(coin);
                findPermutations(coins, amount - coin, current, permutations);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void printPermutations(List<List<Integer>> permutations) {
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
