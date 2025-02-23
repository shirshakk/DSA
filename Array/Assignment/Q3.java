package Array.Assignment;
import java.util.*;
public class Q3 {
    public static int MaxProfit(int []prices){
        int buy=Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int profit=prices[i]-buy;
                MaxProfit=Math.max(profit, MaxProfit);
            }
            else{
                buy=prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of days:");
        int days=sc.nextInt();
        int []prices=new int[days];
        for(int i=0;i<days;i++){
            System.out.print("Enter the stock price:");
            prices[i]=sc.nextInt();
        }
        int result=MaxProfit(prices);
        System.out.println("Maximum Profit:"+result);
        sc.close();
    }
}
