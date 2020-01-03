public class BestTimetoBuyandSellStockII {
  public static void main(String[] args) {
    BestTimetoBuyandSellStockII o = new BestTimetoBuyandSellStockII();
    System.out.println(o.maxProfit(new int[]{7,1,5,3,6,4}));
  }

  public int maxProfit(int[] prices) {
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      profit += Math.max(0, prices[i] - prices[i - 1]);
    }
    return profit;
  }
}
