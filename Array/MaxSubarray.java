package Array;
public class MaxSubarray {
    public static int Max(int number[]){
        int MaxSum=Integer.MIN_VALUE;
        int CurrSum=0;
        for(int i=0;i<number.length;i++){
            CurrSum+=number[i];
            if(CurrSum>0){
                MaxSum=Math.max(CurrSum, MaxSum);
            }
            else{
                CurrSum=0;
            }
        }
        return MaxSum;

    } 
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        int ans=Max(number);
        System.out.print(ans);
    }
}
