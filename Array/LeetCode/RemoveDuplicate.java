package Array.LeetCode;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        int j=0;
        for(int i=1;i<nums.length;i++){
            while(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        System.out.println(j);
    }
}
