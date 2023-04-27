package month11.week02.day02;

public class Solution1 {
    public int maxProfit(int[] prices,int day) {
        int minPrices=Integer.MIN_VALUE;
        int i=day;
        int max=prices[i];
        for (i=day;i<prices.length;i++){
            if(max<prices[i]){
                max=prices[i];
            }
        }
        return max-prices[day];
    }
    public static void main(String[] args) {
        int prices[]=new int[]{7,1,5,3,6,4};
        int value=new Solution1().maxProfit(prices,2);
        System.out.println(value);
    }
}
