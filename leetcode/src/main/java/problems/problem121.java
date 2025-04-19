package problems;

public class problem121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfix = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            int currentProfix = prices[i] - min;
            if (currentProfix > maxProfix) {
                maxProfix = currentProfix;
            }
        }
        return maxProfix;
    }
}
