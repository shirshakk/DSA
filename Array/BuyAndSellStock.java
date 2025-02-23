package Array;

public class BuyAndSellStock {
    public static int Stock(int []prices){
        int buy=Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int profit=prices[i]-buy;
                MaxProfit=Math.max(MaxProfit, profit);
            }
            else{
                buy=prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int result=Stock(prices);
        System.out.println(result);
    }
}